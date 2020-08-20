package theory.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("요소 수 :::");
        int ac = sc.nextInt();
        int[] arr = new int[ac];
        int[] arr2 = new int[ac];
        System.out.println("배열 값 입력 :::");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        copy(arr,arr2);
        rcopy(arr,arr2);

    }

    static void copy(int[] a, int[] b){//복사
        for(int i =0;i<a.length;i++){
            b[i] = a[i];
        }

        System.out.println("a의 배열값 : "+Arrays.toString(a) +", b의 배열값 : "+Arrays.toString(b));
    }

    static void rcopy(int[] a, int[] b){//역순
        for(int i =0;i<a.length;i++){
            b[(a.length-1)-i] = a[i];
        }
        System.out.println("a의 배열값 역순 : "+Arrays.toString(a) +", b의 배열값 역순 : "+Arrays.toString(b));
    }
}
