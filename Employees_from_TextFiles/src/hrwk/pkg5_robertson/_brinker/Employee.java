/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrwk.pkg5_robertson._brinker;

/**
 *
 * @author robertsonbrinker
 */
public class Employee {
    //delare variables
    private static int count;
    private String fullName;
    private DeptName aDept;
    private String empDept;
    private String location;
    private String ID;
    //build the employee constructor
    public Employee(String last, String first, String dept){
        fullName = last + ", " + first;
        aDept = new DeptName(dept);
        location = aDept.getLocation();
        empDept = aDept.getDepartment();
        ID = fullName.charAt(0)+""+count;
        count++;
    
    }
    //get methods
    public String getLocation(){
        return location;
    }
    
    public String getDept(){
        return empDept;
    }
    
    public String getName(){
        return fullName;
    }
    
    public String toString(){
        String s;
        s = "Name: " + fullName +
            "\n\tID: " + ID + 
            "\n\tDepartment: " + empDept +
            "\n\tLocation: " + location;
        return s;
        // fullName, ID, empDept and location
        //Name: Seiber, Alexander
        //ID: E001
        //Department: Engineering
        //Location: Rochester Hills
    }
}
