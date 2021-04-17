package gameObjects;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import other.Storage;
import raft.Handler;
import raft.Keys;

public class Player extends JPanel{
    
    public Storage<Integer, Integer> tile = new Storage<Integer, Integer>();
    public Color c;
    public static int playerx;
    public static int playery;
    
    public static int capax;
    public static int capay;
    public static int cx = 20;
    public static int cy = 19;
    
    //<editor-fold defaultstate="collapsed" desc="init valtozok">
    public static int initd = 0;
    public static int initl = 0;
    public static int inith = 0;
    public static int initho = 0;
    
    public static int initd2 = 0;
    public static int initl2 = 0;
    public static int inith2 = 0;
    public static int initho2 = 0;
    
    public static int initd3 = 0;
    public static int initl3 = 0;
    public static int inith3 = 0;
    public static int initho3 = 0;
    
    public static int initd4 = 0;
    public static int initl4 = 0;
    public static int inith4 = 0;
    public static int initho4 = 0;
    //</editor-fold>
    
    public static int[] kox = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320,
        340, 360, 380, 400, 420, 440, 460, 480, 500, 520, 540, 560, 580, 600, 620, 640, 660, 680,
        700, 720, 740, 760, 780};
    // koy 19 tobbszorosei vagy milyei, nem 20e!!!
    public static int[] koy = {0, 19, 38, 57, 76, 95, 114, 133, 152, 171, 190, 209, 228, 247, 266, 285, 304,
        323, 342, 361, 380, 399, 418, 437, 456, 475, 494, 513, 532};
    
    Random random = new Random();
    
    //<editor-fold defaultstate="collapsed" desc="le valtozok">
    public static int le = koy[0];
    public static int le2 = 0;
    public static int le3 = 0;
    public static int le4 = 0;
    public static int le5 = 0;
    public static int le6 = 0;
    public static int le7 = 0;
    public static int le8 = 0;
    public static int le9 = 0;
    public static int le10 = 0;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="rand valtozok">
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
    int randxho2 = kox[random.nextInt(40)];
    public static int nemrandxho2;
    
    int randxd3 = kox[random.nextInt(40)];
    public static int nemrandxd3;
    int randxl3 = kox[random.nextInt(40)];
    public static int nemrandxl3;
    int randxh3 = kox[random.nextInt(40)];
    public static int nemrandxh3;
    int randxho3 = kox[random.nextInt(40)];
    public static int nemrandxho3;
    
    int randxd4 = kox[random.nextInt(40)];
    public static int nemrandxd4;
    int randxl4 = kox[random.nextInt(40)];
    public static int nemrandxl4;
    int randxh4 = kox[random.nextInt(40)];
    public static int nemrandxh4;
    int randxho4 = kox[random.nextInt(40)];
    public static int nemrandxho4;
    
    int[] nyersAnyagRandom = {random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1,
    random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1};
    //</editor-fold>
    
    // ez lenne a soronkenti mennyiseget beallito random ertek, de ezt nem sikerult
    // megvalositani all alone :S
    // int nyersAnyagMennyisegRandom = random.nextInt(3);
    

    
    static boolean vesztettelBool = false;
    
    public Player(Color c, int x, int y){
        tile.first = x;
        tile.second = y;
        this.c = c;
    }
    
    public void tick(){
        playerx = tile.first *20;
        playery = tile.second *19;
        capax = cx *20 -80;
        capay = cy *19;
        tile.second = (int)raft.Raft.clamp(tile.second, 0, 27);
        tile.first = (int)raft.Raft.clamp(tile.first, 0, 39);
    }
    
    public void render(Graphics g){
        
        le2 = 19*Handler.cselekvesek-19;
        le3 = 19*Handler.cselekvesek-38;
        
        if(vesztettelBool == true){
            Graphics2D vg = (Graphics2D) g;
            vg.setColor(Color.WHITE);
            vg.setFont(new Font("Arial", 38, 38));
            vg.drawString("VESZTETTÉL!:-(", 231, 101);
            Handler.cselekvesek=0;
            Handler.ehseg=0;
            Handler.szomjusag=0;
        }
        
        g.setColor(c);
        super.paintComponent(g);
        ImageIcon karakterunk = new ImageIcon("assets\\karakterunk.png");
        ImageIcon capa = new ImageIcon("assets\\capa.png");
        ImageIcon deszka = new ImageIcon("assets\\deszka.png");
        ImageIcon level = new ImageIcon("assets\\level.png");
        ImageIcon hulladek = new ImageIcon("assets\\hulladek.png");
        ImageIcon hordo = new ImageIcon("assets\\hordo.png");
        ImageIcon halo = new ImageIcon("assets\\halo.png");
        ImageIcon viztisztito = new ImageIcon("assets\\viztisztito.png");
        //g.drawLine((tile.first *20) + 1, (tile.second * 19) + 1, 20, 19);
        // (tile.first *20)-nal +-20-at jelent egy tile-nyi terulet
        // (tile.second *19)-nal +-19-at jelent egy tile-nyi terulet
        karakterunk.paintIcon(this, g, playerx, playery);
        capa.paintIcon(this, g, capax, capay);
        if(Keys.isHalobool1()==true){
            halo.paintIcon(this, g, Keys.halox, Keys.haloy);
        }
        if(Keys.isHalobool2()==true){
            halo.paintIcon(this, g, Keys.halox2, Keys.haloy2);
        }
        if(Keys.isHalobool3()==true){
            halo.paintIcon(this, g, Keys.halox3, Keys.haloy3);
        }
        if(Keys.isHalobool4()==true){
            halo.paintIcon(this, g, Keys.halox4, Keys.haloy4);
        }
        if(Keys.isHalobool5()==true){
            halo.paintIcon(this, g, Keys.halox5, Keys.haloy5);
        }
        if(Keys.isHalobool6()==true){
            halo.paintIcon(this, g, Keys.halox6, Keys.haloy6);
        }
        if(Keys.isHalobool7()==true){
            halo.paintIcon(this, g, Keys.halox7, Keys.haloy7);
        }
        if(Keys.isHalobool8()==true){
            halo.paintIcon(this, g, Keys.halox8, Keys.haloy8);
        }
        if(Keys.isHalobool9()==true){
            halo.paintIcon(this, g, Keys.halox9, Keys.haloy9);
        }
        if(Keys.isHalobool10()==true){
            halo.paintIcon(this, g, Keys.halox10, Keys.haloy10);
        }
        if(Keys.isHalobool11()==true){
            halo.paintIcon(this, g, Keys.halox11, Keys.haloy11);
        }
        if(Keys.isHalobool12()==true){
            halo.paintIcon(this, g, Keys.halox12, Keys.haloy12);
        }
        
        // Megol a capa? KEZDETE
        if((playerx==capax && playery == capay)
                ||(playerx==capax && playery-19 == capay)
                ||(playerx==capax && playery+19 == capay)
                ||(playerx-20==capax && playery == capay)
                ||(playerx+20==capax && playery == capay)){
            Vesztettel();
        }
        // Megol a capa? VEGE
        
        // Nyersanyagok rajzolasa KEZDETE
        
        //<editor-fold defaultstate="collapsed" desc="halo kezeles">
        // halo #1
        if(Keys.halox==randxd && Keys.haloy==le && initd==0){
            initd++;
            Handler.deszka++;
        }
        if(Keys.halox==randxd2 && Keys.haloy==le2 && initd2==0){
            initd2++;
            Handler.deszka++;
        }
        if(Keys.halox==randxd3 && Keys.haloy==le3 && initd3==0){
            initd3++;
            Handler.deszka++;
        }
        if(Keys.halox==randxl && Keys.haloy==le && initl==0){
            initl++;
            Handler.level++;
        }
        if(Keys.halox==randxl2 && Keys.haloy==le2 && initl2==0){
            initl2++;
            Handler.level++;
        }
        if(Keys.halox==randxl3 && Keys.haloy==le3 && inith3==0){
            initl3++;
            Handler.level++;
        }
        if(Keys.halox==randxh && Keys.haloy==le && inith==0){
            inith++;
            Handler.hulladek++;
        }
        if(Keys.halox==randxh2 && Keys.haloy==le2 && inith2==0){
            inith2++;
            Handler.hulladek++;
        }
        if(Keys.halox==randxh3 && Keys.haloy==le3 && inith3==0){
            inith3++;
            Handler.hulladek++;
        }
        
        // halo #2
        if(Keys.halox2==randxd && Keys.haloy2==le && initd==0){
            initd++;
            Handler.deszka++;
        }
        if(Keys.halox2==randxd2 && Keys.haloy2==le2 && initd2==0){
            initd2++;
            Handler.deszka++;
        }
        if(Keys.halox2==randxd3 && Keys.haloy2==le3 && initd3==0){
            initd3++;
            Handler.deszka++;
        }
        if(Keys.halox2==randxl && Keys.haloy2==le && initl==0){
            initl++;
            Handler.level++;
        }
        if(Keys.halox2==randxl2 && Keys.haloy2==le2 && initl2==0){
            initl2++;
            Handler.level++;
        }
        if(Keys.halox2==randxl3 && Keys.haloy2==le3 && inith3==0){
            initl3++;
            Handler.level++;
        }
        if(Keys.halox2==randxh && Keys.haloy2==le && inith==0){
            inith++;
            Handler.hulladek++;
        }
        if(Keys.halox2==randxh2 && Keys.haloy2==le2 && inith2==0){
            inith2++;
            Handler.hulladek++;
        }
        if(Keys.halox2==randxh3 && Keys.haloy2==le3 && inith3==0){
            inith3++;
            Handler.hulladek++;
        }
        
        // halo #3
        if(Keys.halox3==randxd && Keys.haloy3==le && initd==0){
            initd++;
            Handler.deszka++;
        }
        if(Keys.halox3==randxd2 && Keys.haloy3==le2 && initd2==0){
            initd2++;
            Handler.deszka++;
        }
        if(Keys.halox3==randxd3 && Keys.haloy3==le3 && initd3==0){
            initd3++;
            Handler.deszka++;
        }
        if(Keys.halox3==randxl && Keys.haloy3==le && initl==0){
            initl++;
            Handler.level++;
        }
        if(Keys.halox3==randxl2 && Keys.haloy3==le2 && initl2==0){
            initl2++;
            Handler.level++;
        }
        if(Keys.halox3==randxl3 && Keys.haloy3==le3 && inith3==0){
            initl3++;
            Handler.level++;
        }
        if(Keys.halox3==randxh && Keys.haloy3==le && inith==0){
            inith++;
            Handler.hulladek++;
        }
        if(Keys.halox3==randxh2 && Keys.haloy3==le2 && inith2==0){
            inith2++;
            Handler.hulladek++;
        }
        if(Keys.halox3==randxh3 && Keys.haloy3==le3 && inith3==0){
            inith3++;
            Handler.hulladek++;
        }
        
        // halo #4
        if(Keys.halox4==randxd && Keys.haloy4==le && initd==0){
            initd++;
            Handler.deszka++;
        }
        if(Keys.halox4==randxd2 && Keys.haloy4==le2 && initd2==0){
            initd2++;
            Handler.deszka++;
        }
        if(Keys.halox4==randxd3 && Keys.haloy4==le3 && initd3==0){
            initd3++;
            Handler.deszka++;
        }
        if(Keys.halox4==randxl && Keys.haloy4==le && initl==0){
            initl++;
            Handler.level++;
        }
        if(Keys.halox4==randxl2 && Keys.haloy4==le2 && initl2==0){
            initl2++;
            Handler.level++;
        }
        if(Keys.halox4==randxl3 && Keys.haloy4==le3 && inith3==0){
            initl3++;
            Handler.level++;
        }
        if(Keys.halox4==randxh && Keys.haloy4==le && inith==0){
            inith++;
            Handler.hulladek++;
        }
        if(Keys.halox4==randxh2 && Keys.haloy4==le2 && inith2==0){
            inith2++;
            Handler.hulladek++;
        }
        if(Keys.halox4==randxh3 && Keys.haloy4==le3 && inith3==0){
            inith3++;
            Handler.hulladek++;
        }
        
        // halo #5
        if(Keys.halox5==randxd && Keys.haloy5==le && initd==0){
            initd++;
            Handler.deszka++;
        }
        if(Keys.halox5==randxd2 && Keys.haloy5==le2 && initd2==0){
            initd2++;
            Handler.deszka++;
        }
        if(Keys.halox5==randxd3 && Keys.haloy5==le3 && initd3==0){
            initd3++;
            Handler.deszka++;
        }
        if(Keys.halox5==randxl && Keys.haloy5==le && initl==0){
            initl++;
            Handler.level++;
        }
        if(Keys.halox5==randxl2 && Keys.haloy5==le2 && initl2==0){
            initl2++;
            Handler.level++;
        }
        if(Keys.halox5==randxl3 && Keys.haloy5==le3 && inith3==0){
            initl3++;
            Handler.level++;
        }
        if(Keys.halox5==randxh && Keys.haloy5==le && inith==0){
            inith++;
            Handler.hulladek++;
        }
        if(Keys.halox5==randxh2 && Keys.haloy5==le2 && inith2==0){
            inith2++;
            Handler.hulladek++;
        }
        if(Keys.halox5==randxh3 && Keys.haloy5==le3 && inith3==0){
            inith3++;
            Handler.hulladek++;
        }
        
        //</editor-fold>
        
        int csk = Handler.cselekvesek;
        if(le>=532){
        }
        else{
            if(nyersAnyagRandom[0]<=32){
                nemrandxd = randxd;
                switch(initd){
                    case 0:
                        deszka.paintIcon(this, g, randxd, le);
                            break;
                        default:
                            break;
                    }
            } else if(nyersAnyagRandom[0]<=64){
                nemrandxl = randxl;
                switch(initl){
                case 0:
                    level.paintIcon(this, g, randxl, le);
                        break;
                    default:
                        break;
                }

            } else if(nyersAnyagRandom[0]<=96){
                nemrandxh = randxh;
                switch(inith){
                case 0:
                    hulladek.paintIcon(this, g, randxh, le);
                        break;
                    default:
                        break;
                }
            } else{
               nemrandxho = randxho;
                switch(initho){
                case 0:
                    hordo.paintIcon(this, g, randxho, le);
                        break;
                    default:
                        break;
                }
            }
        }
        if(csk>=1){
            if(le2>=532){} else{
                if(nyersAnyagRandom[1]<=32){
                nemrandxd2 = randxd2;
                switch(initd2){
                    case 0:
                        deszka.paintIcon(this, g, randxd2, le2);
                            break;
                        default:
                            break;
                    }
            } else if(nyersAnyagRandom[1]<=64){
                nemrandxl2 = randxl2;
                    switch(initl2){
                    case 0:
                        level.paintIcon(this, g, randxl2, le2);
                            break;
                        default:
                            break;
                    }

            } else if(nyersAnyagRandom[1]<=96){
                nemrandxh2 = randxh2;
                    switch(inith2){
                    case 0:
                        hulladek.paintIcon(this, g, randxh2, le2);
                            break;
                        default:
                            break;
                    }
            } else{
                    nemrandxho2 = randxho2;
                    switch(initho2){
                    case 0:
                        hordo.paintIcon(this, g, randxho2, le2);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if(csk>=2){
            if(le3>=532){} else{
                if(nyersAnyagRandom[2]<=32){
                nemrandxd3 = randxd3;
                switch(initd3){
                    case 0:
                        deszka.paintIcon(this, g, randxd3, le3);
                            break;
                        default:
                            break;
                    }
            } else if(nyersAnyagRandom[2]<=64){
                nemrandxl3 = randxl3;
                switch(initl3){
                case 0:
                    level.paintIcon(this, g, randxl3, le3);
                        break;
                    default:
                        break;
                }

            } else if(nyersAnyagRandom[2]<=96){
                nemrandxh3 = randxh3;
                switch(inith3){
                case 0:
                    hulladek.paintIcon(this, g, randxh3, le3);
                        break;
                    default:
                        break;
                }
            } else{
                nemrandxho3 = randxho3;
                switch(initho3){
                case 0:
                    hordo.paintIcon(this, g, randxho3, le3);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
    // Nyersanyagok rajzolasa VEGE
    private static void Vesztettel(){
        if(Handler.winbool==true){}
        else{
            raft.Window.clip.stop();
            raft.Window.clip3.start();
            vesztettelBool = true;
        }
    }

    public static int getPlayerx() {
        return playerx;
    }

    public static int getPlayery() {
        return playery;
    }
    
    
    
}
