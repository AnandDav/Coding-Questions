package Powerofsixteeen;

import java.util.HashMap;
import java.util.Map;
public class PowerofSixteen {
     public static final long finalValue = 65536;
     public static final int maxValue = Integer.MAX_VALUE;
     public static final int base = 16;
          Map<Integer,Boolean> digits = new HashMap<>();
    public PowerofSixteen() {
        digits.put(1, true);
        digits.put(2, true);
        digits.put(4, true);
        digits.put(8, true);
        }     
     public int isPowerofsixteen()
     {  int exponent=0;
        long result = 1 ;
       for(int i = 5;i<=maxValue;i++)
        {
          exponent = i;
          for (; exponent != 0; --exponent) {
                result *= base;
           }
           if(!resultContainsdigits(result)) return exponent;
                 
        }   
       return 0;
     }
     
     public boolean resultContainsdigits(long result)
     {
         if(result>finalValue)
            {
                 while(result>0)
                 {
                     int x = (int)result %10;
                   //  System.out.println(""+digits.get(x));
                     if(digits.containsKey(x))
                     {
                         return true;
                     }
                     result = result /10;
                 }
            }
         return false;
     }
     
    
}
