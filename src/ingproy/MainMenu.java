/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 *
 * @author antoniocalvocalvo
 */
class MainMenu extends JFrame{
    public MainMenu(){
      
        
   
        setTitle("Ventana Inicial");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout()); 
        
        PanelPrincipal PP = new PanelPrincipal();
        add (PP, BorderLayout.NORTH);
        
        Footer foo = new Footer();
        add(foo, BorderLayout.SOUTH);
        //System.out
        
    }
     class PanelPrincipal extends JPanel implements ActionListener{
         
       JButton boton1 = new JButton("Resolución Ecuaciones"); 
       JButton boton2 = new JButton("Ecuaciones Cónicas");
       JButton boton3 = new JButton("Crecimiento Población");

    public PanelPrincipal(){
       
      
       add(boton1,BorderLayout.WEST);
       add(boton2,BorderLayout.CENTER);
       add(boton3,BorderLayout.EAST);
       boton1.addActionListener(this);
       boton2.addActionListener(this);
       boton3.addActionListener(this);
   }

        EqSolver test1 = new EqSolver (1000, 600, "EqSolver");
        
        @Override
        public void actionPerformed(ActionEvent e) {
            EqSolver test = new EqSolver (1000, 600, "EqSolver");
        test.setVisible(true);
         }
         }
     
        public class Footer extends JPanel implements ActionListener{

         JButton botonExit = new JButton("Exit"); 
         public Footer(){
           
            add(botonExit,BorderLayout.LINE_END);  
            botonExit.addActionListener(this);
             
            
         }
         
        @Override //This method stops the program when clicked on the exit button
        public void actionPerformed(ActionEvent e) {
        
           System.exit(0);
       
        }
         
        
        
       
         
        }
        }

