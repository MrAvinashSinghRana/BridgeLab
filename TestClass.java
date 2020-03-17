package BridgeLab;
import java.io.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String [] NXY = br.readLine().split(" ");
         int N = Integer.parseInt(NXY[0]);
         int X = Integer.parseInt(NXY[1]);
         int Y = Integer.parseInt(NXY[2]);
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[N];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }
        
         long out_ = maxRent(N,X,Y,arr);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long maxRent(int N, int X, int Y, int[] arr){
        // Write your code here
        //int l = 2;
        int sum = 0;
        for(int i=1 ; i <= Y ; i++){
            
            if(i>1){
                X = X*2;
                for(int k=0 ; k<N ; k++ ){
                    arr[k] = arr[k]*2;
                }
            }
            int sumX=0;
            for(int j=0 ; j<N ; j++ ){
                int com = arr[j];
                for(int l=j ; l<N ; l++ ){
                   if(com<X){
                       com += arr[l];
                   }
                   if(com > X){
                       com -= arr[l];
                       break;
                   }
                }
                if(sumX<com){
                    sumX = com;
                }
            }
            sum = sum+sumX;
        }
        return (long)sum;
    }
}