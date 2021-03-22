package raft;

import javax.swing.*;

public class Window {
   
    public Window(int width, int height, String title, Raft raft){
        JFrame frame = new JFrame(title);
        
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(raft);
        frame.setVisible(true);
        raft.start();
    }
    
}