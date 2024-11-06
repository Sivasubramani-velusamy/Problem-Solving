
import java.util.Scanner;

public class GreenToRed {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] pens = new int[size];
        for(int i = 0 ; i<size; i++){
            pens[i]= sc.nextInt();
        }
        System.out.println(totalSwitchesFromGreenToRed(pens, size));
    }
    public static int totalSwitchesFromGreenToRed(int pens[],int size){
        int switches=0;
        for(int i =0 ; i<size-1; i++){
            if((pens[i] % 2 == 1 && pens[i+1]% 2==0) || (pens[i] % 2 == 0 && pens[i+1]% 2==1)){
                switches++;
            }
        }
        return switches;
    }
}
