/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomantoInt;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anand
 */
public class RomantoInteger {
    
    public static int romanTointeger(String roman)
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for(int i=0;i<roman.length();i++)
        {
            if(i>0&&map.get(roman.charAt(i))>map.get(roman.charAt(i-1)))
            {
                result += map.get(roman.charAt(i)-2*map.get(roman.charAt(i-1))); 
            }
            else
            {
                result+=map.get(roman.charAt(i));
            }
        }
         
        
        
        
        
        return 0;
    }
    
}
