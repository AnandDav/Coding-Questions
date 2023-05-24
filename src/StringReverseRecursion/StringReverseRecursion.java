/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringReverseRecursion;

/**
 *
 * @author a_dav
 */
public class StringReverseRecursion {
    
    public String reverseString(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        else
        {
            return reverseString(str.substring(1))+str.charAt(0);
        }
        
    }
    
}
