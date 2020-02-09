/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwrk4_robertson_brinker;


import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author robertsonbrinker
 */
public class Hwrk4_Robertson_Brinker extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        //variable declaration
          int sceneWidth = 500;
          int sceneHeight = 500;
          int rectX;
          int rectY;
          int rectWidth;
          int rectHeight;
          //initializing the rectangle
          Rectangle myRect = null;
          //creating group, random, and arraylist objects
          Group aGroup = new Group();
          Random ro = new Random();
          ArrayList<Rectangle> rectList = new ArrayList();
          //a loop that creates a rectangle with random values and adds it to the list
          for (int i = 0; i < 1500; i++){
              rectWidth = ro.nextInt(11)+10;
              rectHeight = ro.nextInt(6)+10;
              rectX = ro.nextInt(sceneWidth);
              rectY = ro.nextInt(sceneHeight);
              myRect = new Rectangle(rectX, rectY, rectWidth, rectHeight);
              
              int r = ro.nextInt(256);
              int g = ro.nextInt(256);
              int b = ro.nextInt(256);
              Color clr = Color.rgb(r, g, b);
              myRect.setFill(clr);
              
              rectList.add(myRect);
          }
          //a loop that adds each rectnagle to the group
          for(Rectangle thisRect: rectList){
              aGroup.getChildren().add(thisRect);
          }
          //setting the scene
          Scene aScene = new Scene(aGroup, sceneWidth, sceneHeight);
          primaryStage.setTitle("Random Rectangles");
          primaryStage.setScene(aScene);
          primaryStage.show();
          
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
