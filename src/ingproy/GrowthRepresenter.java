package ingproy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author antoniocalvocalvo
 */
//In this class we will implement and resolve the population problem
public class GrowthRepresenter extends MainWin {

    private double k;
    private double poblInicial;
    private double tasaNat;
    private double generaciones;
    double poblacionFinal;

    public GrowthRepresenter(int winWidth, int winLength) {
        super(winWidth, winLength);
    }

    public GrowthRepresenter(int winWidth, int winLength, boolean scroller) {
        super(winWidth, winLength, scroller);
    }

    double primeraIteracion(double poblInicial, double tasaNat) {
        return poblInicial * tasaNat;
    }

    double segundaIteracion(double k, double poblInicial) {
        return (k - poblInicial) / k;
    }

    double poblacionFinal(double primeraIteracion, double segundaIteracion) {

        return segundaIteracion * segundaIteracion;
    }

    JPanel test = new JPanel();

    JPanel input() {
        //Creates the "holder" Panel with X-Axis boxlayout. 
        JPanel paletPanel = new JPanel();
        paletPanel.setLayout(new BoxLayout(paletPanel, BoxLayout.Y_AXIS));
        paletPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("= Representación crecimiento poblaciones ="),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        paletPanel.setBackground(Color.WHITE);

        //"Spacer"
        JLabel blankSpace = new JLabel(" ");
        blankSpace.setBackground(Color.WHITE);

        //Eq. input field.
        JPanel inputSection = new JPanel();
        inputSection.setLayout(new FlowLayout(3));

        JTextField limiteTexField = new JTextField("", 9); //aqui esta la chicha
        JTextField inicialTexField = new JTextField("", 9);
        JTextField natalidadTexField = new JTextField("", 9);
        JTextField generacionesTexField = new JTextField("", 9);

        JButton continuar = new JButton("Continuar");
        paletPanel.add(continuar, BorderLayout.WEST);
        continuar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                k = Double.valueOf(limiteTexField.getText());
                poblInicial = Double.valueOf(inicialTexField.getText());
                tasaNat = Double.valueOf(natalidadTexField.getText());
                generaciones = Double.valueOf(generacionesTexField.getText());

                PopulationDataHold pdh = new PopulationDataHold(k, poblInicial, tasaNat, generaciones);
                System.out.println("la primera iteracion es : "+ primeraIteracion(poblInicial, tasaNat));
                System.out.println("la segunda Iteracion es :" +segundaIteracion( k, poblInicial));
                System.out.println("la poblacion final es :" + poblacionFinal(generaciones, generaciones));
                
                
                
            
                

            }

        });

        Dimension minimumSize = new Dimension(100, 50);

        limiteTexField.setMinimumSize(minimumSize);//tamaño minimo para no espachurrar

        JLabel k = new JLabel("Limite popablación (k)");
        JLabel poblInicial = new JLabel(" Población Inicial ");
        JLabel tasaNat = new JLabel("Tasa natalidad ");
        JLabel generaciones = new JLabel("Generaciones");

        // continuar.addInputMethodListener(l);
        limiteTexField.setMinimumSize(minimumSize);

        k.setLabelFor(limiteTexField);
        inputSection.add(k);
        inputSection.add(limiteTexField);

        poblInicial.setLabelFor(inicialTexField);
        inputSection.add(poblInicial);
        inputSection.add(inicialTexField);

        tasaNat.setLabelFor(natalidadTexField);
        inputSection.add(tasaNat);
        inputSection.add(natalidadTexField);

        generaciones.setLabelFor(generacionesTexField);
        inputSection.add(generaciones);
        inputSection.add(generacionesTexField);

        //Adds it to the paletPanel.
        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);

        return paletPanel;
    }

    public void addLabels() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     //   k = Double.valueOf(limiteTexField.getText());
     //   poblInicial = Double.valueOf(inicialTexField.getText());
     //   tasaNat = Double.valueOf(natalidadTexField.getText());
      //generaciones = Double.valueOf(generacionesTexField.getText());

        PopulationDataHold pdh = new PopulationDataHold(k, poblInicial, tasaNat, generaciones);
        System.out.println(k + poblInicial + tasaNat + generaciones);

    }

    JComponent output() {
        JPanel paletPanel = new JPanel();
        paletPanel.setLayout(new BoxLayout(paletPanel, BoxLayout.Y_AXIS));
        paletPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("= Representación crecimiento poblaciones ="),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        paletPanel.setBackground(Color.WHITE);

        JLabel blankSpace = new JLabel(" ");
        blankSpace.setBackground(Color.WHITE);

        JPanel inputSection = new JPanel();
        inputSection.setLayout(new FlowLayout(3));

        JLabel jl = new JLabel("JLabel taxi = newprimeraIteracion : " + primeraIteracion(poblInicial, tasaNat));
        JLabel segundaIteracionn = new JLabel(" segundaIteracion: " + segundaIteracion(k, poblInicial));
        //JLabel poblacionFinall = new JLabel(" poblacionFinal " + poblacionFinal(primeraIteracion, segundaIteracion));

        //inputSection.add(taxi);
        inputSection.add(segundaIteracionn);
        // inputSection.add(poblacionFinall);

        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);

        return paletPanel;
    }

    @Override
    JComponent pastOutput() {
        JPanel paletPanel = new JPanel();
        paletPanel.setLayout(new BoxLayout(paletPanel, BoxLayout.Y_AXIS));
        paletPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("= Representación total  ="),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        paletPanel.setBackground(Color.WHITE);

        //"Spacer"
        JLabel blankSpace = new JLabel(" ");
        blankSpace.setBackground(Color.WHITE);
        JPanel inputSection = new JPanel();
        inputSection.setLayout(new FlowLayout(3));

        double poblacionTotal = poblacionFinal * generaciones;

        JLabel poblacionTotall = new JLabel(" Población Total:" + Double.toString(poblacionTotal));
        inputSection.add(poblacionTotall);

        paletPanel.add(blankSpace);
        paletPanel.add(inputSection);

        return paletPanel;
    }

}
