/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Major01_2017_Core;

import Major01_2017_Interfaces.Image;

/**
 *
 * @author 3z
 */
public class ImageImpl {
     private int width;
    private int height;
    private String name;

    public ImageImpl(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return String.format("Image: name: %s\n"
                + "width: %d\n"
                + "heigh: %d\n",name,
                this.getWidth(),this.getHeight());
    }   
    
     
    public int compareTo(Image img) {
        
        return (this.getWidth()*this.getHeight())-(img.getWidth()*img.getHeight());
    }
}

