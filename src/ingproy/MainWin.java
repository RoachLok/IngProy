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
import java.awt.*;

/**
 *
 * @author jtabo_000
 */
abstract class MainWin extends JPanel implements ActionListener {

    private final String newLine = "/n";

    public MainWin(int minWidth, int minLength) {
        // Sets window's width and length, and spawning location.
        
        setLayout(new BorderLayout());
        setSize(minWidth, minLength);

        // Generates main JPanel
        JPanel primaryPanel = new JPanel();
        primaryPanel.setLayout(new BoxLayout(primaryPanel, BoxLayout.X_AXIS));
        primaryPanel.setBackground(Color.RED);

        // Inserts on the main JPanel two Panels, one JPanel on the left and one JScrollerPane on the right.
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(Color.MAGENTA);
        JScrollPane outputScroller = new JScrollPane(output());
        
        outputScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        outputScroller.setBackground(Color.RED);

        //Sets a splitter between leftPanel and outputScroller by adding them to a JSplitPanel.
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, outputScroller);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(300);
        splitPane.setResizeWeight(0.30);

        //Provide minimum sizes for the two components in the split pane.
        Dimension minimumSize = new Dimension(100, 50);
        leftPanel.setMinimumSize(minimumSize);
        outputScroller.setMinimumSize(minimumSize);

        //Adds the splitPane to the primaryPanel
        primaryPanel.add(splitPane);

        //Inserts to the Left JPanel an upper JPanel and a lower JScrollerPane.
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout());
        inputPanel.setBackground(Color.YELLOW);

        JScrollPane explorerScrollPane = new JScrollPane(pastOutput());
        explorerScrollPane.setBackground(Color.darkGray);

        //Sets a splitter between inputPanel and explorerScrollPane.
        JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, inputPanel, explorerScrollPane);
        splitPane2.setOneTouchExpandable(true);
        splitPane2.setResizeWeight(0.5);

        //Allows to insert a JComponent inside inputPanel.
        inputPanel.add(input());

        //Adds the JSplitPane to the left JPanel
        leftPanel.add(splitPane2);

        add(primaryPanel);

    }

    public MainWin(int minWidth, int minLength, boolean scroller) {
        // Sets window's width and length, and spawning location.
        
        setLayout(new BorderLayout());
        setSize(minWidth, minLength);

        // Generates main JPanel
        JPanel primaryPanel = new JPanel();
        primaryPanel.setLayout(new BoxLayout(primaryPanel, BoxLayout.X_AXIS));
        primaryPanel.setBackground(Color.RED);

        // Inserts on the main JPanel two Panels, one JPanel on the left and one JScrollerPane on the right.
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(Color.MAGENTA);
        
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        outputPanel.add(output());
        outputPanel.setBackground(Color.RED);

        //Sets a splitter between leftPanel and outputScroller by adding them to a JSplitPanel.
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, outputPanel);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(300);
        splitPane.setResizeWeight(0.30);

        //Provide minimum sizes for the two components in the split pane.
        Dimension minimumSize = new Dimension(100, 50);
        leftPanel.setMinimumSize(minimumSize);
        outputPanel.setMinimumSize(minimumSize);

        //Adds the splitPane to the primaryPanel
        primaryPanel.add(splitPane);

        //Inserts to the Left JPanel an upper JPanel and a lower JScrollerPane.
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout());
        inputPanel.setBackground(Color.YELLOW);

        JScrollPane explorerScrollPane = new JScrollPane(pastOutput());
        explorerScrollPane.setBackground(Color.darkGray);

        //Sets a splitter between inputPanel and explorerScrollPane.
        JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, inputPanel, explorerScrollPane);
        splitPane2.setOneTouchExpandable(true);
        splitPane2.setResizeWeight(0.38);

        //Allows to insert a JComponent inside inputPanel.
        inputPanel.add(input());

        //Adds the JSplitPane to the left JPanel
        leftPanel.add(splitPane2);

        add(primaryPanel);

    }

    //Abstract methods that all windows should have. Further documentation will be added.
    abstract JComponent input();
    // Top-Left Panel.

    abstract  JComponent output();
    // Right Panel.

    abstract JComponent pastOutput();
    // Bottom-Left Panel.

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
