/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseInteger;

/**
 *
 * @author Anand
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int data = 2147483640;
        System.out.println(""+Integer.MAX_VALUE );
        System.out.println(""+reverseInteger(data));
    }
    
    public static long reverseInteger(int input)
    {
        long reversed=0;
        while(input!=0){
            reversed = reversed*10+input%10;
            input = input /10;
            if(reversed>Integer.MAX_VALUE || reversed <Integer.MIN_VALUE){
                return 0;
            }
        }
            
        
        return reversed;
    }
    
}
