/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrwk.pkg5_robertson._brinker;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author robertsonbrinker
 */
public class Hrwk5_Robertson_Brinker {
    /**
     * @param args the command line arguments
     */
    static int index = 0;
    
    public static void main(String[] args) throws IOException{
       //declare strings to pass from file to array
        String lastName;
        String firstName;
        String department;
        //sets up array and scanner
        Employee[] empArr = new Employee[13];
        Scanner scan = new Scanner(new File("Dept.txt"));
        //read in the file to the array
        Employee thisEmp;
        while(scan.hasNext()){
            lastName = scan.next();
            firstName = scan.next();
            department = scan.next();
            thisEmp = new Employee(lastName, firstName, department);
            empArr[index] = thisEmp;
            index++;
        }
        //print the results
        System.out.println("\nPRINT ALL\n-------------------------");
        printAll(empArr);
        System.out.println("\nPRINT ACCOUNTING\n-------------------------");
        printDepartment(empArr, "Accounting");
        System.out.println("\nPRINT WIXOM\n-------------------------");
        printLocation(empArr, "Wixom");
    }
    //loop through the array and print it
    public static void printAll(Employee[] arr){
        for(int round = 0; round < index;round++){
            System.out.println(arr[round].toString());
        }
    }
    //print array elements for a certain department
    public static void printDepartment(Employee[] arr, String d){
        for(int round = 0; round < index;round++){
            String thisDept = arr[round].getDept();
            if(thisDept.equals(d)){
                System.out.println(arr[round].toString());
            }
            
        }
    }
    //print array elements for a certain location
    public static void printLocation(Employee[] arr, String l){
        for(int round = 0; round < index;round++){
            String thisDept = arr[round].getLocation();
            if(thisDept.equals(l)){
                System.out.println(arr[round].toString());
            }
            
        }
    }
    
    
}
