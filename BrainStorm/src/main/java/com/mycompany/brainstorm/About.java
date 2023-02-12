/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brainstorm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dell
 */
public class About extends JFrame {
    About(){
        this.setBounds(100, 100, 500, 400);
        this.setTitle("ABOUT US");
        
        Image logo = Toolkit.getDefaultToolkit().getImage("D:\\Java project\\BrainStorm\\src\\main\\java\\com\\mycompany\\brainstorm\\logo.jpg");
        
        JLabel title = new JLabel("ABOUT US");
        title.setBounds(100, 50,180, 80);
        title.setForeground(Color.white);
        title.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        this.add(title);
        
        JLabel info = new JLabel("<html>Brainstorming is a popular creative problem-solving approach that people use to generate new ideas and solutions to challenges.</html>");
        info.setBounds(100, 50,350, 300);
        info.setForeground(Color.white);
        info.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
        this.add(info);
        
        JButton choose = new JButton("Back");
        choose.setBounds(320, 300,100, 40);
        choose.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
         choose.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        setVisible(false);
                        new BrainStorm().setVisible(true);
                    }  
                });
         this.add(choose);
         
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setIconImage(logo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
       About about = new About();
    }
}
