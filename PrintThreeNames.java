package BridgeLab;

/**
 * PrintThreeNames
 */
public class PrintThreeNames {

    public static void main(String[] args) {
        //to store commandline input 
        String[] names = new String[args.length];
        int j = args.length - 1;
        for(int i=0 ; i<names.length ;i++){
            names[i] = args[j];
            j--;
        }
        // to print output
        System.out.print("Hi ");
        if(names.length == 1){
            System.out.println(names[0]+".");
        }
        else{
        for(int i=0 ; i<names.length ;i++){
            if(i==names.length -1){
                System.out.print("and " + names[names.length-1]+".");
            }
            else{
                System.out.print(names[i]+", ");
            }
        }
    }

    }
}