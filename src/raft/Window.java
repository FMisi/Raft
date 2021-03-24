package raft;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.*;

public class Window extends JFrame{
    
    ImageIcon icon = new ImageIcon("image/icon.png");
    File musicLocation = new File("music/lopot.wav");
    
    public Window(int width, int height, String title, Raft raft){
        
        try{
            
            File musicPath = musicLocation;
            
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(raft);
        frame.setVisible(true);
        
        raft.start();
              
    }
    
}
