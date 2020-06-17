import java.util.*;
import java.util.stream.Stream;

public class Practive_20200617_백준_일곱난쟁이 {
    public static void main(String[] args) {
        String data ="";
      /*  for(int idx=0;idx<9;idx++){
            Scanner input = new Scanner(System.in);
            data += input.nextLine() + " ";
        }*/
        /*  20 7 23 19 10 15 25 8 13 */
        soultion("20 7 23 19 10 15 25 8 13");
    }

    /*
    20+7+23+19+10+15+25+8+13
    7+8+10+13+19+20+23
    */
    public static void soultion(String param){
        Scanner sc = new Scanner(System.in);

        final int size = 9;
        final int maxHeight = 100;

        int[] arr2 = new int[size];
        int sum = 0;
        boolean check = false;

        // 난쟁이의 키를 입력받는다
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
            sum += arr2[i];
        }
        boolean chk = false;
        for(int i=0;i<size;i++){
            if(chk) break;
            for(int j=(i+1);j<size;j++){
                if(sum -(arr2[i]+arr2[j])==100){
                    arr2[i] = -1;
                    arr2[j] = -1;
                    chk = true;
                    break;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int d=0;d<size;d++){
            if(arr2[d] != -1){
               result.add(arr2[d]);
            }
        }

        result.stream().sorted().forEach(x-> System.out.println(x));
    }
}
