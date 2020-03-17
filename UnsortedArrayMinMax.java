package BridgeLab;

/**
 * UnsortedArrayMinMax
 */
public class UnsortedArrayMinMax {

    public static void main(String[] args) {
        int[]  array = new int[20];
        for(int i=0 ; i<20 ;i++){
            array[i]=(int) (Math.random() * 500 + 1 );
            System.out.print(array[i]+ " ");
        }
        System.out.println("\nMax value element of array is : " + findMax(array));
        System.out.println("Min value element of array is : " + findMin(array));
    }

    private static int findMax(int[] array) {
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<20 ;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min=Integer.MAX_VALUE;
        for(int i=0 ; i<20 ;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
}