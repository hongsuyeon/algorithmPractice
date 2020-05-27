import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice_20200527 {
    public static void main(String[] args) {
        //solution();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
       String text =  solution(participant, completion);
        System.out.println(text);
    }


    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i =0;      //a
        for(i =0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}
