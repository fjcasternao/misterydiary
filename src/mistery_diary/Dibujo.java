/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mistery_diary;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author Sandra
 */
public class Dibujo {
    
    public void dibujarLinea(Graphics g, int x0, int y0, int x1, int y1){
        g.drawLine(x0, y0, x1, y1);
    }
    
    public void dibujarCirculo(Graphics g, int x0, int y0, int radio){
        g.drawOval(x0, y0, radio, radio); // x0 - coordenada x a la izq donde comienza
                                          // y0 - coordenada y a la izq donde comienza
    }
    
    public void dibujarCuadrado(Graphics g, int x0, int y0, int altura, int anchura, Color color){
       // g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
        g.setColor(color);
        g.fillRect(x0, y0, anchura, altura); // comienza a dibujarlo en la esquina superior izq
    }
    
}
