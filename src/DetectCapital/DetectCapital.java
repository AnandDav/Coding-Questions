/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DetectCapital;

import java.util.function.Predicate;

/**
 *
 * @author Anand
 */
public class DetectCapital {
    
    public boolean detectUppercaseUse(String str)
    {
        boolean result = false;
        int numberofCapitals = 0;
        
        for(int i=0;i<str.length();i++){
        if(Character.isUpperCase(str.charAt(i))){
            numberofCapitals++;
          }        
        }
        if(numberofCapitals==str.length()||numberofCapitals==0)
             return true;
        return numberofCapitals==1 && Character.isUpperCase(str.charAt(0));
        
        
        
    }
    
    public boolean detectUppercaseUseBrain(String str){
    
        if(str.length()<=1)
            return true;
        Predicate<Character> correctCase = Character :: isLowerCase;
        
        if(Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1))){
         correctCase = Character:: isUpperCase;
        }
        
        for(int i=1;i<str.length();i++){
        
            if(!correctCase.test(str.charAt(i))) return false;
         }
        
        return true;
    }
}
