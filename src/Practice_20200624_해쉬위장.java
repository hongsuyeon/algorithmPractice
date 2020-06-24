import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

public class Practice_20200624_해쉬위장 {
    public static void main(String[] args) {
        int data1 = solution2(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"} ,{"green_turban", "headgear"}});
        int data2 = solution2(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}});

        System.out.println("1..."+data1+"//2...."+data2);
    }
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,HashSet<String>> arr = new HashMap<String,HashSet<String>>();
        String temp = clothes[0][1];
        HashSet<String> tempVal = new HashSet<String>();
        int i=0;
        while(i<clothes.length){
            for(int j=0;j<clothes.length;j++){
                if(j == (clothes.length-1)){
                    arr.put(temp, tempVal);
                    tempVal = new HashSet<String>();
                    temp = clothes[i][1];
                    tempVal.add(clothes[i][0]);
                    i++;
                }
                if(temp == clothes[j][1]){
                    tempVal.add(clothes[j][0]);
                }
            }
        }
        int[] arr2 = new int[arr.size()];
        int c =0;
        for(Map.Entry<String, HashSet<String>> key : arr.entrySet()){
            arr2[c] =  key.getValue().toArray().length;
            c++;
        }
        for(int re =0;re<arr2.length;re++){
            answer = answer * (arr2[re]+1);
        }
        answer= (answer -1);
        return answer;
    } ///난몰이상하게한걸까...모르겟다
    public static int solution2(String[][] clothes){

        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
