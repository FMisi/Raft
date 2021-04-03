package raft;

import gameObjects.Player;
import static gameObjects.Player.le;
import static gameObjects.Player.playerx;
import static gameObjects.Player.playery;
import java.awt.event.*;

public class Keys implements KeyListener{
    
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
                keyDown[3] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            if(!keyDown[4]){
                Player.le += 19;
                System.out.println("Player.playerx: "+Player.playerx);
                System.out.println("Player.nemrandxd: "+Player.nemrandxd);
                System.out.println("Player.le: "+Player.le);
                System.out.println("Player.playery: "+Player.playery);
                Player.nemrandxd = Player.nemrandxd2;
                Player.nemrandxl = Player.nemrandxl2;
                Player.nemrandxh = Player.nemrandxh2;
                
                if((Player.playerx==Player.nemrandxd
                        || Player.playerx==Player.nemrandxd-20
                        || Player.playerx==Player.nemrandxd+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery)) && Player.initd==0){
                    Handler.deszka++;
                    Player.initd++;
                }
                if((Player.playerx==Player.nemrandxl
                        || Player.playerx==Player.nemrandxl-20
                        || Player.playerx==Player.nemrandxl+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery)) && Player.initl==0){
                    Handler.level++;
                    Player.initl++;
                }
                if((Player.playerx==Player.nemrandxh
                        || Player.playerx==Player.nemrandxh-20
                        || Player.playerx==Player.nemrandxh+20) && (Player.le==Player.playery+38
                        || (Player.le==Player.playery+19)
                        || (Player.le==Player.playery)) && Player.inith==0){
                    Handler.hulladek++;
                    Player.inith++;
                }
                Handler.cselekvesek++;
                Handler.ehseg--;
                Handler.szomjusag--;
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
