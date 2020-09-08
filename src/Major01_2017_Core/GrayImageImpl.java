/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Core;

import Major01_2017_Interfaces.Pixel;

/**
 *
 * @author 3z
 */
public class GrayImageImpl {

    private Pixel[][] img;
    private int width;
    private int height;
    private String name;

    private int maxColor = 255;

    public GrayImageImpl(int width, int height, String name, Pixel[][] img) {
        setWidth(width);
        setHeight(height);
        setName(name);
        img = new Pixel[height][width];
    }

    public GrayImageImpl(GrayImageImpl im) {
        this(im.getWidth(), im.getHeight(), im.getName(), im.img);

    }

    public int getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Pixel[][] getImg() {
        return img;
    }

    public void setImg(Pixel[][] img) {
        this.img = img;
    }
    

}
