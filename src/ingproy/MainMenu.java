/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author antoniocalvocalvo
 * @author jtabo_000
 */
class MainMenu extends JFrame {

    static int tabCounter = 0;

    public MainMenu() {

        setTitle("Ventana Inicial");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        PanelPrincipal PP = new PanelPrincipal();
        add(PP, BorderLayout.NORTH);

        Footer foo = new Footer();
        add(foo, BorderLayout.SOUTH);
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

    public class PanelPrincipal extends JPanel implements ActionListener {

        private JButton boton1 = new JButton("Resolución Ecuaciones");
        private JButton boton2 = new JButton("Ecuaciones Cónicas");
        private JButton boton3 = new JButton("Crecimiento Población");
        private JFrame programsFrame = new JFrame();
        private JTabbedPane tabbedPane = new JTabbedPane();
        private ImageIcon icon = createImageIcon("images/middle.gif");

        public PanelPrincipal() {
            add(boton1, BorderLayout.WEST);
            boton1.addActionListener(this);
            boton1.setActionCommand("1");

            add(boton2, BorderLayout.CENTER);
            boton2.addActionListener(this);
            boton2.setActionCommand("2");

            add(boton3, BorderLayout.EAST);
            boton3.addActionListener(this);
            boton3.setActionCommand("3");

            programsFrame.setSize(1000, 600);
            programsFrame.setLocationRelativeTo(null);
            programsFrame.setTitle("Programas");

            tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        }

        //setSize(winWidth, winLength);
        //setLocationRelativeTo(null);
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("1")) {
                programsFrame.add(tabbedPane);
                programsFrame.setVisible(true);
                EqSolver EqSolver = new EqSolver(1000, 600, "EqSolver");
                tabbedPane.addTab("EqSolver", icon, EqSolver, "Resuleve Ecuaciones");
                tabbedPane.setMnemonicAt(tabCounter, KeyEvent.VK_1);

                ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane);
                tabbedPane.setTabComponentAt(tabCounter, tabComponent);
                tabCounter++;

            } else if (e.getActionCommand().equals("2")) {
                programsFrame.add(tabbedPane);
                programsFrame.setVisible(true);
                FxDrawer FxDrawer = new FxDrawer(1000, 600, "FxDrawer");
                tabbedPane.addTab("FxDrawer", icon, FxDrawer, "Representador de cónicas");
                tabbedPane.setMnemonicAt(tabCounter, KeyEvent.VK_2);

                ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane);
                tabbedPane.setTabComponentAt(tabCounter, tabComponent);
                tabCounter++;

            } else if (e.getActionCommand().equals("3")) {
                programsFrame.add(tabbedPane);
                programsFrame.setVisible(true);
                GrowthRepresenter GrowthRepresenter = new GrowthRepresenter(1, 1, "GrowthRepresenter");
                tabbedPane.addTab("Popu.Simu.", icon, GrowthRepresenter, "Simula el crecimieno de una población");
                tabbedPane.setMnemonicAt(tabCounter, KeyEvent.VK_3);

                ButtonTabComponent tabComponent = new ButtonTabComponent(tabbedPane);
                tabbedPane.setTabComponentAt(tabCounter, tabComponent);
                tabCounter++;
            }

        }
    }

    public class Footer extends JPanel implements ActionListener {

        JButton botonExit = new JButton("Exit");

        public Footer() {

            add(botonExit, BorderLayout.LINE_END);
            botonExit.addActionListener(this);

        }

        @Override //This method stops the program when clicked on the exit button
        public void actionPerformed(ActionEvent e) {

            System.exit(0);

        }

    }
}
