package raft;

import java.awt.*;
import gameObjects.Player;

public class Handler {
    
    // Milyen szinu a player es hol van:
    public static Player playerOne = new Player(Color.WHITE, 19, 15);
    // capa lehet egy playerTwo mondjuk...
    public static int cselekvesek = 990;
    
    public static void tick(){
        playerOne.tick();
    }
    
    public static void render(Graphics g){
        playerOne.render(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(new Font("Arial", 12, 12));
        g2.drawString("Cselekvések: "+cselekvesek + "", 7, 14);
    }
    
}
