import model.Figure;
import model.Triangle;
import validators.IValidator;
import validators.TriangleValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Controller {

    void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        View view = new View(reader);
        IValidator validator = new TriangleValidator();
        ArrayList<Figure> figureList = new ArrayList<>();
        String userInput = null;

        do {
            try {
                userInput = view.getUserInput("Please enter parameters of Triangle");
                figureList.add(validator.validate(userInput));
            } catch (Exception e) {
                view.printException(e);
            }
            try {
                userInput = view.getUserInput("Do you want to continue?");
            } catch (IOException e) {
                view.printException(e);
            }
        } while ((userInput.equalsIgnoreCase("y")) || userInput.equalsIgnoreCase("yes"));

        try {
            reader.close();
        } catch (IOException e) {
            view.printException(e);
        }

        view.printSortedTriangleList(figureList);
    }

//    private Triangle createTriangle(String userInput) {
//
//        String[] params = userInput.split(",");
//        String name = params[0];
//        double firstSide = Double.parseDouble(params[1]);
//        double secondSide = Double.parseDouble(params[2]);
//        double thirdSide = Double.parseDouble(params[3]);
//        return new Triangle(name, firstSide, secondSide, thirdSide);
//    }

    //    private Triangle createTriangle(String userInput) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        String[] params = userInput.split(",");
//        Class<?> triangleClass = Class.forName(Triangle.class.getName());
//        Triangle triangle = (Triangle) triangleClass.newInstance();
//        int counter = 0;
//
//        for (Field field : triangleClass.getDeclaredFields()) {
//            field.setAccessible(true);
//            if (counter == 0) {
//                field.set(triangle, params[counter++]);
//            } else field.set(triangle, Double.parseDouble(params[counter++]));
//        }
//        return triangle;
//    }

}
