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
public class Image {
    private int width;
    private int height;
    private String name;

    public Image(int width, int height, String name) {
        setWidth(width);
        setHeight(height);
        setName(name);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return String.format("Image:\n name: %s \n width: %d \n height: %d", name, width, height);
    }
    
    
}
