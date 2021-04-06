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
    
    public static int capax;
    public static int capay;
    public static int cx = 20;
    public static int cy = 19;
    
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
    int randxho = kox[random.nextInt(40)];
    public static int nemrandxho;
    
    int randxd2 = kox[random.nextInt(40)];
    public static int nemrandxd2;
    int randxl2 = kox[random.nextInt(40)];
    public static int nemrandxl2;
    int randxh2 = kox[random.nextInt(40)];
    public static int nemrandxh2;
    
    int nyersAnyagRandom = random.nextInt(100)+1;
    int nyersAnyagMennyisegRandom = random.nextInt(3);
    
    public Player(Color c, int x, int y){
        tile.first = x;
        tile.second = y;
        this.c = c;
    }
    
    public void tick(){
        playerx = tile.first *20;
        playery = tile.second *19;
        capax = cx *20 -60;
        capay = cy *19 -19;
        tile.second = (int)raft.Raft.clamp(tile.second, 0, 27);
        tile.first = (int)raft.Raft.clamp(tile.first, 0, 39);
    }
    
    public void render(Graphics g){
        g.setColor(c);
        super.paintComponent(g);
        System.out.println("playerx= "+playerx);
        System.out.println("playery= "+playery);
        System.out.println("capax= "+capax);
        System.out.println("capay= "+capay);
        ImageIcon karakterunk = new ImageIcon("assets\\karakterunk.png");
        ImageIcon capa = new ImageIcon("assets\\capa.png");
        ImageIcon deszka = new ImageIcon("assets\\deszka.png");
        ImageIcon level = new ImageIcon("assets\\level.png");
        ImageIcon hulladek = new ImageIcon("assets\\hulladek.png");
        ImageIcon hordo = new ImageIcon("assets\\hordo.png");
        //g.drawLine((tile.first *20) + 1, (tile.second * 19) + 1, 20, 19);
        // (tile.first *20)-nal +-20-at jelent egy tile-nyi terulet
        // (tile.second *19)-nal +-19-at jelent egy tile-nyi terulet
        karakterunk.paintIcon(this, g, playerx, playery);
        capa.paintIcon(this, g, capax, capay);
        
        if((playerx==capax && playery == capay)
                ||(playerx==capax && playery-19 == capay)
                ||(playerx==capax && playery+19 == capay)
                ||(playerx-20==capax && playery == capay)
                ||(playerx+20==capax && playery == capay)){
            Vesztettel(g);
        }
        
        if(nyersAnyagRandom<=32){
            for(int i=0; i < nyersAnyagMennyisegRandom+1; i++){
                nemrandxd = randxd;
                if(le>=532){
                }
                else{
                    deszka.paintIcon(this, g, randxd+i*20-20, le);
                }
            }
        } else if(nyersAnyagRandom<=64){
            for(int i=0; i < nyersAnyagMennyisegRandom+1; i++){
                nemrandxl = randxl;
                if(le>=532){
                }
                else{
                    level.paintIcon(this, g, randxl+i*20-20, le);
                }
            }

        } else if(nyersAnyagRandom<=96){
            for(int i=0; i < nyersAnyagMennyisegRandom+1; i++){
                nemrandxh = randxh;
                if(le>=532){
                }
                else{
                    hulladek.paintIcon(this, g, randxh+i*20-20, le);
                }
            }
        } else{
            for(int i=0; i < nyersAnyagMennyisegRandom+1; i++){
                nemrandxho = randxho;
                if(le>=532){
                }
                else{
                    hordo.paintIcon(this, g, randxho+i*20-20, le);
                }
            }
        }
    }
    
    private static void Vesztettel(Graphics g){
        raft.Window.clip.stop();
        raft.Window.clip3.start();
        Graphics2D g6 = (Graphics2D) g;
        g6.setFont(new Font("Arial", 38, 38));
        g6.drawString("VESZTETTÉL!:-(", 231, 101);
    }
    
}
