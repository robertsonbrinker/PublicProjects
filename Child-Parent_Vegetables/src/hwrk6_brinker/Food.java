/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwrk6_brinker;

/**
 *
 * @author robertsonbrinker
 */
public abstract class Food {
    //variable decribing a food's color and number of calories
    private int numCalories;
    private String color;
    //the food constructor
    public Food(int n, String c){
        numCalories = n;
        color = c;
    }
    // methods for the number of calories
        //sets the number of calories for a food object
    public void setNumCal(int num){
        numCalories = num;
    }
        //returns the numbero of calories for a food object
    public int getNumCal(){
        return numCalories;
    }
    //methods for the color of the food
        //sets the Color
    public void setColor(String col){
        color = col;
    }
        //return the color of a food object
    public String getColor(){
        return color;
    }
    //the Food toString method
    public String toString(){
        String s;
        s="Number of Calories: "+numCalories
                +"\nColor: "+color;
        return s;
    }
}
