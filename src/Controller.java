import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.WrongParameterQuantityException;
import model.Figure;
import model.Triangle;
import validators.IValidator;
import validators.TriangleValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Created by avokado on 15.04.2019.
 */
public class Controller {

    private IValidator validator = new TriangleValidator();
    private View view = new View();
    ArrayList<Figure> figureList = new ArrayList<>();

    void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        do {
            try {
                System.out.println("Please enter parameters of Triangle");
                userInput = reader.readLine();
                validator.isValid(userInput);
                figureList.add(createTriangle(userInput));

            } catch (IOException | WrongParameterQuantityException | EmptyStringException | InputMismatchException | NumberFormatException | ClassNotFoundException | IllegalAccessException | InstantiationException | NegativeArgumentValueException e) {
                view.printException(e);
            }

            System.out.println("Do you want to enter one more Triangle?");
            try {
                userInput = reader.readLine();
            } catch (IOException e) {
                view.printException(e);
            }
        } while ((userInput.equalsIgnoreCase("y")) || userInput.equalsIgnoreCase("yes"));

        try {
            reader.close();
        } catch (IOException e) {
            view.printException(e);
        }

        view.printTriangleList(figureList);
    }

    private Triangle createTriangle(String userInput) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String[] params = userInput.split(",");
        Class<?> triangleClass = Class.forName(Triangle.class.getName());
        Triangle triangle = (Triangle) triangleClass.newInstance();
        int counter = 0;

        for (Field field : triangleClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (counter == 0) {
                field.set(triangle, params[counter++]);
            } else field.set(triangle, Double.parseDouble(params[counter++]));
        }
        return triangle;
    }
}
