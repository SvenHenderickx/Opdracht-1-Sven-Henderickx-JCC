/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;


import java.awt.Font;
import java.awt.Point;
import java.io.File;
import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Sven
 */
public class DrawingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        Drawing drawing = new Drawing("test", 50, 50);
        drawing.addItems(new Oval(10,10, new Point(10, 10), Color.BLACK));
        Point[] tempPoints = {new Point(5,5), new Point(10,10)};
        drawing.addItems(new Spline(tempPoints, 2, "100", new Point(15,15), Color.BLUE));
        drawing.addItems(new PaintedText("Dit is een test", Font.getFont("Arial"), new Point(40, 10), Color.ORANGE));
        drawing.addItems(new Image(new File("C:\\Users\\Gebruiker\\Pictures\\Communie Luuk.jpg\\"), 4, new Point(45, 30), Color.GREEN));
        List<DrawingItem> tempItems = drawing.getItems();
        Collections.sort(tempItems);
        
        for(DrawingItem d : tempItems){
            System.out.println(d.toString());
        }
        
        
    }
}
