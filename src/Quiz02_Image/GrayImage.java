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
public class GrayImage extends Image{
    
    private GrayPixel[][] img;

    public GrayImage(int width, int height, String name) {
        super(width, height, name);
        setImg(img);
        img = new GrayPixel[height][width];
    }
    public GrayImage(GrayImage gi){
        this(gi.getWidth(), gi.getHeight(), gi.getName());
    }

    public GrayPixel[][] getImg() {
        return img;
    }

    public void setImg(GrayPixel[][] img) {
        this.img = img;
    }
    
    
}
