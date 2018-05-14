/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author antoniocalvocalvo
 */
//In this class we will implement and resolve the population problem
public class GrowthRepresenter extends MainWin{
    
    public GrowthRepresenter(int winWidth, int winLength, String title) {
        super(winWidth, winLength, title);
    }

    public GrowthRepresenter(int winWidth, int winLength, String title, int widthPos, int lengthPos) {
        super(winWidth, winLength, title, widthPos, lengthPos);
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
        
        JTextField inputText = new JTextField ("10000", 10); //aqui 
        JTextField inputText2 = new JTextField ("3", 10);
        JTextField inputTex3 = new JTextField ("10", 10);
        JTextField inputTex4 = new JTextField ("40", 10);
        Dimension minimumSize = new Dimension(100, 50);
        inputText.setMinimumSize(minimumSize);
        JLabel limite = new JLabel ("Limite popablación (k): ");
        JLabel inicial = new JLabel (" Población Inicial ");
        JLabel natalidad = new JLabel ("Tasa natalidad ");
        JLabel generaciones = new JLabel ("Generaciones");
        
        limite.setLabelFor(inputText);
        inputSection.add(limite);
        inputSection.add(inputText);
        
        inicial.setLabelFor(inputText);
        inputSection.add(inicial);
        inputSection.add(inputText);
       
        natalidad.setLabelFor(inputText);
        inputSection.add(natalidad);
        inputSection.add(inputText);
        
        generaciones.setLabelFor(inputText);
        inputSection.add(generaciones);
        inputSection.add(inputText);
        
        // HACER UN ARRAY QUE CONTENGA A LOS COMPONENTES Y LES PONGA EL COLOR.
        inputSection.setBackground(Color.WHITE);
        inputText.setBackground(Color.GRAY);
        limite.setBackground(Color.WHITE);
        
        inputSection.setBackground(Color.WHITE);
        inputText.setBackground(Color.GRAY);
        inicial.setBackground(Color.WHITE);
        
        inputSection.setBackground(Color.WHITE);
        inputText.setBackground(Color.GRAY);
        natalidad.setBackground(Color.WHITE);
        
        inputSection.setBackground(Color.WHITE);
        inputText.setBackground(Color.GRAY);
        generaciones.setBackground(Color.WHITE);
        
        
        //Adds it to the paletPanel.
        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);
        
        return paletPanel;
    }   
      
  @Override
    JComponent output() {
        
        
        
        
        return test;
    }

    @Override
    JComponent pastOutput() {
       int poblacionFinal;
       
      
        
        

       // poblacion final = (inicial * natalidad);
      //  *genraciones maximo de limite poblacion;
        
        
        return test;
    }
  
    
    
    
}
