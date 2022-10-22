/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.List;

/**
 *
 * @author Anand
 */
public class TestSolution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> reply = s.groupAnagrams(input);
        reply.forEach(System.out::println);
    }
}
