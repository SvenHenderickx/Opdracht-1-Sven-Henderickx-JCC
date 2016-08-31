/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Sven
 */
public class Polygon extends DrawingItem {
    
    private Point[] vertices;

    private int weight;

    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get the value of vertices
     *
     * @return the value of vertices
     */
    public Point[] getVertices() {
        return vertices;
    }

    
}
