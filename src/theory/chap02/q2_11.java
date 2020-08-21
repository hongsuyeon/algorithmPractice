package theory.chap02;

import java.util.Arrays;

public class q2_11 {
    public static void main(String[] args) {
        int counter =0;
        int ptr=0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;
        System.out.println(Arrays.toString(prime));
        for(int n=5; n <= 1000;n+=2){
            boolean flag =false;
            for(int i=1;prime[i] * prime[i] <=n; i++){
                System.out.println("i-->"+i);
                counter+=2;
                if(n%prime[i]==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                prime[ptr++] = n;
                counter++;
            }
        }
        for(int i=0;i<ptr;i++){
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나늣셈을 수행한 횟수 :" + counter);
    }
}
