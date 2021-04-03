package gameObjects;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import other.Storage;
import raft.Handler;

public class Player extends JPanel{
    
    public Storage<Integer, Integer> tile = new Storage<Integer, Integer>();
    public Color c;
    public static int playerx;
    public static int playery;
    public static int initd = 0;
    public static int initl = 0;
    public static int inith = 0;
    public static int[] kox = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320,
        340, 360, 380, 400, 420, 440, 460, 480, 500, 520, 540, 560, 580, 600, 620, 640, 660, 680,
        700, 720, 740, 760, 780};
    // koy 19 tobbszorosei vagy milyei, nem 20e!!!
    public static int[] koy = {0, 19, 38, 57, 76, 95, 114, 133, 152, 171, 190, 209, 228, 247, 266, 285, 304,
        323, 342, 361, 380, 399, 418, 437, 456, 475, 494, 513, 532};
    
    Random random = new Random();
    
    public static int le = koy[0];
    
    int randx = kox[random.nextInt(40)];
    int randy = koy[random.nextInt(28)];
    
    int randxd = kox[random.nextInt(40)];
    public static int nemrandxd;
    int randxl = kox[random.nextInt(40)];
    public static int nemrandxl;
    int randxh = kox[random.nextInt(40)];
    public static int nemrandxh;
    
    int randxd2 = kox[random.nextInt(40)];
    public static int nemrandxd2;
    int randxl2 = kox[random.nextInt(40)];
    public static int nemrandxl2;
    int randxh2 = kox[random.nextInt(40)];
    public static int nemrandxh2;
    
    public Player(Color c, int x, int y){
        tile.first = x;
        tile.second = y;
        this.c = c;
    }
    
    public void tick(){
        playerx = tile.first *20;
        playery = tile.second *19;
        tile.second = (int)raft.Raft.clamp(tile.second, 0, 27);
        tile.first = (int)raft.Raft.clamp(tile.first, 0, 39);
    }
    
    public void render(Graphics g){
        g.setColor(c);
        super.paintComponent(g);
        ImageIcon karakterunk = new ImageIcon("assets\\karakterunk.png");
        ImageIcon deszka = new ImageIcon("assets\\deszka.png");
        ImageIcon level = new ImageIcon("assets\\level.png");
        ImageIcon hulladek = new ImageIcon("assets\\hulladek.png");
        ImageIcon deszka2 = new ImageIcon("assets\\deszka.png");
        ImageIcon level2 = new ImageIcon("assets\\level.png");
        ImageIcon hulladek2 = new ImageIcon("assets\\hulladek.png");
        //g.drawLine((tile.first *20) + 1, (tile.second * 19) + 1, 20, 19);
        // (tile.first *20)-nal +-20-at jelent egy tile-nyi terulet
        // (tile.second *19)-nal +-19-at jelent egy tile-nyi terulet
        karakterunk.paintIcon(this, g, playerx, playery);
        switch(Handler.cselekvesek){
            case 0:
                switch(initd){
                    case 0:
                        nemrandxd = randxd;
                        deszka.paintIcon(this, g, randxd, le);
                    break;
                    case 1:
                    break;
                }
                switch(initl){
                    case 0:
                        nemrandxl = randxl;
                        level.paintIcon(this, g, randxl, le);
                    break;
                    case 1:
                    break;
                }
                switch(inith){
                    case 0:
                        nemrandxh = randxh;
                        hulladek.paintIcon(this, g, randxh, le);
                    break;
                    case 1:
                    break;
                }
            break;
            default:
                switch(initd){
                    case 0:
                        nemrandxd = randxd;
                        deszka.paintIcon(this, g, randxd, le);
                        nemrandxd2 = randxd2;
                        deszka2.paintIcon(this, g, randxd2, le-19);
                    break;
                    case 1:
                    break;
                }
                switch(initl){
                    case 0:
                        nemrandxl = randxl;
                        level.paintIcon(this, g, randxl, le);
                        nemrandxl2 = randxl2;
                        level2.paintIcon(this, g, randxl2, le-19);
                    break;
                    case 1:
                    break;
                }
                switch(inith){
                    case 0:
                        nemrandxh = randxh;
                        hulladek.paintIcon(this, g, randxh, le);
                        nemrandxh2 = randxh2;
                        hulladek2.paintIcon(this, g, randxh2, le-19);
                    break;
                    case 1:
                    break;
                }
            break;
        }
    }
}
