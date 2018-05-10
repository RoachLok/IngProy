/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.Font;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;


public class IngProy {

    
    public static void main(String[] args) {
        //MAIN DEL PROYECTO PARA IMPLEMENTAR LOS MÉTODOS.
        
        /*
        JPanel testComponent = new JPanel ();
        EqSolver test = new EqSolver (500,300,"Test",testComponent,testComponent);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        
        
        MainMenu VentanaInicio = new MainMenu();
        VentanaInicio.setTitle ("Ventana Inicial");
        VentanaInicio.setVisible (true);
        VentanaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        GrowthRepresenter test = new GrowthRepresenter(750, 450, "FxDrawer-Input");
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JFrame testWin = new JFrame ();
        testWin.add(test.input());
        testWin.setVisible(true);
    }
    
}
