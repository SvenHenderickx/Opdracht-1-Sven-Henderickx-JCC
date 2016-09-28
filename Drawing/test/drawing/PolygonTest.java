/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sven
 */
public class PolygonTest {
    
    Polygon testPolygon;
    
    public PolygonTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Point[] vertices = {new Point( 20, 10), new Point(30, 10), new Point(20, 20), new Point(30, 20)};
        testPolygon = new Polygon(new Point(10, 10), Color.RED, vertices, 10 );
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWeight method, of class Polygon.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Polygon instance = null;
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Polygon.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Polygon instance = null;
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVertices method, of class Polygon.
     */
    @Test
    public void testGetVertices() {
        System.out.println("getVertices");
        Polygon instance = null;
        Point[] expResult = null;
        Point[] result = instance.getVertices();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Polygon.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Polygon instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Drawing method, of class Polygon.
     */
    @Test
    public void testDrawing() {
        System.out.println("Drawing");
        GraphicsContext gc = null;
        Polygon instance = null;
        instance.Drawing(gc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXPoints method, of class Polygon.
     */
    @Test
    public void testGetXPoints() {
        System.out.println("getXPoints");
        double xpoints[] = {20, 30, 20, 30};
        for(double d : xpoints){
            System.out.println(d);
        }
        for(double d : testPolygon.getXPoints()){
            System.out.println(d);
        }
        assertEquals(xpoints, testPolygon.getXPoints());
    }

    /**
     * Test of getYPoints method, of class Polygon.
     */
    @Test
    public void testGetYPoints() {
        System.out.println("getYPoints");
        Polygon instance = null;
        double[] expResult = null;
        double[] result = instance.getYPoints();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
