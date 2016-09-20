/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Sven
 */
public class Spline extends DrawingItem {
    
    private Point[] points;

    private int weight;

    private String degree;

    public Spline(Point[] points, int weight, String degree, Point anchoir, Color color) {
        super(anchoir, color);
        this.points = points;
        this.weight = weight;
        this.degree = degree;
    }

    /**
     * Get the value of degree
     *
     * @return the value of degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Set the value of degree
     *
     * @param degree new value of degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
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
     * Get the value of points
     *
     * @return the value of points
     */
    public Point[] getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Spline{" + "points=" + points + ", weight=" + weight + ", degree=" + degree + '}';
    }

    @Override
    public void Drawing(GraphicsContext gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
