/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

/**
 *
 * @author a_dav
 */
public class RecusionFact {
    
    public long recursionFact(int i)
    {
        long result = 0;
        if(i<=1)
            return i;
        else
            result = i * recursionFact(i-1);
        
        return result;
    }
    
}
