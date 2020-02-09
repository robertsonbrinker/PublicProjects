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
public class Vegetable extends Food{
    //a variable that describes if a vegetable has a peel
    private boolean peel;
    //constructor that references the food contructor 
    public Vegetable(int nC, String clr, boolean p){
        super(nC, clr);
        peel = p;
    }
    //a method that represents boiling  a vegetable, making it more pale
    public void Boil(){
        super.setColor("pale-"+super.getColor()); 
        System.out.println("After being Boiled: \n"+ toString()+ "\n");

    }
    //a method to set whether a vegetable has a peel or not
    public void setPeel(boolean p){
        peel = p;
    }
    //tells if a method has a peel
    public boolean getPeel(){
        return peel;
    }
    //prints the info concerning the vegetable
    public String toString(){
        String s;
        s = super.toString()+
                "\nPeel: "+peel;
        return s;
    }
  
}
