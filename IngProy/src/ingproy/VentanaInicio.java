/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author antoniocalvocalvo
 */
class VentanaInicio extends JFrame{
    public VentanaInicio(){
      
        
   
        setTitle("Ventana Inicial");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout()); 
        
        PanelPrincipal PP = new PanelPrincipal();
        add (PP, BorderLayout.NORTH);
        
        Footer foo = new Footer();
        add(foo, BorderLayout.SOUTH);
        
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
   }

        @Override
        public void actionPerformed(ActionEvent e) {
         }
         }
     
     public class Footer extends JPanel implements ActionListener{

         JButton exit = new JButton("Exit"); 
         public Footer(){
           
            add(exit,BorderLayout.LINE_END);  
            
            
          
            
            
           
         }
         
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
         
        

         
     }
     }

