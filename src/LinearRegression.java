
import javax.swing.JTextArea;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.math.plot.Plot2DPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class LinearRegression {
    double[]x={1,2,3,5,7,8,12,13,16,18};
    double[]y={1.3,3.4,5.4,7.2,10.3,9.3,8.9,11,13,12};
    SimpleRegression sr=new SimpleRegression();
    Plot2DPanel plot=new Plot2DPanel();
    JTextArea resultados=new JTextArea();
    public LinearRegression() {
        for (int i = 0; i < x.length; i++) {
            sr.addData(x[i],y[i]);
        }
        double[]yc=new double[y.length];
        for (int i = 0; i < x.length; i++) {
            yc[i]=sr.predict(x[i]);
        }
        plot.addLegend("South");
        plot.addScatterPlot("Datos",x,y);
        plot.addLinePlot("Regresion",x,yc);
        
        
    }
    
    public static void main(String[] args) {
        new LinearRegression();
    }
}
