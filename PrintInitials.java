package BridgeLab;

/**
 * PrintInitials
 */
public class PrintInitials {

    public static void main(String[] args) {
        for(int i = 0 ; i < 9 ; i++){
            for(int j=0; j<6 ; j++){
                if(j==0){
                    System.out.print("**");
                }
                if(j>=0 && i<=4 && i+j == 4 || i>4 && j>0 && i-j == 4 ){
                    System.out.print("*** ");
                }else System.out.print("  ");
            }
            System.out.print(" ");
            
            for(int j = 0 ; j<8 ; j++){
                if(j==0 || i==0 && j<4 || i==8 && j<4  || j>3 && i<4 && j-i == 4 ||
                 i==4 && j==7 || i>4 && j>3 && i+j == 12)
                    System.out.print("**");
                else {
                    if(j<5) System.out.print("  ");
                    else System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < 27; j++) {
                if(j==i && i<7  || i+j==26 && i<7 && j != 25 ||i==1 && j==24||
                        i>1 && i<7 && i+j == 14 || i>1 && i<7 && j-i == 12){
                    if(i==0 && j==0 ||  i==0 && j==26) System.out.print(" **");
                    else System.out.print("**");
                }else System.out.print(" ");
                if(i==7 && j==6 || i==7 && j==17 || i==1 && j==12){
                    System.out.print("***");
                }
                if(i==8 && j==8 || i==8 && j==21 || i==0 && j==13)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}

