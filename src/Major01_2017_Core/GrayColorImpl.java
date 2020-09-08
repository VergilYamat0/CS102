/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Core;

import Major01_2017_Interfaces.Color;
import Major01_2017_Interfaces.GrayColor;

/**
 *
 * @author 3z
 */
public class GrayColorImpl implements GrayColor {

    private byte color;

    public GrayColorImpl(byte color) {
        setGrayColor(color);
    }

    public GrayColorImpl(GrayColor gp) {
        this(gp.getGrayColor());
    }

    @Override
    public void setGrayColor(byte grayColor) {
        this.color = color;
    }

    @Override
    public byte getGrayColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%d", color);
    }

    public int compareTo(Color color) {
        if(color instanceof GrayColor){
            GrayColor gc = (GrayColor)color;
            return this.getGrayColor() - gc.getGrayColor();
            
        }
        return -999;
        
    }
}
            

