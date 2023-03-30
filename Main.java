import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean condition = true;
        while(condition){
            System.out.println("Solve problem with?: \n 1. Recursive \n 2. Iterative \n 3. Exit The Program \n Choice: \n");
            Scanner chc = new Scanner(System.in);
            int choice = chc.nextInt();

            if(choice == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of disk: ");
                int n = sc.nextInt();
                HanoiRecursive.HanoiStack(n, '1', '3', '2');
                System.out.println("\n");
            }
            else if (choice == 2) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the No. of Disks : ");
                HanoiIterative toh = new HanoiIterative(scan.nextInt());
                toh.execute();
                System.out.println("\n");
            }
            else if (choice == 3){
                System.out.println("Program is being exited...");
                condition = false;
            }

        }
    }
}