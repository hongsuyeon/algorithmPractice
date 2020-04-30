import java.util.*;
import java.util.stream.IntStream;
//K번째수
public class Practive_20200430 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}};
        int[] answer = new int[(commands.length)];

        for(int i=0;i<commands.length;i++){
            int[] command = commands[i];
            ArrayList<Integer> data = new ArrayList<Integer>();
            Arrays.stream(array,(command[0]-1),command[1]).sorted().forEach(n -> data.add(n));
            answer[i] = data.get((command[2]-1));
        }
    }
}
