import java.util.Arrays;
import java.util.Scanner;

public class Practice_20200821_2750 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Arrays.stream(arr).sorted().forEach(x-> System.out.println(x));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
