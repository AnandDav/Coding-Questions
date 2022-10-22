/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeingQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anand
 */
public class SumofTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[]{3,3,2,2,3};
        int target = 5;
        int[] result = getTwosum(numbers, target); 
        System.out.print(result[0]+" "+result[1]);
    }
    public static int[] getTwosum(int[] numbers, int target)
    {
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int delta = target - numbers[i];
            if(visitedNumber.containsKey(delta)){
                return new int[]{i,visitedNumber.get(delta)};
            }
            visitedNumber.put(numbers[i], i);
            
        }
        return new int[]{-1,-1};
    }
    
}
