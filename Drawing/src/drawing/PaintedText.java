/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;


import java.awt.Font;
import java.awt.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

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

    @Override
    public String toString() {
        return "PaintedText{" + "content=" + content + ", font=" + font + '}';
    }

    @Override
    public void Drawing(GraphicsContext gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
