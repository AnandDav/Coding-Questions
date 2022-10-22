/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignHashTable;

/**
 *
 * @author Anand
 */
public class MyHashset {

    boolean[] arr;
    public MyHashset() {
        arr = new boolean[1000001];
    }
    
    public void addValue(int key)
    {
        arr[key]=true;
    }
    public void removeValue(int key)
    {
        arr[key]=false;
    }
    
    public boolean checkValue(int key)
    {
        return arr[key];
    }
}
