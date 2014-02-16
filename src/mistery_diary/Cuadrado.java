/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mistery_diary;
import java.awt.Color;

/**
 *
 * @author Sandra
 */
public class Cuadrado {
    
    int x0, x1, y0, y1;
    Color color;
    
    public Cuadrado(int x0, int y0, int x1, int y1, Color color){
        this.x0=x0;
        this.y0=y0;
        this.x1=x1;
        this.y1=y1;
        this.color=color;
    }
    
    public int getX0(){
        return x0;
    }
    
    public int getX1(){
        return x1;
    }
    
    public int getY0(){
        return y0;
    }
    
    public int getY1(){
        return y1;
    }
    
    public Color getColor(){
        return color;
    }
}
