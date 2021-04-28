package raft;

import java.awt.*;
import java.awt.image.*;

/**
 * A Raft class segitsegevel peldanyosithatunk egy ablakot,<br>
 * hozzaadhatunk jatekunkhoz a billentyuzet hallgatonkat,<br>
 * megrajzolhatjuk grid-unket, es kezelhetjuk jatekallapotunkat
 * @author Felegyi Mihaly Patrik
 */
public class Raft extends Canvas implements Runnable{

    private Thread thread;
    private boolean running = false;
    
    /**
     * Egy ablak peldanyositasa, billentyuzet hallgato hozzadasa
     */
    public Raft() {
        new Window(812, 606, "Raft", this);
        addKeyListener(new Keys());
    }
    
    /**
     * szal indito eljaras
     */
    public synchronized void start(){
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    /**
     * FPS kezeles futasidoben
     */
    @Override
    public void run(){
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        
        long renderLastTime = System.nanoTime();
        double amtOfRenders = 60.0; // MAX FPS
        double renderNs = 1000000000 / amtOfRenders;
        double renderDelta = 0;
        
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                delta--;
            }
            
            now = System.nanoTime();
            renderDelta += (now - renderLastTime) / renderNs;
            renderLastTime = now;
            while(running && renderDelta >= 1){
                render();
                renderDelta--;
            }
            
            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
            }
        }
        stop();
    }
    
    /**
     * Szal megallito eljaras
     */
    private void stop(){
        try{
            running = false;
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Rendereljuk a grafikus elemeket
     */
    private void render(){
        BufferStrategy bs = getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        /* g a hatter, g2 a raft, g3 az inventory */
        Graphics g = bs.getDrawGraphics();
        Graphics g2 = bs.getDrawGraphics();
        Graphics g3 = bs.getDrawGraphics();
        
        g.setColor(new Color(0,102,173));
        g.fillRect(0, 0, 812, 606);        
        drawLines(g);
        
        g2.setColor(new Color(160,82,45));
        g2.fillRect(380, 284, 40, 38);
        drawLines(g2);
        
        g3.setColor(new Color(255,255,255));
        g3.fillRect(0, 532, 800, 38);
        drawLines(g3);

        Handler.render(g);

        g.dispose();
        g2.dispose();
        g3.dispose();
        
        bs.show();
    }
    
    /**
     * Grid-et megrajzoljuk
     */
    private void drawLines(Graphics g){
        g.setColor(Color.BLACK);
        int x = 0;
        int y = 0;
        int xmax = 812;
        int ymax = 606;
        int i = 0;

        while (i < 71){
            g.drawLine(x +(i * 20), y, i * 20, ymax-74);
            i++;
        }
        i = 0;
        while (i < 29){
            g.drawLine(x, y + (i * 19), xmax, i * 19);
            i++;
        }
    }
    /**
     * A tick eljarassal utasitasokat hajthatunk vegre notoriusan
     */
    private void tick(){
        Handler.tick();
    }
    
    /**
     * A clamp fuggveny segitsegevel elerhetjuk azt,<br>
     * hogy a jatekos ne tudjon lemenni a palyarol
     * @param var A jatekos pozicioja
     * @param min A minimum pozicio (0,0)
     * @param max A maximum pozicio (39,27)
     * @return Max-nal kisebb/egyenlo, min-nel nagyobb/egyenlo pozicio
     */
    public static float clamp(float var, float min, float max){
        if(var > max){
            return max;
        } else if(var < min){
            return min;
        } else {
            return var;
        }
    }
    
}
