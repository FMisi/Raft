package raft;

import gameObjects.Player;
import java.awt.event.*;

public class Keys implements KeyListener{
    
    private int capaint = 0;
    
    public static boolean[] keyDown = {false, false, false, false, false};

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
                Player.le += 19;
                Player.nemrandxd2 = Player.nemrandxd;
                Player.nemrandxl2 = Player.nemrandxl;
                Player.nemrandxh2 = Player.nemrandxh;
                
                if((Player.playerx==Player.nemrandxd
                        || Player.playerx==Player.nemrandxd-20
                        || Player.playerx==Player.nemrandxd+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    Handler.deszka++;
                }
                if((Player.playerx==Player.nemrandxl
                        || Player.playerx==Player.nemrandxl-20
                        || Player.playerx==Player.nemrandxl+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    Handler.level++;
                }
                if((Player.playerx==Player.nemrandxh
                        || Player.playerx==Player.nemrandxh-20
                        || Player.playerx==Player.nemrandxh+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery))){
                    Handler.hulladek++;
                }
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
