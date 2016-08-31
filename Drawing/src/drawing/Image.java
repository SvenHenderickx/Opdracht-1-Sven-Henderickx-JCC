/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.Point;
import java.io.File;

/**
 *
 * @author Sven
 */
public class Image extends DrawingItem {
    
    private File file;

    private double size;

    public Image(File file, double size, Point anchoir, Color color) {
        super(anchoir, color);
        this.file = file;
        this.size = size;
    }

    /**
     * Get the value of size
     *
     * @return the value of size
     */
    public double getSize() {
        return size;
    }

    /**
     * Set the value of size
     *
     * @param size new value of size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Get the value of file
     *
     * @return the value of file
     */
    public File getFile() {
        return file;
    }

    /**
     * Set the value of file
     *
     * @param file new value of file
     */
    public void setFile(File file) {
        this.file = file;
    }

}
