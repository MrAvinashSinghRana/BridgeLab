package BridgeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * WordListBinarySearch
 */
public class WordListBinarySearch  {

    public static void main(String[] args) throws IOException{

        /**
         * taking input as string from console
         * bufferedreader used to read line from console 
         */

        System.out.println("Type a  comma seperated string : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // using regex to split string into vrious string

        String[] str = br.readLine().split(",");

        // input for searching 

        System.out.println("type word to be search : ");

        String word = br.readLine();

        // java.util.Arrays.sort() used to sort the string in ascending order

        Arrays.sort(str);
    
        // creating two different variable to execute binary search 
        // complexity og bineary search is O(n log n)
        int lo = 0 ; 
        int hi = str.length -1;
        boolean bool =  binarySearch(str,lo,hi,word);

        System.out.println(bool);
    }

    private static boolean binarySearch(String[] str, int lo, int hi, String word) {
        int mid  =  (hi - lo )/2;
        if(lo == hi){
            if(word.compareToIgnoreCase(str[lo])==0) return true;
            return false;
        }
        if(word.compareToIgnoreCase(str[mid])==0){

            return true;
        }
        else if(word.compareToIgnoreCase(str[mid])<0){
            binarySearch(str, lo, mid-1, word);
        }
        else binarySearch(str, mid+1, hi, word);
        return false;
    }
}