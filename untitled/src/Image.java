import java.util.Scanner;
public class Image{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int NumOfCases = scan.nextInt();
        int[] Count = new int[31];

        // Base cases
        Count[0] = 1; // With 0 resend requests, there's exactly 1 way to send data from m1 to m3
        Count[1] = 3; // There are 3 ways with exactly 1 resend request

        // Fill the DP array up to n = 20
        for (int n = 2; n <= 20; n++) {
            Count[n] = 2 * Count[n - 1] + Count[n - 2];
        }

        // Read and process each test case
        for (int i = 0; i < NumOfCases; i++) {
            int x = scan.nextInt();

                //END
                //Do not edit anything below
                System.out.println(Count[x]);
            }

            scan.close();
        }
    }