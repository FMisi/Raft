package raft;

import java.awt.*;
import gameObjects.Player;

public class Handler {
    
    // Milyen szinu a player es hol van:
    public static Player playerOne = new Player(Color.WHITE, 19, 15);
    // capa lehet egy playerTwo mondjuk...
    public static int cselekvesek = 990;
    public static int ehseg = 100;
    public static int szomjusag = 100;
    
    public static void tick(){
        if(cselekvesek==1000){
            Window.clip.stop();
            Window.clip2.start();
        }
        playerOne.tick();
    }
    
    public static void render(Graphics g){
        playerOne.render(g);
        // cselekvesek
        Graphics2D g2 = (Graphics2D)g;
        // win
        Graphics2D g3 = (Graphics2D)g;
        // ehseg
        Graphics2D g4 = (Graphics2D)g;
        // szomjusag
        Graphics2D g5 = (Graphics2D)g;
        // lose... meg nincs
        g2.setFont(new Font("Arial", 14, 14));
        g2.drawString("Cselekvések: "+cselekvesek + "", 7, 14);
        g3.setFont(new Font("Arial", 38, 38));
        if(cselekvesek>=1000){
        g3.drawString("TÚLÉLTED! GYŐZTÉL!:D", 171, 101);
        }
        g4.setFont(new Font("Arial", 14, 14));
        g4.drawString("Éhség: "+ehseg + "", 7, 34);
        g4.setFont(new Font("Arial", 14, 14));
        g4.drawString("Szomjúság: "+szomjusag + "", 7, 54);
    }
    
}
