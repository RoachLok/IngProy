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
public class EqSolver extends MainWin   {

    public EqSolver(int winWidth, int winLength, String title) {
        super(winWidth, winLength, title);
    }
    
    public EqSolver(int winWidth, int winLength, String title, int widthPos, int lengthPos) {
        super(winWidth, winLength, title, widthPos, lengthPos);
    }
    
    
    @Override
    JComponent input() {
        JPanel paletPane = new JPanel ();
        
        //ALL input WINDOW CODE HERE
        
        return paletPane;
    }

    @Override
    JComponent output() {
        JPanel paletPane = new JPanel ();
        
        //ALL output WINDOW CODE HERE
        
        return paletPane;
    }

    @Override
    JComponent pastOutput() {
        JPanel paletPane = new JPanel ();
        
        //ALL pastOutput WINDOW CODE HERE
        
        return paletPane;
    }
    
    
    
}
