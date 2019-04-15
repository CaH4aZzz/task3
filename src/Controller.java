import java.util.ArrayList;
import java.util.List;

/**
 * Created by avokado on 15.04.2019.
 */
public class Controller {

    private View view;
    private static List<Triangle> listTriangle = new ArrayList<>();

    public Controller(View view, List<Triangle> listTriangle) {
        this.view = view;
        this.listTriangle = listTriangle;
    }

    public List<Triangle> getListTriangle() {
        return listTriangle;
    }

    public static void createAndAdd(String userInput){
        addTriangleToTheList(createTriangle(userInput));
    }

    private static Triangle createTriangle(String userInput){
        validate(userInput);
        return new Triangle();
    }

    private static void validate(String userInput) {
        String[] paramArray = userInput.split(",");
        if (paramArray.length != 4){
            return ;
        }

        
    }

    private static void addTriangleToTheList(Triangle triangle){
        listTriangle.add(triangle);
    }



}
