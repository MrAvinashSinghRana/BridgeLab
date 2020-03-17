package BridgeLab;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * StringFunctions
 */
public class StringFunctions {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter First String of anagram :  ");
        String string = sc.nextLine();
        System.out.println("Enter Second String of anagram :  ");
        String string1 = sc.nextLine();
        boolean bool1 = anagram(string ,string1);
        System.out.println("is both string are anagram ? : " + bool1);


        System.err.println("\nEnter a number to check palindrome : ");
        int numberPalindrome = sc.nextInt();
        sc.nextLine();
        boolean bool = palindrome(numberPalindrome);
        System.out.println("Is this number is palindrome ? : " + bool);

        String string2 = sc.nextLine();
        PermutationString(string2);
        sc.close();
    }

    static void PermutationString(String str){
        PermutationString(str, "");
        }
        static void PermutationString(String str, String prefix){
            if(str == null || str.length() < 2){
                return;
            }
        
            if(str.length() == 2){
                System.out.println(prefix + str);
                System.out.println(prefix + new StringBuffer(str).reverse().toString());
            }
        
            for(int i=0; i < str.length(); i++){
                char c = str.charAt(i);
                String s2 = "";
                for(int j = 0; j < str.length(); j++){
                    if(i != j){
                    s2 += str.charAt(j);
                    
                }
            }
            PermutationString(s2, prefix + c);
        }
        
    }   
    

    private static boolean palindrome(int numberPalindrome) {
        int num = numberPalindrome;
        int gen =0;
        while (num > 0){
            int c=num%10;
            gen = gen *10 + c;
            num /= 10 ;
        }
        if(gen == numberPalindrome){
            return true;
        }else return false;
    }

    private static boolean anagram(String string, String string1) {
        if(string.length() != string1.length()){
            return false;
        }
        else{
            char[] ch1 = string.toCharArray();
            char[] ch2 = string1.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String s1 = Arrays.toString(ch1);
            String s2 = Arrays.toString(ch2);
            if(s1.equals(s2)){
                return true;
            }
            else 
            return false;
        }
    }
}