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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Sven
 */
public class TestDrawing extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Drawing drawing = new Drawing("test", 50, 50);
        drawing.addItems(new Oval(80,20, new Point(40, 70), Color.PINK));
        drawing.addItems(new Oval(100,200, new Point(80, 100), Color.BLUE));
        Point[] vertices = {new Point( 20, 10), new Point(30, 10), new Point(20, 20), new Point(30, 20)};
        drawing.addItems(new Polygon(new Point(50, 50), Color.RED, vertices, 20));
        
        List<DrawingItem> tempItems = drawing.getItems();
        Collections.sort(tempItems);
        
        
        
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        for(DrawingItem d : tempItems){
            d.Drawing(gc);
            System.out.println(d.toString());
        }
        
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
