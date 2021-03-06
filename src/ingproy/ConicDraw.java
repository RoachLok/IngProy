/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingproy;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.QuadCurve2D;
import javax.swing.JComponent;

/**
 *
 * @author jtabo_000
 */
public class ConicDraw extends JComponent{
    
    int w = this.getWidth() / 2;
    int h = this.getHeight() / 2;
    int zoom, choice, a, b, k, he;
  
    public ConicDraw (int zoom, int choice, int a, int b, int he, int k){
        if (zoom == 0) zoom = 1;
        this.zoom = zoom;        
        this.choice = choice;
        this.a = a;
        this.b = b;
        this.k = k;
        this.he = he;
    }
    
    public Graphics getGraphic (Graphics g){
        return g;
    }
    
    public void paintComponent(Graphics g){
        w = this.getWidth() / 2;
        h = this.getHeight() / 2;

        Graphics2D g1 = (Graphics2D) g;
        g1.setStroke(new BasicStroke(2));
        g1.setColor(Color.black);
        g1.drawLine(0, h, w * 2, h);
        g1.drawLine(w, 0, w, h * 2);
        g1.drawString("0", w - 8, h + 14);
        
         Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.red);
     
        switch (choice){
            case 1:
                double centerW = (b*zoom/2);
                int Wcenter = (int) centerW;
                double centerH = (a*zoom/2);
                int Hcenter = (int) centerH;
                g2.drawOval((w-Wcenter + k), (h-Hcenter + he), b*zoom, a*zoom);
                break;
            case 2:
                g2.setStroke(new BasicStroke(1));
                g2.setColor(Color.red);
                
                Polygon p = new Polygon();
                for (int x = -w; x <= w; x++) {
                    p.addPoint(w + x*zoom, h - ((x - he)*(x - he) + k)*zoom);
                }
                g2.drawPolyline(p.xpoints, p.ypoints, p.npoints);       
                
                break;
            case 3:
                
                QuadCurve2D q = new QuadCurve2D.Float();
                // draw QuadCurve2D.Float with set coordinates
                q.setCurve(0, h, w*(a/10), h*(b/10), w, 0);
                g2.draw(q);
                QuadCurve2D q2 = new QuadCurve2D.Float();
                // draw QuadCurve2D.Float with set coordinates
                q2.setCurve(w*2, h, w*(b/10), h*(a/10), w, h*2);
                g2.draw(q2);
               
                break;
        } 
     
    }
    
    //((((x^2)+(he^2)-(2*x*he))-1)*b)-(k^2)+2*k
}
