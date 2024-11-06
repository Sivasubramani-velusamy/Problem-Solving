
import java.util.Scanner;

public class FoodOrdering {
    public static void main(String[] args) {
        System.out.println("Items and price");
        String[] items = { "Pizza = 200", "Burger =180 ", "Briyani =250 ", "Dosa = 80 ", "Idly =50" };
        // int[] price = {200,180,250,80,50};
        for (String i : items) {
            System.out.println(i);
        }
        int cost = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int actualQuantity =0;
        while (true) {
            System.out.println("type -1 to exit");
            System.out.println("Or enter food");
            String food = sc.next();
            if (food.equals("-1")) {
                break;
            }
            System.out.println("Enter quantity of food");
            int q = sc.nextInt();
            actualQuantity+=q;
            switch (food) {
                case "Pizza" -> cost += (200 * q);
                case "Burger" -> cost += (180 * q);
                case "Briyani" -> cost += (250 * q);
                case "Dosa" -> cost += (80 * q);
                case "Idly" -> cost += (50 * q);
            }
        }
        
        System.out.println("TOTAL ITEMS ORDERED: "+actualQuantity);
        if(cost>500){
            System.out.println("Actual Cost: "+ cost);
            int discountCost = (cost - (cost/10));
            System.out.println(discountCost);
        }
        else{
            System.out.println(cost);
        }
    }
}
