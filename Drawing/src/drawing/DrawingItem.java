/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Sven
 */
public abstract class DrawingItem {
    
    private Point anchoir;

    private Color color;

    public DrawingItem(Point anchoir, Color color) {
        this.anchoir = anchoir;
        this.color = color;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Get the value of anchoir
     *
     * @return the value of anchoir
     */
    public Point getAnchoir() {
        return anchoir;
    }

    /**
     * Set the value of anchoir
     *
     * @param anchoir new value of anchoir
     */
    public void setAnchoir(Point anchoir) {
        this.anchoir = anchoir;
    }

}
