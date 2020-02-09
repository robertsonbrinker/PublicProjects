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
public class DeptName {
    //declare variables
    private String department;
    private String location;
    //deptName constructor with a switch case
    public DeptName(String dpt){
        switch(dpt){
            case "HLP":
                department = "Call Center";
                location = "Wixom";
                break;
            case "RCV":
                department = "Shipping, Recieving, and Storage";
                location = "Warren";
                break;
            case "ACT":
                department = "Accounting";
                location = "Rochester";
                break;
            default:
                department = "error:department unknown";
                location = "error:location unknown";
                break;
        }
    }
    //creating get methods
    public String getDepartment(){
        return department;
    }
    
    public String getLocation(){
        return location;
    }
    
}
