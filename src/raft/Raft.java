//JB Java a new game series
package raft;

import java.awt.*;
import java.awt.image.*;

public class Raft extends Canvas implements Runnable{

    private Thread thread;
    private boolean running = false;
    
    public Raft() {
        
        
        new Window(812, 606, "Raft v0.98", this);
        addKeyListener(new Keys());
    }
    
    public synchronized void start(){
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
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
    
    private void stop(){
        try{
            running = false;
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    // rendereljuk a grafikus elemeket
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
    
    // grid megrajzol
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

    private void tick(){
        Handler.tick();
    }
    
    public static float clamp(float var, float min, float max){
        if(var > max){
            Handler.cselekvesek--;
            Handler.ehseg++;
            Handler.szomjusag++;
            return max;
        } else if(var < min){
            Handler.cselekvesek--;
            Handler.ehseg++;
            Handler.szomjusag++;
            return min;
        } else {
            return var;
        }
    }
    
}
