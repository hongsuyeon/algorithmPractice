import java.util.Scanner;

public class Practice_20200727_백준_2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        n = n - 45;
        if(n < 0){
           n = n + 60;
           h = h-1;
        }
        if(h < 0){
            h = 23;
        }

        System.out.println(h+" "+n);
        sc.close();
    }
}
