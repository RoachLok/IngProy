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
    
    public FxDrawer(int winWidth, int winLength, String title, JComponent output, JComponent pastOutput) {
        super(winWidth, winLength, title, output, pastOutput);
    }
    
    public FxDrawer(int winWidth, int winLength, String title, JComponent output, JComponent pastOutput, int widthPos, int lengthPos) {
        super(winWidth, winLength, title, output, pastOutput, widthPos, lengthPos);
    }
    
}
