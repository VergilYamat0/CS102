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
public class ColorPixel extends Pixel {

    private int red;
    private int green;
    private int blue;

    public ColorPixel(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }
    public ColorPixel(ColorPixel cp){
        this(cp.red, cp.green, cp.blue);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (red >= 0 && red <= 255) {
            this.red = red;
        } else {
            throw new IllegalArgumentException("Wrong value");
        }

    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if (green >= 0 && green <= 255) {
            this.green = green;
        } else {
            throw new IllegalArgumentException("Wrong value");
        }

    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if (blue >= 0 && blue <= 255) {
            this.blue = blue;
        } else {
            throw new IllegalArgumentException("Wrong value");
        }

    }
    public String toString(){
        return String.format("%d %d %d", red, green, blue);
    }
}