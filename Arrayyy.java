package BridgeLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * Arrayyy
 */
public class Arrayyy {

    public static void main(String[] args) {
        Integer[] a  ={1,2,3,4};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, a); 
        System.out.println(arr);

        // another method..

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(arr1);

        // another method .. 
        String[]  in = {"pallavi","dubey", "ji"};
        ArrayList<String> arr2 = new ArrayList<String>();
        for(String  s : in)
            arr2.add(s);
        System.out.println(arr2);
    // ANOTHER METHOD
        ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,5));   
        System.err.println(arr3); 

        // another method
        String[] i = {"pallavi","maharaj"};
        List<String>  arr4 = Arrays.asList(i);
        System.out.println(arr4);
        int[] i1 = {1,2,3,4,5,6};
        List<int[]> arr5= Arrays.asList(i1);
        for(int io : arr5.get(0)){
            System.out.print(io + " ");
        }
    }

}