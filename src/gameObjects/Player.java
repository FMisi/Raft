package gameObjects;

import java.awt.*;
import other.Storage;

public class Player {
    
    public Storage<Integer, Integer> tile = new Storage<Integer, Integer>();
    public Color c;
    
    public Player(Color c, int x, int y){
        tile.first = x;
        tile.second = y;
        this.c = c;
    }
    
    public void tick(){
        tile.second = (int)raft.Raft.clamp(tile.second, 0, 29);
        tile.first = (int)raft.Raft.clamp(tile.first, 0, 39);
    }
    
    public void render(Graphics g){
        g.setColor(c);
        g.fillRect((tile.first *20) + 1, (tile.second * 19) + 1, 20, 19);
    }
    
}
