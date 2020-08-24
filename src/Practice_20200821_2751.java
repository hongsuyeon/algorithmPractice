import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/*
* -> 힙정렬
1. 배열에 그대로 삽입 해도 문제가 없음
2. 전체 개수에서 2/1 내림수 ex) 9일 경우 4
 특정한 트리 구조를 시작으로 힙구조를 생성 -> 상향식/ 하양식 힙구조 만들기가 가능
3. 상향식/하양식에 따라서 값이 달라진다
4. 힙구조를 한번 생성하고나면  맨위의 원소와 마지막 원소와 바꾸기 => 반복
5. 1부터 시작
6. 추가적인 배열이 별로도 필요하지 않는다는 점에서 메모리 측면에서 몹시 효율적이다.
7. 항상 O(N * log N)을 보장한다는 점에서 강력한 알고리즘.
* */
public class Practice_20200821_2751 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);

    }
}
