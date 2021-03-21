package raft;

import java.awt.*;
import javax.swing.*;

public class Raft {
    
    public int CSELEKVESSZAMLALO = 0;

    public static void main(String[] args) {
        new Raft();
    }
    public Raft(){
        // 35 egyseg szeles, 25 egyseg magas palya,
        // Layout Manager-rel megvalositva
        JFrame frame = new JFrame("Raft");
        JButton btn;
        frame.setLayout(new GridLayout(10,20,1,1));
        
        char tutaj = 't';
        char jatekos = 'X';
        
        for (int i = 1; i < 201; i++) {
            btn = new JButton();
            btn.setPreferredSize(new Dimension(100,100));
            if(i==110 || i==111){
                btn.setText(""+tutaj);
            }
            else{
                btn.setText(""+i);
            }
            if(i==110){
                btn.setText(""+jatekos);
            }
            frame.add(btn);
        }
        
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
