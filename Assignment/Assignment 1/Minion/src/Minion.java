import java.util.Scanner;

public class Minion{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int NumOfCases = scan.nextInt();
        int[] originalMoney = new int[31];

        originalMoney[0] = 0;
        for (int i = 0; i < NumOfCases; i++){
            int x = scan.nextInt();
            //Do not edit anything above

            // Write your code below
            // BEGIN

        // Precompute the original money for each k from 1 to 30
        for (int k = 1; k <= 30; k++) {
            int money = 0; // Start with 0 cents after the k-th day

            // Reverse the process for each day
            for (int j = 0; j < k; j++) {
                money = 2 * (money + 50); // Add 50 cents and double
            }
            originalMoney[k] = money / 100; // Convert cents to dollars
        }
            //END
            // Do not edit anything below
            System.out.println(originalMoney[x]);
        }

        scan.close();
    }
}
