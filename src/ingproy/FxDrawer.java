/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jtabo_000
 */
public class FxDrawer extends MainWin{
    
    public FxDrawer(int winWidth, int winLength, String title) {
        super(winWidth, winLength, title);
        
    }
    
    public FxDrawer(int winWidth, int winLength, String title, int widthPos, int lengthPos) {
        super(winWidth, winLength, title, widthPos, lengthPos);
    }

    @Override
    JPanel input() {
        
        //Creates the "holder" Panel with X-Axis boxlayout. 
        JPanel paletPanel = new JPanel ();
        paletPanel.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
        paletPanel.setLayout(new BoxLayout(paletPanel, BoxLayout.Y_AXIS));
        paletPanel.setBorder(BorderFactory.createCompoundBorder(
                                    BorderFactory.createTitledBorder("= Representador de Cónicas ="),
                                        BorderFactory.createEmptyBorder(5,5,5,5)));
        
        paletPanel.setBackground(Color.WHITE);
        
        //Create Elipsoids Panel
        JPanel elipsoids = new JPanel ();
        
        JLabel upper = new JLabel ("");
        
        
        //Create Parabola Panel
        JPanel parabola = new JPanel ();
        
        
        
        
        
        //Create Hiperbola Panel
        JPanel hiperbola = new JPanel ();
        
        
        
        //Puts the figure panels in the same panel
        JPanel figures = new JPanel ();
        
        JPanel figureStack [] = { elipsoids, parabola, hiperbola };
        String comboBoxItems [] = { "Elipsoides", "Parabolas", "Hiperbolas" };
        
        for (int i = 0; i < figureStack.length; i++) {
            figures.add(figureStack[i], comboBoxItems[i]);
        }
        
        //Initialize ComboBox
        JPanel comboBoxHolder = new JPanel ();
        
        JComboBox cb = new JComboBox(comboBoxItems);
        //cb.setEditable(false);
        comboBoxHolder.add(cb);
        
        //Adds components to paletPanel
        paletPanel.add(comboBoxHolder, BorderLayout.PAGE_START);
        paletPanel.add(figures, BorderLayout.CENTER);
        
        return paletPanel;
    }   
    
    JPanel test = new JPanel ();
    
    @Override
    JComponent output() {
        JPanel paletPanel = new JPanel ();
        
        return paletPanel;
    }

    @Override
    JComponent pastOutput() {
        JPanel paletPanel = new JPanel ();
        
        return paletPanel;
    }
    
}
