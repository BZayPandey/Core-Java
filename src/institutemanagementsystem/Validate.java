/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutemanagementsystem;

/**
 *
 * @author shashi
 */
public class Validate {
    public static boolean checkLength(String title){
        if(title.length()>0){
        return true;
        }else{
            return false;
        }
    }
}
