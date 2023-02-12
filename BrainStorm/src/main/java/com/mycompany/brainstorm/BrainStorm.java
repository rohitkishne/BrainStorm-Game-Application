/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brainstorm;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class BrainStorm extends JFrame{
    JFrame f;
    
    BrainStorm(){
        f = new JFrame("Brain Storm");
        f.setFont(new Font("Helvetica Neue",Font.BOLD,20));
        f.setSize(800, 600);
        Image logo = Toolkit.getDefaultToolkit().getImage("D:\\Java project\\BrainStorm\\src\\main\\java\\com\\mycompany\\brainstorm\\logo.jpg");
        
        
        JLabel label = new JLabel("Brain Storm");
        label.setForeground(Color.red);
        label.setFont(new Font("serif",Font.BOLD,40));
        label.setBounds(290, 20, 250, 50);
        f.add(label);
        
        JButton suduko = new JButton("PLAY SUDUKO");
        suduko.setForeground(Color.red);
        suduko.setFont(new Font("math",Font.BOLD,15));
        suduko.setBounds(310,150,170, 50);
        
         suduko.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        f.setVisible(false);
                        new SudokuGame().setVisible(true);
                    }  
                });  
        
        JButton tic = new JButton("PLAY TICTACTOE");
        tic.setForeground(Color.red);
        tic.setFont(new Font("math",Font.BOLD,15));
        tic.setBounds(310,210,170, 50);
        
         tic.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        f.setVisible(false);
                        new GUI().setVisible(true);
                    }  
                });
        
        JButton about = new JButton("ABOUT US");
        about.setForeground(Color.red);
        about.setFont(new Font("math",Font.BOLD,15));
        about.setBounds(310,270,170, 50);
        
        about.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        f.setVisible(false);
                        new About().setVisible(true);
                    }  
                });
        
        JButton contact = new JButton("CONTACT US");
        contact.setForeground(Color.red);
        contact.setFont(new Font("math",Font.BOLD,15));
        contact.setBounds(310,330,170, 50);
        
         contact.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        f.setVisible(false);
                        new Contact().setVisible(true);
                    }  
                });
        
        JPanel button = new JPanel();
        button.setBackground(Color.DARK_GRAY);
        button.setBounds(0, 100, 800, 500);
        
        f.add(suduko);
        f.add(tic);
        f.add(about);
        f.add(contact);
        
        f.add(button);
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.setIconImage(logo);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
        
       
    }
    public static void main(String[] args) {
        BrainStorm frame = new BrainStorm();
        
    }
}
