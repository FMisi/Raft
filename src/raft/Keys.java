package raft;

import gameObjects.Player;
import java.util.Random;
import java.awt.event.*;

public class Keys implements KeyListener{
    
    private int capaint = 0;
    
    private boolean[] keyDown = {false, false, false, false, false, false};
    
    private static boolean halobool1 = false;
    public static int halox;
    public static int haloy;

    @Override
    public void keyPressed(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            if(!keyDown[0]){
                Player.le += 19;
                Handler.playerOne.tile.second--;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--; 
                // capa korkorosen mozog KEZDETE
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
                // capa korkorosen mozog VEGE
                keyDown[0] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_A){
            if(!keyDown[1]){
                Player.le += 19;
                Handler.playerOne.tile.first--;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
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
                // capa korkorosen mozog VEGE
                keyDown[1] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_S){
            if(!keyDown[2]){
                Player.le += 19;
                Handler.playerOne.tile.second++;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
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
                // capa korkorosen mozog VEGE
                keyDown[2] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_D){
            if(!keyDown[3]){
                Player.le += 19;
                Handler.playerOne.tile.first++;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
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
            System.out.println("halox= "+halox);
            System.out.println("Player.nemrandxd= "+Player.nemrandxd);
            System.out.println("Player.nemrandxd2= "+Player.nemrandxd2);
            System.out.println("Player.nemrandxd3= "+Player.nemrandxd3);
            if(!keyDown[4]){
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
                        || Player.playerx==Player.nemrandxd2+20) && (Player.le2==Player.playery+38
                        || (Player.le2==Player.playery+19)
                        || (Player.le2==Player.playery))){
                    if(Player.initd2==0){
                    Handler.deszka++;
                    }
                    Player.initd2++;
                }
                if((Player.playerx==Player.nemrandxd3
                        || Player.playerx==Player.nemrandxd3-20
                        || Player.playerx==Player.nemrandxd3+20) && (Player.le3==Player.playery+38
                        || (Player.le3==Player.playery+19)
                        || (Player.le3==Player.playery))){
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
                        || Player.playerx==Player.nemrandxl2+20) && (Player.le2==Player.playery+38
                        || (Player.le2==Player.playery+19)
                        || (Player.le2==Player.playery))){
                    if(Player.initl2==0){
                    Handler.level++;
                    }
                    Player.initl2++;
                }
                if((Player.playerx==Player.nemrandxl3
                        || Player.playerx==Player.nemrandxl3-20
                        || Player.playerx==Player.nemrandxl3+20) && (Player.le3==Player.playery+38
                        || (Player.le3==Player.playery+19)
                        || (Player.le3==Player.playery))){
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
                        || Player.playerx==Player.nemrandxh2+20) && (Player.le2==Player.playery+38
                        || (Player.le2==Player.playery+19)
                        || (Player.le2==Player.playery))){
                    if(Player.inith2==0){
                    Handler.hulladek++;
                    }
                    Player.inith2++;
                }
                if((Player.playerx==Player.nemrandxh3
                        || Player.playerx==Player.nemrandxh3-20
                        || Player.playerx==Player.nemrandxh3+20) && (Player.le3==Player.playery+38
                        || (Player.le3==Player.playery+19)
                        || (Player.le3==Player.playery))){
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
                        Player.initho++;
                    }
                    //</editor-fold>
                }
                
                if((Player.playerx==Player.nemrandxho2
                        || Player.playerx==Player.nemrandxho2-20
                        || Player.playerx==Player.nemrandxho2+20) && (Player.le2==Player.playery+38
                        || (Player.le2==Player.playery+19)
                        || (Player.le2==Player.playery))){
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
                        || Player.playerx==Player.nemrandxho3+20) && (Player.le2==Player.playery+38
                        || (Player.le2==Player.playery+19)
                        || (Player.le2==Player.playery))){
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
                        Player.initho2++;
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
                // capa korkorosen mozog VEGE
                keyDown[4] = true;
            }
        }
        
        if(arg1.getKeyCode() == KeyEvent.VK_5 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD5){
             if(!keyDown[5]){
                if(Handler.halo > 0){
                    halox=Player.playerx;
                    haloy=Player.playery;
                    halobool1=true;
                    Handler.halo--;
                }
                keyDown[5] = true;
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
    }
    
    @Override
    public void keyTyped(KeyEvent arg1) {}

    public static boolean isHalobool1() {
        return halobool1;
    }
    
}

    
