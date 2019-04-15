import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by avokado on 15.04.2019.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Triangle t1 = new Triangle("t1", 2, 3 ,4);
//        Triangle t2 = new Triangle("t2", 3,4, 5);
//
//        System.out.println(t1);
//        System.out.println(t2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] stArr = s.split(",");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println("stArr [" + i + "]: " + stArr[i].trim());
        }
        System.out.println(stArr.length);
    }
}
