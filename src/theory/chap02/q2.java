package theory.chap02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{5, 10, 73, 2, -5, 42};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<(arr.length/2);i++){
            int swap;
            swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            System.out.println("a["+i+"]과(와) "+"a["+((arr.length-1)-i)+"]를 교환합니다.");
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("역순 정렬을 마쳤습니다.");


        ///////////////////////////////// q3 ///////////////////////////////////////////////////////////////
        int sum = sumOf(arr);
        System.out.println("합계 ======>"+sum);
        ///////////////////////////////// q3 ///////////////////////////////////////////////////////////////

    }
    ///////////////////////////////// q3 ///////////////////////////////////////////////////////////////
    static int sumOf(int[] a){
        return Arrays.stream(a).sum();
    }
    ///////////////////////////////// q3 ///////////////////////////////////////////////////////////////
}
