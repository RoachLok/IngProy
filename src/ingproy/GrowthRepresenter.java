/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

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
    
    /*
    
    IMPORTANTE: NO TE VA A COMPILAR PORQUE HE AÑADIDO MÉTODOS
                ABSTRACTOS A MAINWIN Y HASTA QUE NO LOS 
                IMPLEMENTES NO TE VA A DEJAR COMPILAR.
                Puedes añadirlos dándole a la bombilla de al lado del constructor,
                implement all abstract methods.
    
    */

    JPanel test = new JPanel ();
    
    @Override
    JComponent input() {
        
        return test;
    }

    @Override
    JComponent output() {
        
        return test;
    }

    @Override
    JComponent pastOutput() {
        
        return test;
    }
    
    

  
    
    
    
}
