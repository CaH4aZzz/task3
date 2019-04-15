import java.util.ArrayList;

/**
 * Created by avokado on 15.04.2019.
 */
public class View {

    void printTriangleList(ArrayList<Triangle> listTriangle){
        int i = 1;
        for (Triangle triangle:listTriangle) {
            System.out.println(i + triangle.toString());
        }
    }
}
