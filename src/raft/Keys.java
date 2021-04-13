package raft;

import gameObjects.Player;
import java.util.Random;
import java.awt.event.*;

public class Keys implements KeyListener{
    
    private int capaint = 0;
    
    public static boolean[] keyDown = {false, false, false, false, false};

    @Override
    public void keyPressed(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            if(!keyDown[0]){
                Player.le += 19;
                Player.le2 += 19;
                Handler.playerOne.tile.second--;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--; 
                // capa korkorosen mozog KEZDETE
                capaint++;
                if(capaint>5){
                    Player.cy-=1;
                    if(capaint>10){
                        Player.cy+=1;
                        Player.cx-=1;
                        if(capaint>15){
                            Player.cx+=1;
                            Player.cy+=1;
                            if(capaint>19){
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
                Player.le2 += 19;
                Handler.playerOne.tile.first--;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
                capaint++;
                if(capaint>5){
                    Player.cy-=1;
                    if(capaint>10){
                        Player.cy+=1;
                        Player.cx-=1;
                        if(capaint>15){
                            Player.cx+=1;
                            Player.cy+=1;
                            if(capaint>19){
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
                Player.le2 += 19;
                Handler.playerOne.tile.second++;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
                capaint++;
                if(capaint>5){
                    Player.cy-=1;
                    if(capaint>10){
                        Player.cy+=1;
                        Player.cx-=1;
                        if(capaint>15){
                            Player.cx+=1;
                            Player.cy+=1;
                            if(capaint>19){
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
                Player.le2 += 19;
                Handler.playerOne.tile.first++;
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // capa korkorosen mozog KEZDETE
                capaint++;
                if(capaint>5){
                    Player.cy-=1;
                    if(capaint>10){
                        Player.cy+=1;
                        Player.cx-=1;
                        if(capaint>15){
                            Player.cx+=1;
                            Player.cy+=1;
                            if(capaint>19){
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
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            if(!keyDown[4]){
                Random random = new Random();
                int randint = random.nextInt(16)+1;
                System.out.println(randint);
                
                Player.le += 19;
                Player.le2 += 19;
                
                // item pickup kezeles KEZDETE
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
                // item pickup kezeles VEGE
                
                // cselekvesek, ehseg, szomjusag kezelese KEZDETE
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
                // cselekvesek, ehseg, szomjusag kezelese VEGE
                
                // capa korkorosen mozog KEZDETE
                capaint++;
                if(capaint>5){
                    Player.cy-=1;
                    if(capaint>10){
                        Player.cy+=1;
                        Player.cx-=1;
                        if(capaint>15){
                            Player.cx+=1;
                            Player.cy+=1;
                            if(capaint>19){
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
    }
    
    @Override
    public void keyTyped(KeyEvent arg1) {}
    
}
