/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

/**
 *
 * @author Sven
 */
public class PaintedText extends DrawingItem {
    
    private String content;

    private Font font;

    public PaintedText(String content, Font font, Point anchoir, Color color) {
        super(anchoir, color);
        this.content = content;
        this.font = font;
    }

    /**
     * Get the value of font
     *
     * @return the value of font
     */
    public Font getFont() {
        return font;
    }

    /**
     * Set the value of font
     *
     * @param font new value of font
     */
    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * Get the value of content
     *
     * @return the value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the value of content
     *
     * @param content new value of content
     */
    public void setContent(String content) {
        this.content = content;
    }

}
