import java.util.Scanner;

public class Atminterface {
    public static void main(String[] args) {

        int choice;
        int pin = 0;
        long amount = 0;

        Scanner s = new Scanner(System.in);
        String transactionHistory = " ";
        int ID = 309268;
        do {
            System.out.println("Enter your ID  :- ");
            ID = s.nextInt();

            System.out.println("Enter your Pin :- ");
            pin = s.nextInt();

            if (ID != 309268 || pin != 897364)
                System.out.println("Please Enter correct Password");
        }

        while (ID != 309268 && pin != 897364);

        do {
            System.out.println("\n**---->  ATM SERVICE  <----**\n");
            System.out.println(" 1. Trasction History");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. Withdraw");
            System.out.println(" 4. Transfer");
            System.out.println(" 5. Quit");

            System.out.println("\n\nEnter your choice : ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Trasction History\n" + transactionHistory);
                    break;

                case 2:
                    System.out.println("\nEnter the amount to Deposit ");
                    int c = s.nextInt();
                    amount = amount + c;
                    System.out.println("Your balance is " + amount);
                    break;

                case 3:
                    System.out.println("\nEnter the amount to withdraw");
                    int r = s.nextInt();

                    if (r % 100 != 0) {
                        System.out.println("\nPlease Enter the amount in multiple of 100 ");
                    } else if (r > (amount - 500)) {
                        System.out.println("\nInsufficent Balance");
                    } else {
                        amount = amount - r;
                        System.out.println("\n\nPlease receive cash");
                        System.out.println("Your current balance is " + amount);
                    }
                    break;

                case 4:
                    System.out.println("*****----Transfer----*****"); {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\nEnter Receipent's Name : ");
                    String receipent = sc.nextLine();
                    System.out.print("\nEnter amount you wish to transfer : ");
                    float amount1 = sc.nextFloat();

                    try {
                        if (amount >= amount1) {
                            if (amount1 <= 20000f) {
                                // transaction++;
                                amount -= amount1;
                                System.out.println("\nSuccessfully Transfered to " + receipent);
                                String str = amount1 + " Rs transfered to " + receipent + "\n";
                                transactionHistory = transactionHistory.concat(str);
                            } else {
                                System.out.println("\ninvalid transfer..Limit is 20000.00 only");
                            }
                        } else {
                            System.out.println("\nInsufficient Balance");
                        }
                    } catch (Exception e) {
                    }
                }

                case 5:
                    System.out.println("Thanks for using ATM service");
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        } while (choice != 5);
    }
}