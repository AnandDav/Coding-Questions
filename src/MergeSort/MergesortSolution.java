/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSort;
import java.util.*;

/**
 *
 * @author Anand
 */
public class MergesortSolution {

    public static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int array[], int temp[], int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);

    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
              index++;
        }
        System.arraycopy(array,left,temp, index, leftEnd-left+1);
        System.arraycopy(array,right,temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void main(String[] args) {
       int[] data = {100,20,30,10,3,4,15,80,6,1,2};
        mergeSort(data);
    }

}
