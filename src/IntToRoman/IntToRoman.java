/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntToRoman;
import RomantoInt.*;

/**
 *
 * @author Anand
 */
public class IntToRoman {
    
    public static void main(String[] args) {
        System.out.println(""+intToRomn(3999));
        System.out.println(""+RomantoInteger.romanTointeger("MMMCMXCIX"));
    }
    
    public static String intToRomn(int input){
        String thousends[]={"","M","MM","MMM"};
         String hundreds[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String units[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return thousends[input/1000] + hundreds[(input%1000)/100]+tens[(input%100)/10]+units[input%10];
    }
}
