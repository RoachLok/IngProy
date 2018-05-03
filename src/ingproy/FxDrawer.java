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
        paletPanel.setLayout(new BoxLayout(paletPanel, BoxLayout.Y_AXIS));
        paletPanel.setBorder(BorderFactory.createCompoundBorder(
                                    BorderFactory.createTitledBorder("= Representador de Cónicas ="),
                                        BorderFactory.createEmptyBorder(5,5,5,5)));
        paletPanel.setBackground(Color.WHITE);
        
        //"Spacer"
        JLabel blankSpace = new JLabel (" ");
        blankSpace.setBackground(Color.WHITE);
        
        //Eq. input field.
        JPanel inputSection = new JPanel ();
        inputSection.setLayout(new FlowLayout(3));
        
        JTextField inputText = new JTextField ("1/X", 10);
        Dimension minimumSize = new Dimension(100, 50);
        inputText.setMinimumSize(minimumSize);
        JLabel inputTextLabel = new JLabel ("Expresión: ");
        inputTextLabel.setLabelFor(inputText);
        inputSection.add(inputTextLabel);
        inputSection.add(inputText);
        
        // HACER UN ARRAY QUE CONTENGA A LOS COMPONENTES Y LES PONGA EL COLOR.
        inputSection.setBackground(Color.WHITE);
        inputText.setBackground(Color.WHITE);
        inputTextLabel.setBackground(Color.WHITE);
        
        //Adds it to the paletPanel.
        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);
        
        return paletPanel;
    }   
    
    JPanel test = new JPanel ();
    
    @Override
    JComponent output() {
        
        return test;
    }

    @Override
    JComponent pastOutput() {
        
        return test;
    }
    
}
