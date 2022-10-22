/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeingQuestions;

/**
 *
 * @author Anand
 */
public class StringReserves {
    public static void main(String[] args) {
        String str = "Hello World !!";
        System.out.println(reversewithStringBuilder(str));
         System.out.println(reversewithStringManually(str));
    }

    private static String reversewithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String reversewithStringManually(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
           }
        return sb.toString();
        
    }
}
