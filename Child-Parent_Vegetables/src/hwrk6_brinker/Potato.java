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
public class Potato extends Vegetable{
    //a varaible decribing if the potato is fried
    private boolean fried;
    //a constructor that references the vegetable constructor
    public Potato(int n, String c, boolean p, boolean f){
        super(n, c, p);
        fried = f;
    }

    
    //a method to mash a potato, making it white and without an outer peel
    public void Mash(){
        super.setColor("white");
        super.setPeel(false);
        System.out.println("After being Mashed: \n"+ toString()+ "\n");
    }
    //to set if a potato is fried
    public void setFried(boolean f){
        fried = f;
    }
    //to get info on if a potatp is fried
    public boolean getFried(){
        return fried;
    }
    //displays general information of the potato
    public String toString(){
        String s;
        s = super.toString()+
                "\nFried: "+fried;
        return s;
    }
    
}
