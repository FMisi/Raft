package raft;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.*;

public class Window extends JFrame{

    private File bgm = new File("music/raftgamemusic.wav");
    private static Clip clip;
    
    public Window(int width, int height, String title, Raft raft){
        
        try{
            
            File musicPath = bgm;
            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("image/icon.png"));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(raft);
        frame.setVisible(true);
        
        raft.start();
  
    }
    
}
