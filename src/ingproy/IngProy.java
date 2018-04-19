/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import javax.swing.*;

/**
 *
 * @author jtabo_000
 */
public class IngProy {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //MAIN DEL PROYECTO PARA IMPLEMENTAR LOS MÉTODOS.
        JPanel testComponent = new JPanel ();
        EqSolver test = new EqSolver (500,300,"Test",testComponent,testComponent);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
