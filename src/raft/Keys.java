package raft;

import java.awt.event.*;

public class Keys implements KeyListener{
    
    public boolean[] keyDown = {false, false, false, false, false};

    @Override
    public void keyPressed(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            if(!keyDown[0]){
                Handler.playerOne.tile.second--;
                Handler.cselekvesek++;
                keyDown[0] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_A){
            if(!keyDown[1]){
                Handler.playerOne.tile.first--;
                Handler.cselekvesek++;
                keyDown[1] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_S){
            if(!keyDown[2]){
                Handler.playerOne.tile.second++;
                Handler.cselekvesek++;
                keyDown[2] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_D){
            if(!keyDown[3]){
                Handler.playerOne.tile.first++;
                Handler.cselekvesek++;
                keyDown[3] = true;
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            if(!keyDown[4]){
                Handler.cselekvesek++;
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
    public void keyTyped(KeyEvent arg1) {
        
    }
    
}
