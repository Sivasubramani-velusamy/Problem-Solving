
// Problem Description :

// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
// Example:

// Input:

// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2

// Output:- 4
public class RatAndHouse {
    public static void main(String[] args) {
        {
            int n = 8;
            int r = 7;
            int unit = 2;
            int[] house = { 2, 8, 0, 4, 7, 4, 1, 2 };
            int checked[]= new int[n];
            int c = solution(n, r, unit, house, checked);
            System.out.println(c);
        }
    }

    public static int solution(int n, int r, int unit, int[] house, int[] checked) {
            if(n==0) return -1;
            int reFood = unit * r;
            int avail = 0;
            // int h=0;
            for(int i=0;i<house.length;i++){
                if(avail != reFood){
                    checked[i] = house[i];
                avail += house[i];
                
            }
            if(avail >= reFood)
           {
            return i+1;
           }
        }
        return 0;
    }
}
