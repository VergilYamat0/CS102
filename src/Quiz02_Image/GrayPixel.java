/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz02_Image;

/**
 *
 * @author 3z
 */
public class GrayPixel extends Pixel{
    
    private int color;

    public GrayPixel() {
    }

    public GrayPixel(int color) {
       setColor(color);
    }
    public GrayPixel(GrayPixel gp){
        this(gp.color);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if(color >= 0 && color <= 255){
            this.color = color;
        }
        else
            throw new IllegalArgumentException("Wrong value");
    }
    public String toString(){
        return String.format("%d", color);
    }
    
}
