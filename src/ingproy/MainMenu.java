/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**         //TO DO LIST:   REWORK THE NEW TAB APPEARENCE.
 *         //               TEST THE jtb.changeEvent(); METHOD TO IMPROVE ADDTAB LISTENING.
 *
 * @author jtabo_000
 */
public class MainMenu extends JFrame implements ActionListener {

    static int tabCounter = 2;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JPanel addTab = new JPanel();
    private JPanel selectPanel = new JPanel();
    
    private ImageIcon eqButton = createImageIcon("icons/bigIcons/eq2.png");
    private ImageIcon fxButton = createImageIcon("icons/bigIcons/gr2.png");
    private ImageIcon grwButton = createImageIcon("icons/bigIcons/grow2.png");
    private JButton boton1 = new JButton("", eqButton);
    private JButton boton2 = new JButton("", fxButton);
    private JButton boton3 = new JButton("", grwButton);
    
    private ImageIcon growthIcon = createImageIcon("icons/poblacion.png");
    private ImageIcon eqSolverIcon = createImageIcon("icons/ecuaciones.png");
    private ImageIcon fxDrawIcon = createImageIcon("icons/conicas.png");
    
    private ImageIcon frameIcon = createImageIcon("icons/triple.png");
    
    private ImageIcon sumTab = createImageIcon("icons/suma4.png");
    private ImageIcon blankTab = createImageIcon("icons/blank.png");

    public MainMenu() {

        setIconImage(frameIcon.getImage());
        setSize(1100, 700);
        setLocationRelativeTo(null);
        setTitle("Proyecto");
        add(tabbedPane);

        selectPanel.setLayout(new BorderLayout());
        
        boton1.setPreferredSize(new Dimension((getWidth()/3)-5,getHeight()));
        selectPanel.add(boton1, BorderLayout.LINE_START);
        boton1.addActionListener(this);
        boton1.setActionCommand("1");

        boton2.setPreferredSize(new Dimension(getWidth()/3, getHeight()));
        selectPanel.add(boton2, BorderLayout.CENTER);
        boton2.addActionListener(this);
        boton2.setActionCommand("2");

        boton3.setPreferredSize(new Dimension((getWidth()/3)-5,getHeight()));
        selectPanel.add(boton3, BorderLayout.LINE_END);
        boton3.addActionListener(this);
        boton3.setActionCommand("3");
        
        tabbedPane.setFocusable(false);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        
        tabbedPane.addTab("Nueva Pestaña", blankTab, selectPanel, "Nueva pestaña");
        
        ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane, blankTab);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount()-1, tabComponent);
        
        tabbedPane.addTab("", sumTab, addTab, "Añadir Pestaña");
        AddButtonTabComponent addTabComp = new AddButtonTabComponent(tabbedPane, sumTab,this);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount()-1, addTabComp);  
        
    }
    
    public void addBlankTab (){
        ImageIcon blankTab = createImageIcon("icons/blank.png");
        tabbedPane.insertTab("Nueva Pestaña", blankTab, selectPanel, "Nueva pestaña",tabbedPane.getTabCount()-1);
        ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane, blankTab);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount()-2, tabComponent);
        tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-2);
    }
    
    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MainMenu.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int deducedIndex = tabbedPane.getTabCount()-2;
        if (e.getActionCommand().equals("1")) {
            add(tabbedPane);
            setVisible(true);
            EqSolver EqSolver = new EqSolver(1000, 600);
            tabbedPane.remove(deducedIndex);
            tabbedPane.insertTab("EqSolver", eqSolverIcon, EqSolver, "Resuleve Ecuaciones", tabbedPane.getTabCount()-1);
            tabbedPane.setMnemonicAt(deducedIndex, KeyEvent.VK_1);

            ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane, eqSolverIcon);
            tabbedPane.setTabComponentAt(deducedIndex, tabComponent);
            tabbedPane.setSelectedIndex(deducedIndex);

        } else if (e.getActionCommand().equals("2")) {
            add(tabbedPane);
            setVisible(true);
            FxDrawer FxDrawer = new FxDrawer(1000, 600, false);
            tabbedPane.remove(deducedIndex);
            tabbedPane.insertTab("FxDrawer", fxDrawIcon, FxDrawer, "Representador de cónicas", tabbedPane.getTabCount()-1);
            tabbedPane.setMnemonicAt(deducedIndex, KeyEvent.VK_2);

            ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane, fxDrawIcon);
            tabbedPane.setTabComponentAt(deducedIndex, tabComponent);
            tabbedPane.setSelectedIndex(deducedIndex);

        } else if (e.getActionCommand().equals("3")) {
            add(tabbedPane);
            setVisible(true);
            GrowthRepresenter GrowthRepresenter = new GrowthRepresenter(1, 1);
            tabbedPane.remove(deducedIndex);
            tabbedPane.insertTab("Popu.Simu.", growthIcon, GrowthRepresenter, "Simula el crecimieno de una población", tabbedPane.getTabCount()-1);
            tabbedPane.setMnemonicAt(deducedIndex, KeyEvent.VK_3);
            

            ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane, growthIcon);
            tabbedPane.setTabComponentAt(deducedIndex, tabComponent);
            tabbedPane.setSelectedIndex(deducedIndex);
        }

    }

}
