
public class Practice_20200607 {
    public static void main(String[] args) {
//        String[] offers = {"10/15 11/03 3000", "10/20 11/01 3500", "11/02 11/11 4000"};
        String[] offers = {"07/01 07/30 2000", "07/01 07/15 2000", "07/01 07/30 2000", "07/01 07/30 1500", "07/05 07/30 2100", "07/20 08/01 2400", "07/20 07/31 2400", "07/31 09/01 2900", "08/01 08/15 3000", "08/14 08/19 2000","08/17 08/30 4000"};
        int sum = solution(offers);
        System.out.println(sum);
    }

    public static int solution(String[] offers) {
        int answer = 0;
        String[] temp = null;
        for(String  st : offers){
            if(temp == null){
                temp = st.split(" ");
            }else{
                String[] arr = st.split(" ");
                if(Integer.parseInt(temp[1].replaceAll("/", "")) < Integer.parseInt(arr[0].replaceAll("/", ""))) {
                    break;
                }

                if(Integer.parseInt(temp[2]) < Integer.parseInt(arr[2])){
                    temp = arr;
                }else if(Integer.parseInt(temp[2]) == Integer.parseInt(arr[2])){
                        if (Integer.parseInt(temp[1].replace("/", "")) < Integer.parseInt(arr[1].replace("/", ""))) {
                            temp = arr;
                        }
                    }
                }
            }
           answer = Integer.parseInt(temp[2]);

            return answer;
    }
}
