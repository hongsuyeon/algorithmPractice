public class Practice_20200706_핸드폰번호가리기 {
    public static String solution(String phone_number) {
        String answer = "";
        int i=0;
        while(i<phone_number.length()- 4){
            answer+="*";
            i++;
        }
        return answer+ phone_number.substring(phone_number.length()- 4, phone_number.length());
    }

    public static void main(String[] args) {
        solution("01012345678");
    }
}
