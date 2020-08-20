import java.util.Arrays;
import java.util.Scanner;
/*
 8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
*
* */
public class Practice_20200819_백준_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        String[][] arr = new String[m][n];

      /*  for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.next();
            }
        }*/
       /* arr[0] = new String[]{"W","B","W","B","W","B","W","B"};
        arr[1] = new String[]{"B","W","B","W","B","W","B","W"};
        arr[2] = new String[]{"W","B","W","B","W","B","W","B"};
        arr[3] = new String[]{"B","W","B","B","B","W","B","W"};
        arr[4] = new String[]{"W","B","W","B","W","B","W","B"};
        arr[5] = new String[]{"B","W","B","W","B","W","B","W"};
        arr[6] = new String[]{"W","B","W","B","W","B","W","B"};
        arr[7] = new String[]{"B","W","B","W","B","W","B","W"};
*/
        arr[0] = new String[]{"B","B","B","B","B","B","B","B","W","B","W","W"};
        arr[1] = new String[]{"B","B","B","B","B","B","B","B","B","W","B","B"};
        arr[2] = new String[]{"B","B","B","B","B","B","B","B","W","B","W","W"};
        arr[3] = new String[]{"B","B","B","B","B","B","B","B","B","W","B","B"};
        arr[4] = new String[]{"B","B","B","B","B","B","B","B","W","B","W","W"};
        arr[5] = new String[]{"B","B","B","B","B","B","B","B","B","W","B","B"};
        arr[6] = new String[]{"B","B","B","B","B","B","B","B","W","B","W","W"};
        arr[7] = new String[]{"B","B","B","B","B","B","B","B","B","W","B","B"};
        arr[8] = new String[]{"W","W","W","W","W","W","W","W","W","W","B","B"};
        arr[9] = new String[]{"W","W","W","W","W","W","W","W","W","W","B","B"};

      /*  for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){1
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }*/

        /*for(int q=0;q<8;q++){
            String[][] arr2 = new String[8][8];
            for(int q2=0;q2<8;q2++){
                arr2[q][q2]=
            }
        }*/


    /*    for(int q2=0;q2<8;q2++){
            for(int q3=0;q3<8;q3++){
                arr2[q2][q3] = arr[q2][q3];
            }
        }*/
        int minCount = 99999;
        int t0=(9-n);
        int t1=(9-m);
        if(t0 < 0){
            t0 =n-9;
        }
        if(t1<0){
            t1=m-9;
        }
       for(int z=0;z<=t1;z++){
            for(int z1=0;z1<=t0;z1++){
                int f=0;
                String[][] arr2 = new String[8][8];
                for(int q1=z;q1<(z+8);q1++){
                    int t=0;
                    for(int q2=z1;q2<(z1+8);q2++){
                        arr2[f][t]  = arr[q1][q2];
                        t++;
                    }
                    f++;
                }

                for(int tt=0;tt<arr2.length;tt++){
                    System.out.println(Arrays.toString(arr2[tt]));
                }
                System.out.println(" ");

                int count =0;
              /*  for(int f3=0;f3<arr2.length;f3++){
                    String f1S = arr2[f3][0];
                    System.out.println("f1S===>>>>>"+f1S);
                    for(int f1=0;f1<arr2.length;f1++){
                       if(f1S.equals("W")){
                            if((f1 % 2) > 0 && "W".equals(arr2[f3][f1])){//홀수
                                count++;
                            }
                            if((f1 % 2) == 0 && !"W".equals(arr2[f3][f1])){
                                count++;
                            }
                        }else{
                            if((f1 % 2) > 0 && "B".equals(arr2[f3][f1])){
                                count++;
                            }
                           if((f1 % 2) == 0 && !"B".equals(arr2[f3][f1])){
                               count++;
                           }
                        }
                    }
                    System.out.println(count);
                }*/
                System.out.println("totalCount---->>>"+count);
                if(count < minCount && count > 0){
                    minCount = count;
                }
            }
        }

        System.out.println("minCount..."+(minCount == 99999 ? 0 : minCount));
    }
}
