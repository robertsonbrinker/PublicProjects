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
public class Hwrk6_Brinker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaring the array with two veggie objects and 2 potato objects
        Food arr[]= {
            new Vegetable(75, "green", false),
            new Vegetable(30, "red", false),
            new Potato(130, "light-red", true, false),
            new Potato(275, "yellow", false, true)
        };
        //looping the array to print the objects
        for(int i=0; i<4;i++){
            System.out.println("Class is : " + arr[i].getClass().getName());
            System.out.println(arr[i].toString()+"\n");
        }
        
        System.out.println("-------------------------");
        //the objects are sorted and their appropriate methods are executed on them
        for(int i=0; i<4;i++){
            if(arr[i].getClass().getSimpleName().equals("Vegetable")){
                ((Vegetable)arr[i]).Boil();
            }   
        
            if(arr[i].getClass().getSimpleName().equals("Potato")){
                ((Potato)arr[i]).Mash();
            }   
        }
    
    }
    
}
