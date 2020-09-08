/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Core;

import Major01_2017_Interfaces.Color;
import Major01_2017_Interfaces.GrayColor;
import Major01_2017_Interfaces.Pixel;

/**
 *
 * @author 3z
 */
public abstract class GrayPixelImpl implements Pixel {

    private GrayColor color;

    public GrayPixelImpl(Color color) {
        super();
        setColor(color);
    }

    @Override
  /*  public Color getColor() {
       Color color = (Color)GrayColor;
        return color;
    }*/

    public void setColor(Color color) {
        if (color instanceof GrayColor) {
            this.color = (GrayColor) color;
        }
    }

    public String toString() {
        return String.format("%d", color);
    }

    /*
    Pixel A is greater than Pixel B, if the color attribute of 
    A is greater than the color attribute of B. 
    Note that Color objects are already made Comparable. 
    
     */
    @Override
    public int compareTo(Pixel pixel) {

        //GrayColor this_gc = (GrayColor)this.getColor();
        //GrayColor pixel_gc = (GrayColor)pixel.getColor();
        //return this_gb.getColor()-pixel_gb.getColor();
        //return this_gc.compareTo(pixel_gc);
        return this.getColor().compareTo(pixel.getColor());
    }

}
