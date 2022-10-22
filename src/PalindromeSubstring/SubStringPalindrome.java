/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromeSubstring;

/**
 *
 * @author Anand
 */
public class SubStringPalindrome {
    
    int resultStart=0;
    int resultLenght=0;
    
    public String LongestPalindromString(String s)
    {
        int strlenght = s.length();
        if(strlenght<2)
        {
            return s;
        }
        for(int start=0;start<s.length()-1;start++)
        {
        expandRange(s,start,start);
        expandRange(s,start,start+1);
        
        }
        
        return s.substring(resultStart,resultStart+resultLenght) ;
    }

    private void expandRange(String s, int begin, int end) {
            while(begin>=0&&end<s.length()&&s.charAt(begin)==s.charAt(end)){
                begin--;
                end++;
            }
            if(resultLenght<end-begin-1){
                resultStart = begin+1;
                resultLenght = end-begin-1;
            }
        
    }
    
}
