/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringSwap;

/**
 *
 * @author a_dav
 */
public class StringSwap {
    public static void main(String[] args) {
            String str1 ="Good";
            String str2="Morning";
            
            
            str1 = str1 + str2;
            
           // System.out.println("    "+str3);
            str2 = str1.substring(0,(str1.length()-str2.length()));
            str1 = str1.substring(str2.length());
            System.out.println(" Str1 & Str2   "+ str1+str2);
            
          //  String str3 = str1.substring(0, -3);
    }
    
    
    
}
