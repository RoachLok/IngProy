/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import javax.swing.*;

/**
 *
 * @author antoniocalvocalvo
 */
//In this class we will implement and resolve the population problem
public class GrowthRepresenter extends MainWin{
    
    public GrowthRepresenter(int winWidth, int winLength) {
        super(winWidth, winLength);
    }

    public GrowthRepresenter(int winWidth, int winLength, boolean scroller) {
        super(winWidth, winLength, scroller);
    }
    
   JPanel test = new JPanel ();
    
 JPanel input() {
        //Creates the "holder" Panel with X-Axis boxlayout. 
        JPanel paletPanel = new JPanel ();
        paletPanel.setLayout(new BoxLayout(paletPanel, BoxLayout.Y_AXIS));
        paletPanel.setBorder(BorderFactory.createCompoundBorder(
                                    BorderFactory.createTitledBorder("= Representación crecimiento poblaciones ="),
                                        BorderFactory.createEmptyBorder(5,5,5,5)));
        paletPanel.setBackground(Color.WHITE);
        
        //"Spacer"
        JLabel blankSpace = new JLabel (" ");
        blankSpace.setBackground(Color.WHITE);
        
        //Eq. input field.
        JPanel inputSection = new JPanel ();
        inputSection.setLayout(new FlowLayout(3));
         
        JTextField limiteTexField =       new JTextField ("", 9); //aqui esta la chicha
        JTextField inicialTexField =      new JTextField ("", 9);
        JTextField natalidadTexField =    new JTextField ("", 9);
        JTextField generacionesTexField = new JTextField ("", 9);
        
        JButton continuar = new JButton("Continuar");
         paletPanel.add(continuar,BorderLayout.WEST);
         continuar.addActionListener(this);
         continuar.setActionCommand("Continua");
         continuar.setVisible(true);
         Dimension minimumSize = new Dimension(100, 50);
         continuar.setBackground(Color.YELLOW);
        
        limiteTexField.setMinimumSize(minimumSize);//tamaño minimo para no espachurrar
     
        JLabel limite = new JLabel ("Limite popablación (k)");
        JLabel inicial = new JLabel (" Población Inicial ");
        JLabel natalidad = new JLabel ("Tasa natalidad ");
        JLabel generaciones = new JLabel ("Generaciones");
        
        
        limiteTexField.setMinimumSize(minimumSize);
        
        limite.setLabelFor(limiteTexField);
        inputSection.add(limite);
        inputSection.add(limiteTexField);
        
        inicial.setLabelFor(inicialTexField);
        inputSection.add(inicial);
        inputSection.add(inicialTexField);
       
        natalidad.setLabelFor(natalidadTexField);
        inputSection.add(natalidad);
        inputSection.add(natalidadTexField);
        
        generaciones.setLabelFor(generacionesTexField);
        inputSection.add(generaciones);
        inputSection.add(generacionesTexField);
        
        // HACER UN ARRAY QUE CONTENGA A LOS COMPONENTES Y LES PONGA EL COLOR.
        
        
        
        //Adds it to the paletPanel.
        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);
     //   paletPanel.add(inputTex3);
        
        return paletPanel;
    }   
      
  @Override
    JComponent output() {
     //   poblacion inicial * tasa natalidad y lom imprimes
    
        
          
        
        return test;
    }

    @Override
    JComponent pastOutput() {
       int poblacionFinal;
       
      
        
        

       // poblacion final = (inicial * natalidad);
      //  *genraciones maximo de limite poblacion;
      /* poblacion = (poblacion * tasaNatalidad * (k - poblacion)) / k;
            if (poblacion <= 0) {
                extincion = i + 1;
                series.add(i + 1, 0);
                break;
            }
        */
        
        return test;
    }
  
    
    
    
}
/*
inputSection.setBackground(Color.WHITE);
        limiteTexField.setBackground(Color.GRAY);
        limite.setBackground(Color.BLUE);
        
        inputSection.setBackground(Color.WHITE);
        limiteTexField.setBackground(Color.GREEN);
        inicial.setBackground(Color.MAGENTA);
        
        inputSection.setBackground(Color.WHITE);
        limiteTexField.setBackground(Color.ORANGE);
        natalidad.setBackground(Color.PINK);
        
        inputSection.setBackground(Color.WHITE);
        limiteTexField.setBackground(Color.GRAY);
        generaciones.setBackground(Color.WHITE);*/