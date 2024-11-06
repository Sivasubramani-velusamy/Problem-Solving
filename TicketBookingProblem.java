import java.util.Scanner;

class TicketBookingProblem {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of tickets: ");
        int quantity = sc.nextInt();
        int amount = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter age for ticket " + (i + 1) + ": ");
            int age = sc.nextInt();

            switch (findAgeCategory(age)) {
                case "SENIOR" -> amount += 30;
                case "CHILD" -> amount += 20;
                case "NORMAL" -> amount += 50;
                default -> System.out.println("Invalid age");
            }
            
        }

        System.out.println("Total amount: " + amount);
        sc.close();
    }

    public static String findAgeCategory(int age) {
        if (age > 60)
            return "SENIOR";
        else if (age < 12)
            return "CHILD";
        else
            return "NORMAL";
    }
    
}
