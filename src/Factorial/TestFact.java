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
public class TestFact {
    public static void main(String[] args) {
            int data =10;
            
            RecusionFact testFact = new RecusionFact();
            long result = testFact.recursionFact(data);
            System.out.println("    "+result);
                    
    }
    
}
