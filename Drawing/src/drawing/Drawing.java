/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sven
 */
public class Drawing {
    
    private String name;

        private List<DrawingItem> items;

    /**
     * Get the value of items
     *
     * @return the value of items
     */
    public List<DrawingItem> getItems() {
        return items;
    }

    /**
     * Set the value of items
     *
     * @param items new value of items
     */
    public void setItems(List<DrawingItem> items) {
        this.items = items;
    }
    
    public void addItems(DrawingItem item){
        this.items.add(item);
    }


    private int width;

    private int height;

    public Drawing(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        items = new ArrayList<>();
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public void resetToPrevious(DrawingItem drawingItem){
        drawingItem = drawingItem.getPreviousState();
    }
}
