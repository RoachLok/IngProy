/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

/**
 *
 * @author jtabo_000
 */
public class FxDrawer extends MainWin{
    
    public FxDrawer(int minWidth, int minLength) {
        super(minWidth, minLength);
        
    }
    
    public FxDrawer(int minWidth, int minLength, boolean scroller) {
        super(minWidth, minLength, scroller);
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
    
    public class OutPanel extends JPanel {
        
        protected void paintComponent (Graphics g){
            int w = this.getWidth() / 2;
            int h = this.getHeight() / 2;

            Graphics2D g1 = (Graphics2D) g;
            g1.setStroke(new BasicStroke(2));
            g1.setColor(Color.black);
            g1.drawLine(0, h, w * 2, h);
            g1.drawLine(w, 0, w, h * 2);
            g1.drawString("0", w - 7, h + 13);
        }
    }
    
    @Override
    JComponent output() {
        JPanel paletPanel = new JPanel ();
        
        OutPanel draw = new OutPanel();   
        draw.setBackground(Color.red);
        paletPanel.add(draw, BorderLayout.CENTER);
        
        return paletPanel;
    }

    @Override
    JComponent pastOutput() {
        JPanel paletPanel = new JPanel ();
        
        return paletPanel;
    }
    
}
