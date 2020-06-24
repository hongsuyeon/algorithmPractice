import java.util.Arrays;

public class Practice_20200622_해쉬_전화번호목록 {
    public static void main(String[] args) {
        boolean test = solution(new String[]{"119", "97674223", "1195524421"});
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0;i<(phone_book.length-1);i++){
            if(phone_book[(i+1)].startsWith(phone_book[i])){
                answer=false;
                break;
            }
        }

        return answer;
    }
}
