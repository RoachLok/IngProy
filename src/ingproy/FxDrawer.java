/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import javax.swing.JComponent;

/**
 *
 * @author jtabo_000
 */
public class FxDrawer extends MainWin{
    
    public FxDrawer(int winWidth, int winLength, String title, JComponent input, JComponent output, JComponent pastOutput) {
        super(winWidth, winLength, title, input, output, pastOutput);
    }
    
    public FxDrawer(int winWidth, int winLength, String title, JComponent input, JComponent output, JComponent pastOutput, int widthPos, int lengthPos) {
        super(winWidth, winLength, title, input, output, pastOutput, widthPos, lengthPos);
    }

    @Override
    JComponent input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    JComponent output() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    JComponent pastOutput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
