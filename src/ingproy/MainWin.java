/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author jtabo_000
 */
    abstract class MainWin extends JFrame implements ActionListener{
    private final String newLine = "/n";
    
    public MainWin (int winWidth, int winLength, String title, JComponent output, JComponent pastOutput){
        // Sets window's width and length, and spawning location.
        setTitle(title);
        setSize(winWidth, winLength);
        setLocation(500,300);
        
        // Generates main JPanel
        JPanel primaryPanel = new JPanel ();
        primaryPanel.setLayout(new BoxLayout (primaryPanel, BoxLayout.X_AXIS));
        primaryPanel.setBackground(Color.RED);
        
        // Inserts on the main JPanel two JPanels, one on the left and one on the right.
        JPanel leftPanel = new JPanel ();
        leftPanel.setLayout (new BoxLayout (leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(Color.BLACK);
        JPanel outputPanel = new JPanel ();
        outputPanel.setBackground(Color.BLUE);
        
        //Inserts the Scroller on the outputPanel where the outputs of the programs will be desplayed.
        JScrollPane outputScroller = new JScrollPane (output);
        outputPanel.add (outputScroller);
                
        primaryPanel.add (leftPanel);
        primaryPanel.add (outputPanel);
        
        // Inserts to the Left JPanel an upper and a lower JPannels
        JPanel inputPanel = new JPanel ();
        inputPanel.setBackground(Color.YELLOW);
        JPanel explorerPanel = new JPanel ();
        explorerPanel.setBackground(Color.darkGray);
        
        //Inserts the Scroller on the explorerPanel where the PAST OUTPUTS of the programs will be desplayed.
        JScrollPane explorerScroller = new JScrollPane (pastOutput);
        explorerPanel.add (explorerScroller);
        
        leftPanel.add (inputPanel);
        leftPanel.add (explorerPanel);
        
        add (primaryPanel);
    }
    
    public MainWin (int winWidth, int winLength, String title, JComponent output, JComponent pastOutput, int widthPos, int lengthPos){
        // Sets window's width and length, and spawning location.
        setTitle(title);
        setSize(winWidth, winLength);
        setLocation(widthPos,lengthPos);
        
        // Generates main JPanel
        JPanel primaryPanel = new JPanel ();
        primaryPanel.setLayout(new BoxLayout (primaryPanel, BoxLayout.X_AXIS));
        primaryPanel.setBackground(Color.RED);
        
        // Inserts on the main JPanel two JPanels, one on the left and one on the right.
        JPanel leftPanel = new JPanel ();
        leftPanel.setLayout (new BoxLayout (leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(Color.BLACK);
        JPanel outputPanel = new JPanel ();
        outputPanel.setBackground(Color.BLUE);
        
        //Inserts the Scroller on the outputPanel where the outputs of the programs will be desplayed.
        JScrollPane outputScroller = new JScrollPane (output);
        outputPanel.add (outputScroller);
        
        primaryPanel.add (leftPanel);
        primaryPanel.add (outputPanel);
        
        // Inserts to the Left JPanel an upper and a lower JPanels
        JPanel inputPanel = new JPanel ();
        inputPanel.setBackground(Color.YELLOW);
        JPanel explorerPanel = new JPanel ();
        explorerPanel.setBackground(Color.darkGray);
        
        //Inserts the Scroller on the explorerPanel where the PAST OUTPUTS of the programs will be desplayed.
        JScrollPane explorerScroller = new JScrollPane (pastOutput);
        explorerPanel.add (explorerScroller);
        
        leftPanel.add (inputPanel);
        leftPanel.add (explorerPanel);
        
        add (primaryPanel);
    }
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*FlowLayout layout = new FlowLayout();
        setLayout (layout);
        layout.setAlignment(FlowLayout.CENTER);
        
        JTextField textField = new JTextField(1);
        add (textField);*/