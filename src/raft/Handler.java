package raft;

import java.awt.*;
import gameObjects.Player;

public class Handler {
    
    // Milyen szinu a player es hol van:
    public static Player playerOne = new Player(Color.WHITE, 19, 15);
    // capa lehet egy playerTwo mondjuk...
    
    public static void tick(){
        playerOne.tick();
    }
    
    public static void render(Graphics g){
        playerOne.render(g);
    }
    
}
