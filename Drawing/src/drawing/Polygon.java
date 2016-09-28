/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Sven
 */
public class Polygon extends DrawingItem {
    
    private Point[] vertices;

    private int weight;

    public Polygon(Point anchoir, Color color, Point[] vertices, int weight) {
        super(anchoir, color);
        this.vertices = vertices;
        this.weight = weight;
    }

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

    @Override
    public String toString() {
        return "Polygon{" + "vertices=" + vertices + ", weight=" + weight + '}';
    }

    @Override
    public void Drawing(GraphicsContext gc) {
        gc.fillPolygon(getXPoints(), getYPoints(), vertices.length);
    }

    public double[] getXPoints(){
        double[] xpoints = new double[vertices.length];
        int count = 0;
        for(Point p : vertices){
            xpoints[count] = p.x;
            count++;
        }
        return xpoints;
    }
    
    public double[] getYPoints(){
        double[] ypoints = new double[vertices.length];
        int count = 0;
        for(Point p : vertices){
            ypoints[count] = p.y;
            count++;
        }
        return ypoints;
    }
}
