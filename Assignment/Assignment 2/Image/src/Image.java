import java.util.Scanner;
public class Image{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int NumOfCases = scan.nextInt();
        int[] Count= new int[31];

        Count[0] = 1;
        for (int i = 0; i < NumOfCases; i++){
            int x = scan.nextInt();

        //Do not edit anything above
        //write the NSIDs of the members of your group here: SZM243
        //Write your code below1
        //BEGIN

            for (int n = 2; n <= 20; n++) {
                Count[1] = 3;
                Count[n] = 3 * Count[n - 1] - Count[n - 2];
            }

        //END
        //Do not edit anything below
            System.out.println(Count[x]);
        }
        scan.close();
    }
}
