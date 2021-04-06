package raft;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.*;

public class Window extends JFrame{

    private File bgm = new File("music/raftgamemusic2B.wav");
    private File victorybgm = new File("music/raftvictory.wav");
    private File wastedbgm = new File("music/wasted.wav");
    public static Clip clip;
    public static Clip clip2;
    public static Clip clip3;
    
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
        
        try{
            
            File musicPath = victorybgm;
            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip2 = AudioSystem.getClip();
            clip2.open(audioInput);
            clip2.stop();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        try{
            
            File musicPath = wastedbgm;
            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip3 = AudioSystem.getClip();
            clip3.open(audioInput);
            clip3.stop();
            
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
