/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Core;

import Major01_2017_Interfaces.Color;
import Major01_2017_Interfaces.Pixel;
import Major01_2017_Interfaces.RGBColor;

/**
 *
 * @author 3z
 */
public class RGBPixelImpl {

    public RGBColor rgb;

    public RGBPixelImpl(RGBColor rgb) {

    }

    public RGBPixelImpl(RGBPixelImpl cp) {

    }

    public String toString() {
        return String.format("(%s)", rgb);
    }

    public Color getColor() {
        Color rgbb = (Color) rgb;
        return rgbb;
    }
    public int compareTo(Pixel pixel){
        if(pixel instanceof RGBPixelImpl){
            RGBPixelImpl RGB = (RGBPixelImpl) pixel;
            return this.getColor() - RGB.getColor();
        }
        return -999;
    }

}
