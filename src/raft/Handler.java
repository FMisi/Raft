package raft;

import java.awt.*;
import gameObjects.Player;

public class Handler {
    
    // Milyen szinu a player es hol van:
    public static Player playerOne = new Player(Color.WHITE, 19, 15);
    
    // szamlalok
    public static int cselekvesek = 0;
    public static int ehseg = 100;
    public static int szomjusag = 100;
    public static int deszka = 930;
    public static int level = 930;
    public static int hulladek = 930;
    
    // inventory
    public static int teruletbovites = 0;
    public static int landzsa = 0;
    public static int tuzhely = 0;
    public static int viztisztito = 0;
    public static int halo = 0;
    public static int burgonya = 0;
    public static int hal = 40;
    
    public static boolean winbool = false;
    
    public static void tick(){
        if(ehseg>100){
            ehseg=100;
        }
        if(szomjusag>100){
            szomjusag=100;
        }
        
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
        // lose - g6
        
        // deszka
        Graphics2D g7 = (Graphics2D)g;
        // level
        Graphics2D g8 = (Graphics2D)g;
        // hulladek
        Graphics2D g9 = (Graphics2D)g;
         
        // terulet bovites - 2 deszka + 2 level
        Graphics2D g10 = (Graphics2D)g;
        // landzsa         - 4 deszka + 4 level + 4 hulladek
        Graphics2D g11 = (Graphics2D)g;
        // tuzhely         - 2 deszka + 4 level + 3 hulladek
        Graphics2D g12 = (Graphics2D)g;
        // viztisztito     - 2 level  + 4 hulladek
        Graphics2D g13 = (Graphics2D)g;
        // halo            - 2 deszka + 6 level
        Graphics2D g14 = (Graphics2D)g;
        
        // burgonya
        Graphics2D g15 = (Graphics2D)g;
        // hal
        Graphics2D g16 = (Graphics2D)g;  
        
        g2.setFont(new Font("Arial", 4, 14));
        g2.drawString("Cselekvések: "+cselekvesek + "", 7, 14);
        g3.setFont(new Font("Arial", 4, 38));
        
        if(cselekvesek>=1000){
            cselekvesek=1000;
            winbool=true;
            ehseg=100;
            szomjusag=100;
            g3.drawString("TÚLÉLTED! GYŐZTÉL!:D", 171, 101);
        }
        g4.setFont(new Font("Arial", 4, 14));
        g4.drawString("Éhség: "+ehseg + "", 7, 34);
        g5.setFont(new Font("Arial", 4, 14));
        g5.drawString("Szomjúság: "+szomjusag + "", 7, 54);
        if((ehseg<=0) || (szomjusag<=0)){
            cselekvesek=0;
            ehseg=0;
            szomjusag=0;
            Vesztettel(g);
        }
        
        g7.setFont(new Font("Arial", 4, 14));
        g7.drawString("Deszka: "+deszka + "", 7, 74);
        g8.setFont(new Font("Arial", 4, 14));
        g8.drawString("Levél: "+level + "", 7, 94);
        g9.setFont(new Font("Arial", 4, 14));
        g9.drawString("Hulladék: "+hulladek + "", 7, 114);
        
        g10.setColor(Color.BLACK);
        g10.setFont(new Font("Arial", 4, 14));
        g10.drawString("Területbővítés:  "+teruletbovites + "", 7, 548);
        g11.setColor(Color.BLACK);
        g11.setFont(new Font("Arial", 4, 14));
        g11.drawString("Lándzsa:  "+landzsa + "", 157, 548);
        g12.setColor(Color.BLACK);
        g12.setFont(new Font("Arial", 4, 14));
        g12.drawString("Tűzhely:  "+tuzhely + "", 307, 548);
        g13.setColor(Color.BLACK);
        g13.setFont(new Font("Arial", 4, 14));
        g13.drawString("Víztisztító:  "+viztisztito + "", 457, 548);
        g14.setColor(Color.BLACK);
        g14.setFont(new Font("Arial", 4, 14));
        g14.drawString("Háló:  "+halo + "", 607, 548);
        
        g15.setColor(Color.BLACK);
        g15.setFont(new Font("Arial", 4, 14));
        g15.drawString("Burgonya:  "+burgonya + "", 7, 564);
        
        g16.setColor(Color.BLACK);
        g16.setFont(new Font("Arial", 4, 14));
        g16.drawString("Hal:  "+hal + "", 157, 564);
    }
    
    private static void Vesztettel(Graphics g){
        if(winbool==true){
        }
        else{
            Window.clip.stop();
            Window.clip3.start();
            Graphics2D g6 = (Graphics2D) g;
            g6.setFont(new Font("Arial", 4, 38));
            g6.drawString("VESZTETTÉL!:-(", 231, 101);
        }
    }
}
