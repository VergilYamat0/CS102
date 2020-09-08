/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Core;

import Major01_2017_Interfaces.Color;
import Major01_2017_Interfaces.RGBColor;

/**
 *
 * @author 3z
 */
public class RGBColorImpl implements RGBColor {

    public byte Red;
    public byte Green;
    public byte Blue;

    public RGBColorImpl(byte R, byte G, byte B) {
        this.Red = R;
        this.Green = G;
        this.Blue = B;
    }

    @Override
    public byte getRed() {
        return Red;
    }

    @Override
    public void setRed(byte R) {
        this.Red = R;
    }

    @Override
    public byte getGreen() {
        return Green;
    }

    @Override
    public void setGreen(byte G) {
        this.Green = G;
    }

    @Override
    public byte getBlue() {
        return Blue;
    }

    @Override
    public void setBlue(byte B) {
        this.Blue = B;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%d)", Red, Green, Blue);
    }

    public void setColor(byte red, byte green, byte blue) {
        setBlue(blue);
        setRed(red);
        setGreen(green);
    }

    public int compareTo(Color color) {
        if (color instanceof RGBColor) {
            RGBColor rgb = (RGBColor) color;
            int sumThis = this.Red + this.getBlue() + this.Green; // A
            int sumColor = rgb.getBlue() + rgb.getGreen() + rgb.getRed();  // B
            return sumThis - sumColor;
        }
        return -9999;
    }

}
