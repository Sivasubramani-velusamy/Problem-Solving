
import java.util.Scanner;

/**
 * sumsOfCubes
 */
public class SumsOfCubes {
    public static int cubesTotal(int m,int n){
        int total = 0;
        if(m > n){
            return 0;
        }
        for(int i = m ; i<=n; i++)total += (i*i*i);
        return total;
    }
    public static void main(String[] args) {
        System.out.print("value for m & n:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n= sc.nextInt();
        System.out.println("cubes :"+cubesTotal(m, n));
    }
}