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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import javax.swing.*;

/**
 *
 * @author antoniocalvocalvo
 */
//In this class we will implement and resolve the population problem
public class GrowthRepresenter extends MainWin{
    private double k;
    private double poblInicial;
    private double tasaNat;
    private double generaciones;
    double poblacionFinal;
    
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
        
//        double limite = Double.valueOf(limiteTexField.getText());//aqui cojo el numero del texfield
        //lo paso a string y de string a double
    //    double inicial = Double.valueOf(inicialTexField.getText());
    //    double natalidad = Double.valueOf(natalidadTexField.getText());
    //    double generacioness = Double.valueOf(generacionesTexField.getText());
        
        JButton continuar = new JButton("Continuar");
         paletPanel.add(continuar,BorderLayout.WEST);
         continuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                k = Double.valueOf(limiteTexField.getText());
                poblInicial = Double.valueOf(inicialTexField.getText());
                tasaNat = Double.valueOf(natalidadTexField.getText());
                generaciones =Double.valueOf(generacionesTexField.getText());
            }
        });
         continuar.setActionCommand("Continua");
         continuar.setVisible(true);
         Dimension minimumSize = new Dimension(100, 50);
         continuar.setBackground(Color.YELLOW);
        
        limiteTexField.setMinimumSize(minimumSize);//tamaño minimo para no espachurrar
     
        JLabel k = new JLabel ("Limite popablación (k)");
        JLabel poblInicial = new JLabel (" Población Inicial ");
        JLabel tasaNat = new JLabel ("Tasa natalidad ");
        JLabel generaciones = new JLabel ("Generaciones");
        
        
        limiteTexField.setMinimumSize(minimumSize);
        
        k.setLabelFor(limiteTexField);
        inputSection.add(k);
        inputSection.add(limiteTexField);
        
        poblInicial.setLabelFor(inicialTexField);
        inputSection.add(poblInicial);
        inputSection.add(inicialTexField);
       
        tasaNat.setLabelFor(natalidadTexField);
        inputSection.add(tasaNat);
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
    
  
        double primeraIteracion = poblInicial*tasaNat;
    System.out.println(primeraIteracion);
    double segundaIteracion =(k - poblInicial) / k;
    System.out.println(segundaIteracion);
    
    double poblacionFinal = primeraIteracion * segundaIteracion;
        
       // poblacionFinal = primeraIteracion * segundaIteracion;
        // multiplicar la primera y segunda itera
        System.out.println(poblacionFinal);
          
        
        return test;
    }

    @Override
    JComponent pastOutput() {
       
        double poblacionTotal = poblacionFinal * generaciones;
        System.out.println(poblacionTotal);
    
        
        

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