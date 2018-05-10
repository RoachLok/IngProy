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
        
        //"Spacer"
        JLabel blankSpace = new JLabel (" ");
        
        //Eq. input field.
        JPanel inputSection = new JPanel ();
        inputSection.setLayout(new FlowLayout(3));
        
        JTextField inputText = new JTextField ("1/X", 10);
        
        JLabel inputTextLabel = new JLabel ("Expresión: ");
        inputTextLabel.setFont(new Font(Font.SERIF, Font.PLAIN,  15));
        inputTextLabel.setLabelFor(inputText);
        inputSection.add(inputTextLabel);
        inputSection.add(inputText);
        
        //Button to input the data.
        JButton inButton = new JButton ();
        
        // Sets background color to all components.
        JComponent[] components = {blankSpace, inputSection, inputText, inputTextLabel, paletPanel};
        
        for (JComponent component : components) {
            component.setBackground(Color.WHITE);
        }
        
        // Adds it to the paletPanel.
        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);
        
        
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
