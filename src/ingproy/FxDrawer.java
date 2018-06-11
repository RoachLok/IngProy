/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
/*
        GNU-JAVAPLOT IMPORTS
import ac.essex.graphing.plotting.*;
import ac.essex.graphing.plotting.ContinuousFunctionPlotter.*;
import ac.essex.graphing.plotting.Graph.*;
import ac.essex.graphing.*;
import ac.essex.graphing.plotting.*;
import ac.essex.graphing.plotting.ContinuousFunctionPlotter;
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author jtabo_000
 */
public class FxDrawer extends MainWin implements ActionListener{
    
    JSlider zoomSlider;
    JPanel paletPane, paletPanel3;
    int zoom = 1;
    ConicDraw cd;
    MainMenu mainMenu;
    private final ArrayList<JButton> pastButtons = new ArrayList<>();
    
    public FxDrawer(int minWidth, int minLength) {
        super(minWidth, minLength);
        
    }
    
    public FxDrawer(int minWidth, int minLength, boolean scroller, MainMenu mainMenu) {
        super(minWidth, minLength, scroller);
        this.mainMenu = mainMenu;
    }
    
    int a = 50, b = 50, k = 0, h = 0, choice = 1; 
    
    
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
    
    public class InputsPanel extends JPanel{
        JTextField aIn, bIn, kIn, hIn;
        public InputsPanel(boolean parabola){
        JPanel inputsPanel = new JPanel ();
        JLabel a = new JLabel ("a:");
        this.aIn = new JTextField ("50", 3);
        inputsPanel.add(a); inputsPanel.add(aIn);
        
        if (parabola == false){
        JLabel b = new JLabel ("b:");
        this.bIn = new JTextField ("50", 3);
        inputsPanel.add(b); inputsPanel.add(bIn);
        }
        
        JLabel k = new JLabel ("k:");
        this.kIn = new JTextField ("0", 3);
        inputsPanel.add(k); inputsPanel.add(kIn);
        
        JLabel h = new JLabel ("h:");
        this.hIn = new JTextField ("0", 3);
        inputsPanel.add(h); inputsPanel.add(hIn); 
       
        add(inputsPanel);
        }
        
        public int getAVal(){
            return  Integer.valueOf(aIn.getText());
        }
        public int getBVal(){
            return  Integer.valueOf(bIn.getText());
        }
        public int getKVal(){
            return  Integer.valueOf(kIn.getText());
        }
        public int getHVal(){
            return  Integer.valueOf(hIn.getText());
        }

        public void setaIn(String integer) {
            this.aIn = new JTextField (integer, 3);
        }

        public void setbIn(String integer) {
            this.bIn = new JTextField (integer, 3);
        }

        public void setkIn(String integer) {
            this.kIn = new JTextField (integer, 3);
        }

        public void sethIn(String integer) {
            this.hIn = new JTextField (integer, 3);
        }
        
        
    }
    InputsPanel ip, ip2, ip3;
    @Override
    JPanel input() {
        JPanel paletPane = new JPanel();
        paletPane.setLayout(new BoxLayout(paletPane,BoxLayout.Y_AXIS));

        //Upper Panel
        JLabel label = new JLabel("Elige el tipo de Cónica:");
        JPanel upperPanel = new JPanel();
        upperPanel.setBorder(BorderFactory.createTitledBorder("Representador de Cónicas"));
        
        String [] comboContent = {"Elipsoides","Parábola","Hipérbola"};
        JComboBox combo = new JComboBox(comboContent);
        upperPanel.setLayout(new FlowLayout());
        upperPanel.add(label);
        upperPanel.add(combo);
        upperPanel.getPreferredSize();
        
        //LowerPanel
        JPanel lowerPanel = new JPanel();
        lowerPanel.setBorder(BorderFactory.createTitledBorder("Introduce los datos"));
        CardLayout cardLayout = new CardLayout();
        lowerPanel.setLayout(cardLayout);
        
        //Elipsoid panel
        JLabel label12 = new JLabel ("===================================");
        JLabel label14 = new JLabel ("===================================");
        JLabel label1 = new JLabel();
        ImageIcon elipsoidsGIF = createImageIcon("icons/formula/elipsoid.gif");
        label1.setIcon(elipsoidsGIF); 
        JLabel label13 = new JLabel ("      Introduce los valores de:            ");
        JLabel label5 = new JLabel(" ");
        
        ip = new InputsPanel (false);
        
        JPanel elipsoidPanel = new JPanel(new FlowLayout());
        elipsoidPanel.setBackground(Color.white);
        elipsoidPanel.add(label12);
        elipsoidPanel.add(label1);
        elipsoidPanel.add(label14);
        elipsoidPanel.add(label13);
        elipsoidPanel.add(ip);
        JButton button1 = new JButton ("Representar");
        button1.addActionListener(this);
        button1.setActionCommand("1");
        elipsoidPanel.add(button1);
        lowerPanel.add(elipsoidPanel, "Elipsoides");
        
        ip2 = new InputsPanel (true);
        JLabel label22 = new JLabel ("===================================");
        JLabel label24 = new JLabel ("===================================");
        JLabel labe21 = new JLabel();
        JLabel iconLabel = new JLabel();
        ImageIcon parabolaGIF = createImageIcon("icons/formula/parabola.gif");
        iconLabel.setIcon(parabolaGIF);
        JLabel label2 = new JLabel("                Introduce los valores de:                   ");
        JPanel parabolaPanel = new JPanel(new FlowLayout());
        parabolaPanel.setBackground(Color.white);
        parabolaPanel.add(label22);
        parabolaPanel.add(iconLabel);
        parabolaPanel.add(labe21);
        parabolaPanel.add(label24);
        parabolaPanel.add(label2);
        parabolaPanel.add(ip2);
        JLabel spacer = new JLabel ("        ");
        parabolaPanel.add(spacer);
        JButton button2 = new JButton ("Representar");
        button2.addActionListener(this);
        button2.setActionCommand("2");
        parabolaPanel.add(button2);
        lowerPanel.add(parabolaPanel, "Parábola");
        
        //Hiperbola panel
        ip3 = new InputsPanel (false);
        JLabel label3 = new JLabel("Hipérbola");
        JLabel label32 = new JLabel ("===================================");
        JLabel label34 = new JLabel ("===================================");
        JLabel label355 = new JLabel();
        ImageIcon hiperbolaGIF = createImageIcon("icons/formula/hiperbola.gif");
        label355.setIcon(hiperbolaGIF); 
        JLabel label33 = new JLabel ("      Introduce los valores de:            ");
        JLabel label35 = new JLabel(" ");
        JPanel hiperbolaPanel = new JPanel(new FlowLayout());
        hiperbolaPanel.setBackground(Color.WHITE);
        hiperbolaPanel.add(label32);
        hiperbolaPanel.add(label355);
        hiperbolaPanel.add(label34);
        hiperbolaPanel.add(label33);
        hiperbolaPanel.add(ip3);
        JButton button3 = new JButton ("Representar");
        button3.addActionListener(this);
        button3.setActionCommand("3");
        hiperbolaPanel.add(button3);
        lowerPanel.add(hiperbolaPanel, "Hipérbola");
        
        paletPane.add(upperPanel);
        paletPane.add(lowerPanel);
        combo.addActionListener((ActionEvent e) -> {
            if (combo.getSelectedIndex()==0){
                cardLayout.show(lowerPanel, "Elipsoides");}
            if (combo.getSelectedIndex()==1){
                cardLayout.show(lowerPanel, "Parábola");}
            if (combo.getSelectedIndex()==2){
                cardLayout.show(lowerPanel, "Hipérbola");}
        });
        return paletPane;
    }   
    
    JPanel test = new JPanel ();
    
    @Override
    JComponent output() {
        paletPane = new JPanel ();
        
        paletPane.setLayout(new BorderLayout());
        
            cd = new ConicDraw (10, 2, a, b, k, h);
            //pastButtons.add(doPastButton("Parabola", 10, a, b, k, h));
            paletPane.add(cd);
            zoomSlider = new JSlider(JSlider.HORIZONTAL, -100, 100, 1);
                
            
            paletPane.add(zoomSlider, BorderLayout.SOUTH);     
            zoomSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                zoom = zoomSlider.getValue();
            }
            });     
        
        return paletPane;
    }
    
    public JButton doPastButton (String type, int zoom, int a, int b, int k, int h){
        String displayed = type+":  Zoom: "+zoom+". Valores: a: "+a+", b: "+b+", k: "+k+", h: "+h+".";
        
        JButton jbutton = new JButton (displayed);
        setBorder(null);
        jbutton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Pintar la misma pero con otro color cuando focus y poner como antes después.
        }   
        });
        return jbutton;
    }
    
    @Override
    JComponent pastOutput() {
        paletPanel3 = new JPanel ();
        paletPanel3.setBorder(BorderFactory.createTitledBorder("Funciones introducidas"));
        paletPanel3.setLayout(new BoxLayout(paletPanel3, BoxLayout.Y_AXIS));
        paletPanel3.add(doPastButton("Parabola", 2, a, b, k, h));
        
        return paletPanel3;
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        ConicDraw newCD;
        JButton newJB;
        switch (e.getActionCommand()) {
            case "1":
                a = ip.getAVal();
                b = ip.getBVal();
                k = ip.getKVal();
                h = ip.getHVal();
                choice = 1;
                newCD = new ConicDraw (zoom, choice, a, b, k, h);
                paletPanel3.add(doPastButton("Elipsoide", zoom, a, b, k, h));
                paletPanel3.revalidate();
                mainMenu.refreshTab();
                paletPane.add(newCD);
                break;
            case "2":
                a = ip2.getAVal();
                k = ip2.getKVal();
                h = ip2.getHVal();
                choice = 2;
                newCD = new ConicDraw (zoom, choice, a, b, k, h);
                int nulo = 0;
                paletPanel3.add(doPastButton("Parabola", zoom, a, nulo, k, h));
                paletPanel3.revalidate();
                mainMenu.refreshTab();
                paletPane.add(newCD);
                break;
            case "3":
                a = ip3.getAVal();
                b = ip3.getBVal();
                k = ip3.getKVal();
                h = ip3.getHVal();
                choice = 3;
                newCD = new ConicDraw (zoom, choice, a, b, k, h);
                paletPanel3.add(doPastButton("Hiperbola", zoom, a, b, k, h));
                paletPanel3.revalidate();
                mainMenu.refreshTab();
                paletPane.add(newCD);
                break;
            default:
                a = 50;
                b = 50;
                break;
        }
    }
}
