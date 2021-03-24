//JB Java a new game series
package raft;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Raft extends Canvas implements Runnable{

    private Thread thread;
    private boolean running = false;
    
    public Raft() {
        
        new Window(806, 600, "Raft", this);
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
    
    // rendereljuk a vonalakat
    private void render(){
        BufferStrategy bs = getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        
        Graphics g = bs.getDrawGraphics();
        Graphics g2 = bs.getDrawGraphics();
        
        g.setColor(new Color(0,41,69));
        g.fillRect(0, 0, 806, 600);        
        drawLines(g);
        
        g2.setColor(new Color(133,94,66));
        g2.fillRect(380, 286, 40, 38);
        drawLines(g2);
        
        Handler.render(g);
        
        g.dispose();
        g2.dispose();
        bs.show();
    }
    
    // grid megrajzol
    private void drawLines(Graphics g){
        g.setColor(Color.BLACK);
        int x = 0;
        int y = 0;
        int xmax = 800;
        int ymax = 600;
        int i = 0;
        // random, hard code-olt, nagy, de nem tul nagy szam
        // a while ciklusban, hogy biztos meglegyen rajzolva az a
        // damn vonal
        while (i < 71){
            g.drawLine(x +(i * 20), y, i * 20, ymax);
            i++;
        }
        i = 0;
        while (i < 66){
            g.drawLine(x, y + (i * 19), xmax, i * 19);
            i++;
        }
    }

    private void tick(){
        Handler.tick();
        //EhsegEsSzomjusag.tick();  <--- Ezt meg nem talaltam ki hogyan kene...
    }
    
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
