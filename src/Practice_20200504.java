import java.util.*;
import java.util.stream.IntStream;
//나누어 떨어지는 숫자 배열
public class Practice_20200504 {
    public static void main(String[] args) {
        int[] answer2;
        //answer2 = solution(new int[]{2, 36, 1, 3},1);
        answer2 = solution(new int[]{3, 2, 6},10);
       // answer2 = solution(new int[]{5, 9, 7, 10},5);
        System.out.println(Arrays.toString(answer2));
    }
    public static int[] solution(int[] arr, int divisor) {
        int[] answer  = {};
        //int[] answer   = Arrays.stream(arr).filter(x->x%divisor == 0).toArray();
        Integer[] answerI = Arrays.stream(arr).filter(x->x%divisor == 0).sorted().boxed().toArray(Integer[]::new);
        if(answerI.length>0){
            answer  = new int[answerI.length];
            for(int i=0;i<answerI.length;i++){
                answer[i] = answerI[i];
            }
        }else{
            answer  = new int[]{-1};
        }

        return answer;
    }
}
