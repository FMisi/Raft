package raft;

import gameObjects.Player;
import java.util.Random;
import java.awt.event.*;

public class Keys implements KeyListener{
    
    private int capaint = 0;
    
    private boolean[] keyDown = {false, false, false, false, false, false, false};
    
    private static boolean halobool1 = false;
    private static boolean halobool2 = false;
    private static boolean halobool3 = false;
    private static boolean halobool4 = false;
    private static boolean halobool5 = false;
    private static boolean halobool6 = false;
    private static boolean halobool7 = false;
    private static boolean halobool8 = false;
    private static boolean halobool9 = false;
    private static boolean halobool10 = false;
    private static boolean halobool11 = false;
    private static boolean halobool12 = false;
    
    private static boolean viztisztitobool1 = false;
    private static boolean viztisztitobool2 = false;
    private static boolean viztisztitobool3 = false;
    private static boolean viztisztitobool4 = false;
    
    //<editor-fold defaultstate="collapsed" desc="halo koordinatak">
    public static int halox;
    public static int haloy;
    public static int halox2;
    public static int haloy2;
    public static int halox3;
    public static int haloy3;
    public static int halox4;
    public static int haloy4;
    public static int halox5;
    public static int haloy5;
    public static int halox6;
    public static int haloy6;
    public static int halox7;
    public static int haloy7;
    public static int halox8;
    public static int haloy8;
    public static int halox9;
    public static int haloy9;
    public static int halox10;
    public static int haloy10;
    public static int halox11;
    public static int haloy11;
    public static int halox12;
    public static int haloy12;
    //</editor-fold>
    
    public static int viztisztitox;
    public static int viztisztitoy;
    public static int viztisztitox2;
    public static int viztisztitoy2;
    public static int viztisztitox3;
    public static int viztisztitoy3;
    public static int viztisztitox4;
    public static int viztisztitoy4;
    
    private int haloszamlalo = 0;
    private int viztisztitoszamlalo = 0;
    
    @Override
    public void keyPressed(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            if(!keyDown[0]){
                // Viztisztito counterek kezelese KEZDETE
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                if(viztisztitobool2==true){
                    Player.viztisztito_counter2++;
                }
                if(viztisztitobool3==true){
                    Player.viztisztito_counter3++;
                }
                if(viztisztitobool4==true){
                    Player.viztisztito_counter4++;
                }
                // Viztisztito counterek kezelese VEGE

                Player.le += 19;
                Handler.playerOne.tile.second--;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--; 
                // capa korkorosen mozog KEZDETE
                capamozog();
                // capa korkorosen mozog VEGE
                keyDown[0] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_A){
            if(!keyDown[1]){
                // Viztisztito counterek kezelese KEZDETE
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                if(viztisztitobool2==true){
                    Player.viztisztito_counter2++;
                }
                if(viztisztitobool3==true){
                    Player.viztisztito_counter3++;
                }
                if(viztisztitobool4==true){
                    Player.viztisztito_counter4++;
                }
                // Viztisztito counterek kezelese VEGE

                Player.le += 19;
                Handler.playerOne.tile.first--;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
                capamozog();
                // capa korkorosen mozog VEGE
                keyDown[1] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_S){
            if(!keyDown[2]){
                // Viztisztito counterek kezelese KEZDETE
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                if(viztisztitobool2==true){
                    Player.viztisztito_counter2++;
                }
                if(viztisztitobool3==true){
                    Player.viztisztito_counter3++;
                }
                if(viztisztitobool4==true){
                    Player.viztisztito_counter4++;
                }
                // Viztisztito counterek kezelese VEGE

                Player.le += 19;
                Handler.playerOne.tile.second++;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
                capamozog();
                // capa korkorosen mozog VEGE
                keyDown[2] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_D){
            if(!keyDown[3]){
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                Player.le += 19;
                Handler.playerOne.tile.first++;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
                capamozog();
                // capa korkorosen mozog VEGE
                keyDown[3] = true;
            }
        }
        
        //<editor-fold defaultstate="collapsed" desc="elemek craft-olasa">
        if(arg1.getKeyCode() == KeyEvent.VK_T){
            if(Handler.deszka>=2 && Handler.level>=2){
                Handler.teruletbovites++;
                Handler.deszka-=2;
                Handler.level-=2;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_L){
            if(Handler.deszka>=4 && Handler.level>=4 && Handler.hulladek>=4){
                Handler.landzsa++;
                Handler.deszka-=4;
                Handler.level-=4;
                Handler.hulladek-=4;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_Z){
            if(Handler.deszka>=2 && Handler.level>=4 && Handler.hulladek>=3){
                Handler.tuzhely++;
                Handler.deszka-=2;
                Handler.level-=4;
                Handler.hulladek-=3;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_V){
            if(Handler.level>=2 && Handler.hulladek>=4){
                Handler.viztisztito++;
                Handler.level-=2;
                Handler.hulladek-=4;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_H){
            if(Handler.deszka>=2 && Handler.level>=6){
                Handler.halo++;
                Handler.deszka-=2;
                Handler.level-=6;
            }
        }
        //</editor-fold>
        
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            System.out.println("Player.playerx= "+Player.playerx);
            System.out.println("Player.playery= "+Player.playery);
            if(!keyDown[4]){
                // Viztisztito counterek kezelese KEZDETE
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                if(viztisztitobool2==true){
                    Player.viztisztito_counter2++;
                }
                if(viztisztitobool3==true){
                    Player.viztisztito_counter3++;
                }
                if(viztisztitobool4==true){
                    Player.viztisztito_counter4++;
                }
                // Viztisztito counterek kezelese VEGE

                Random random = new Random();
                int randint = random.nextInt(16)+1;
                System.out.println(randint);
                
                Player.le += 19;
                
                //<editor-fold defaultstate="collapsed" desc="item pickup kezeles">
                // deszkak
                if((Player.playerx==Player.nemrandxd
                        || Player.playerx==Player.nemrandxd-20
                        || Player.playerx==Player.nemrandxd+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    if(Player.initd==0){
                    Handler.deszka++;
                    }
                    Player.initd++;
                }
                if((Player.playerx==Player.nemrandxd2
                        || Player.playerx==Player.nemrandxd2-20
                        || Player.playerx==Player.nemrandxd2+20) && (Player.le2==Player.playery+19
                        || (Player.le2==Player.playery)
                        || (Player.le2==Player.playery-19))){
                    if(Player.initd2==0){
                    Handler.deszka++;
                    }
                    Player.initd2++;
                }
                if((Player.playerx==Player.nemrandxd3
                        || Player.playerx==Player.nemrandxd3-20
                        || Player.playerx==Player.nemrandxd3+20) && (Player.le3==Player.playery+19
                        || (Player.le3==Player.playery)
                        || (Player.le3==Player.playery-19))){
                    if(Player.initd3==0){
                    Handler.deszka++;
                    }
                    Player.initd3++;
                }
                
                // levelek
                if((Player.playerx==Player.nemrandxl
                        || Player.playerx==Player.nemrandxl-20
                        || Player.playerx==Player.nemrandxl+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    if(Player.initl==0){
                    Handler.level++;
                    }
                    Player.initl++;
                }
                if((Player.playerx==Player.nemrandxl2
                        || Player.playerx==Player.nemrandxl2-20
                        || Player.playerx==Player.nemrandxl2+20) && (Player.le2==Player.playery+19
                        || (Player.le2==Player.playery)
                        || (Player.le2==Player.playery-19))){
                    if(Player.initl2==0){
                    Handler.level++;
                    }
                    Player.initl2++;
                }
                if((Player.playerx==Player.nemrandxl3
                        || Player.playerx==Player.nemrandxl3-20
                        || Player.playerx==Player.nemrandxl3+20) && (Player.le3==Player.playery+19
                        || (Player.le3==Player.playery)
                        || (Player.le3==Player.playery-19))){
                    if(Player.initl3==0){
                    Handler.level++;
                    }
                    Player.initl3++;
                }
                
                // hulladekok
                if((Player.playerx==Player.nemrandxh
                        || Player.playerx==Player.nemrandxh-20
                        || Player.playerx==Player.nemrandxh+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    if(Player.inith==0){
                    Handler.hulladek++;
                    }
                    Player.inith++;
                }
                if((Player.playerx==Player.nemrandxh2
                        || Player.playerx==Player.nemrandxh2-20
                        || Player.playerx==Player.nemrandxh2+20) && (Player.le2==Player.playery+19
                        || (Player.le2==Player.playery)
                        || (Player.le2==Player.playery-19))){
                    if(Player.inith2==0){
                    Handler.hulladek++;
                    }
                    Player.inith2++;
                }
                if((Player.playerx==Player.nemrandxh3
                        || Player.playerx==Player.nemrandxh3-20
                        || Player.playerx==Player.nemrandxh3+20) && (Player.le3==Player.playery+19
                        || (Player.le3==Player.playery)
                        || (Player.le3==Player.playery-19))){
                    if(Player.inith3==0){
                    Handler.hulladek++;
                    }
                    Player.inith3++;
                }
                
                // hordok
                if((Player.playerx==Player.nemrandxho
                        || Player.playerx==Player.nemrandxho-20
                        || Player.playerx==Player.nemrandxho+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    //<editor-fold defaultstate="collapsed" desc="random hordos hokamoka">
                    if(Player.initho==0){
                        switch(randint){
                            case 1:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.burgonya++;
                                break;
                            case 2:
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.burgonya++;
                                break;
                            case 3:
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.burgonya++;
                                break;
                            case 4:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.burgonya++;
                                break;
                            case 5:
                                Handler.burgonya++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 6:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.burgonya++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 7:
                                Handler.burgonya++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 8:
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.burgonya++;
                                Handler.hulladek++;
                                break;
                            case 9:
                                Handler.burgonya++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 10:
                                Handler.burgonya++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 11:
                                Handler.burgonya++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 12:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.hulladek++;
                                Handler.burgonya++;
                                break;
                            case 13:
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.burgonya++;
                                break;
                            case 14:
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.burgonya++;
                                break;
                            case 15:
                                Handler.burgonya++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                break;
                            case 16:
                                Handler.level++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.burgonya++;
                                break;
                        }
                        Player.initho++;
                    }
                    //</editor-fold>
                }
                
                if((Player.playerx==Player.nemrandxho2
                        || Player.playerx==Player.nemrandxho2-20
                        || Player.playerx==Player.nemrandxho2+20) && (Player.le2==Player.playery+19
                        || (Player.le2==Player.playery)
                        || (Player.le2==Player.playery-19))){
                    //<editor-fold defaultstate="collapsed" desc="random hordos hokamoka">
                    if(Player.initho2==0){
                        switch(randint){
                            case 1:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                break;
                            case 2:
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 3:
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 4:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 5:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 6:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 7:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 8:
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 9:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 10:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 11:
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 12:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 13:
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 14:
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 15:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                break;
                            case 16:
                                Handler.level++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                        }
                        Player.initho2++;
                    }
                    //</editor-fold>
                }
                
                if((Player.playerx==Player.nemrandxho3
                        || Player.playerx==Player.nemrandxho3-20
                        || Player.playerx==Player.nemrandxho3+20) && (Player.le2==Player.playery+19
                        || (Player.le2==Player.playery)
                        || (Player.le2==Player.playery-19))){
                    //<editor-fold defaultstate="collapsed" desc="random hordos hokamoka">
                    if(Player.initho3==0){
                        switch(randint){
                            case 1:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                break;
                            case 2:
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 3:
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 4:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 5:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 6:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 7:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 8:
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 9:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 10:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 11:
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.hulladek++;
                                break;
                            case 12:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 13:
                                Handler.deszka++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                Handler.level++;
                                break;
                            case 14:
                                Handler.deszka++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                            case 15:
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.deszka++;
                                Handler.level++;
                                break;
                            case 16:
                                Handler.level++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                Handler.hulladek++;
                                break;
                        }
                        Player.initho3++;
                    }
                    //</editor-fold>
                }
                //</editor-fold>
                
                // cselekvesek, ehseg, szomjusag kezelese KEZDETE
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // cselekvesek, ehseg, szomjusag kezelese VEGE
                
                // capa korkorosen mozog KEZDETE
                capamozog();
                // capa korkorosen mozog VEGE
                keyDown[4] = true;
            }
        }
        
        if(arg1.getKeyCode() == KeyEvent.VK_5 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD5){
             if(!keyDown[5]){
                // Viztisztito counterek kezelese KEZDETE
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                if(viztisztitobool2==true){
                    Player.viztisztito_counter2++;
                }
                if(viztisztitobool3==true){
                    Player.viztisztito_counter3++;
                }
                if(viztisztitobool4==true){
                    Player.viztisztito_counter4++;
                }
                // Viztisztito counterek kezelese VEGE

                // Lerakhatja a jatekos a halot?
                if((Handler.halo > 0)
                && ((Player.playerx==360 && Player.playery==266)
                || (Player.playerx==380 && Player.playery==266)
                || (Player.playerx==400 && Player.playery==266)
                || (Player.playerx==420 && Player.playery==266)
                || (Player.playerx==420 && Player.playery==285)
                || (Player.playerx==420 && Player.playery==304)
                || (Player.playerx==420 && Player.playery==323)
                || (Player.playerx==400 && Player.playery==323)
                || (Player.playerx==380 && Player.playery==323)
                || (Player.playerx==360 && Player.playery==323)
                || (Player.playerx==360 && Player.playery==304)
                || (Player.playerx==360 && Player.playery==285))
                ){
                     switch (haloszamlalo) {
                         case 0:
                             halox=Player.playerx;
                             haloy=Player.playery;
                             haloszamlalo++;
                             halobool1=true;
                             Handler.halo--;
                             break;
                         case 1:
                             halox2=Player.playerx;
                             haloy2=Player.playery;
                             haloszamlalo++;
                             halobool2=true;
                             Handler.halo--;
                             break;
                         case 2:
                             halox3=Player.playerx;
                             haloy3=Player.playery;
                             haloszamlalo++;
                             halobool3=true;
                             Handler.halo--;
                             break;
                         case 3:
                             halox4=Player.playerx;
                             haloy4=Player.playery;
                             haloszamlalo++;
                             halobool4=true;
                             Handler.halo--;
                             break;
                         case 4:
                             halox5=Player.playerx;
                             haloy5=Player.playery;
                             haloszamlalo++;
                             halobool5=true;
                             Handler.halo--;
                             break;
                         case 5:
                             halox6=Player.playerx;
                             haloy6=Player.playery;
                             haloszamlalo++;
                             halobool6=true;
                             Handler.halo--;
                             break;
                         case 6:
                             halox7=Player.playerx;
                             haloy7=Player.playery;
                             haloszamlalo++;
                             halobool7=true;
                             Handler.halo--;
                             break;
                         case 7:
                             halox8=Player.playerx;
                             haloy8=Player.playery;
                             haloszamlalo++;
                             halobool8=true;
                             Handler.halo--;
                             break;
                         case 8:
                             halox9=Player.playerx;
                             haloy9=Player.playery;
                             haloszamlalo++;
                             halobool9=true;
                             Handler.halo--;
                             break;
                         case 9:
                             halox10=Player.playerx;
                             haloy10=Player.playery;
                             haloszamlalo++;
                             halobool10=true;
                             Handler.halo--;
                             break;
                         case 10:
                             halox11=Player.playerx;
                             haloy11=Player.playery;
                             haloszamlalo++;
                             halobool11=true;
                             Handler.halo--;
                             break;
                         case 11:
                             halox12=Player.playerx;
                             haloy12=Player.playery;
                             haloszamlalo++;
                             halobool12=true;
                             Handler.halo--;
                             break;
                         default:
                             break;
                     }
                }
                keyDown[5] = true;
             }
        }
        
        if(arg1.getKeyCode() == KeyEvent.VK_4 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD4){
            if(!keyDown[6]){
                // Viztisztito counterek kezelese KEZDETE
                if(viztisztitobool1==true){
                    Player.viztisztito_counter++;
                }
                if(viztisztitobool2==true){
                    Player.viztisztito_counter2++;
                }
                if(viztisztitobool3==true){
                    Player.viztisztito_counter3++;
                }
                if(viztisztitobool4==true){
                    Player.viztisztito_counter4++;
                }
                // Viztisztito counterek kezelese VEGE

                // Lerakhatja a jatekos a viztisztitot?
                if((Handler.viztisztito > 0)
                   && ((Player.playerx==380 && Player.playery==285)
                   || (Player.playerx==400 && Player.playery==285)
                   || (Player.playerx==400 && Player.playery==304)
                   || (Player.playerx==380 && Player.playery==304))){
                    switch (viztisztitoszamlalo) {
                        case 0:
                            viztisztitox=Player.playerx;
                            viztisztitoy=Player.playery;
                            viztisztitoszamlalo++;
                            viztisztitobool1=true;
                            Handler.viztisztito--;
                            break;
                        case 1:
                            viztisztitox2=Player.playerx;
                            viztisztitoy2=Player.playery;
                            viztisztitoszamlalo++;
                            viztisztitobool2=true;
                            Handler.viztisztito--;
                            break;
                        case 2:
                            viztisztitox3=Player.playerx;
                            viztisztitoy3=Player.playery;
                            viztisztitoszamlalo++;
                            viztisztitobool3=true;
                            Handler.viztisztito--;
                            break;
                        case 3:
                            viztisztitox4=Player.playerx;
                            viztisztitoy4=Player.playery;
                            viztisztitoszamlalo++;
                            viztisztitobool4=true;
                            Handler.viztisztito--;
                            break;
                        default:
                            break;
                    }
                }
                keyDown[6] = true;
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            keyDown[0] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_A){
            keyDown[1] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_S){
            keyDown[2] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_D){
            keyDown[3] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            keyDown[4] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_5 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD5){
            keyDown[5] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_4 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD4){
            keyDown[6] = false;
        }
    }
    
    @Override
    public void keyTyped(KeyEvent arg1) {}
    
    public void capamozog(){
        capaint++;
        if(capaint>7){
            Player.cy-=1;
            if(capaint>14){
                Player.cy+=1;
                Player.cx-=1;
                if(capaint>21){
                    Player.cx+=1;
                    Player.cy+=1;
                    if(capaint>27){
                        capaint=0;
                    }

                }
            }
        } else{
            Player.cx+=1;
        }
    }

    // getter-ek
    public static boolean isHalobool1() {
        return halobool1;
    }
    public static boolean isHalobool2() {
        return halobool2;
    }
    public static boolean isHalobool3() {
        return halobool3;
    }
    public static boolean isHalobool4() {
        return halobool4;
    }
    public static boolean isHalobool5() {
        return halobool5;
    }
    public static boolean isHalobool6() {
        return halobool6;
    }public static boolean isHalobool7() {
        return halobool7;
    }
    public static boolean isHalobool8() {
        return halobool8;
    }
    public static boolean isHalobool9() {
        return halobool9;
    }
    public static boolean isHalobool10() {
        return halobool10;
    }
    public static boolean isHalobool11() {
        return halobool11;
    }
    public static boolean isHalobool12() {
        return halobool12;
    }
    
    public static boolean isViztisztitobool1(){
        return viztisztitobool1;
    }
    public static boolean isViztisztitobool2(){
        return viztisztitobool2;
    }
    public static boolean isViztisztitobool3(){
        return viztisztitobool3;
    }
    public static boolean isViztisztitobool4(){
        return viztisztitobool4;
    }
    
}

    
