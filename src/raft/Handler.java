package raft;

import java.awt.*;
import gameObjects.Player;

public class Handler {
    
    // Milyen szinu a player es hol van:
    public static Player playerOne = new Player(Color.WHITE, 19, 15);
    // capa lehet egy playerTwo mondjuk...
    public static Player deszkap = new Player(Color.WHITE, 0, 0);
    public static Player levelp = new Player(Color.WHITE, 0, 0);
    public static Player hulladekp = new Player(Color.WHITE, 0, 0);
    public static int cselekvesek = 0;
    public static int ehseg = 100;
    public static int szomjusag = 100;
    public static int deszka = 0;
    public static int level = 0;
    public static int hulladek = 0;
    
    
    public static void tick(){
        if(cselekvesek==1000 || cselekvesek > 1000){
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
        // lose
        
        // deszka
         Graphics2D g7 = (Graphics2D)g;
        // level
         Graphics2D g8 = (Graphics2D)g;
        // hulladek
         Graphics2D g9 = (Graphics2D)g;
        
        g2.setFont(new Font("Arial", 14, 14));
        g2.drawString("Cselekvések: "+cselekvesek + "", 7, 14);
        g3.setFont(new Font("Arial", 38, 38));
        if(cselekvesek>=1000){
            g3.drawString("TÚLÉLTED! GYŐZTÉL!:D", 171, 101);
        }
        g4.setFont(new Font("Arial", 14, 14));
        g4.drawString("Éhség: "+ehseg + "", 7, 34);
        g5.setFont(new Font("Arial", 14, 14));
        g5.drawString("Szomjúság: "+szomjusag + "", 7, 54);
        if((ehseg<=0) || (szomjusag<=0)){
            Vesztettel(g);
        }
        g7.setFont(new Font("Arial", 14, 14));
        g7.drawString("Deszka: "+deszka + "", 7, 74);
        g8.setFont(new Font("Arial", 14, 14));
        g8.drawString("Levél: "+level + "", 7, 94);
        g9.setFont(new Font("Arial", 14, 14));
        g9.drawString("Hulladék: "+hulladek + "", 7, 114);
    }
    
    private static void Vesztettel(Graphics g){
        Window.clip.stop();
        Window.clip3.start();
        Graphics2D g6 = (Graphics2D) g;
        g6.setFont(new Font("Arial", 38, 38));
        g6.drawString("VESZTETTÉL!:-(", 231, 101);
    }
}
