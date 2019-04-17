package validators;

import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.WrongParameterQuantityException;
import model.Triangle;

public class TriangleValidator implements IValidator {

    private final int PARAMETER_COUNT = 4;

    @Override
    public Triangle validate(String params) throws WrongParameterQuantityException, EmptyStringException, IllegalArgumentException, NegativeArgumentValueException {

        if (params == null){
            throw new NullPointerException();
        }

        String[] paramArray = params.split(",");
        int paramLength = paramArray.length;

        if (paramLength != PARAMETER_COUNT) {
            throw new WrongParameterQuantityException("Wrong quantity of parameters!\nPlease enter 4 parameter to create Triangle");
        }

        for (int i = 0; i < paramLength; i++) {
            if (paramArray[i].trim().equals("")) {
                throw new EmptyStringException("Empty string cannot be used as a parameter");
            }
        }

        for (int i = 1; i < paramLength; i++) {
            try {
                double param = Double.parseDouble(paramArray[i]);
                if (param < 0) throw new NegativeArgumentValueException("Negative number cannot be used as as parameter\nPlease enter positive number");
            } catch (NumberFormatException e) {
                throw e;
            }
        }

        String name = paramArray[0];
        double firstSide = Double.parseDouble(paramArray[1]);
        double secondSide = Double.parseDouble(paramArray[2]);
        double thirdSide = Double.parseDouble(paramArray[3]);
        return new Triangle(name, firstSide, secondSide, thirdSide);
    }
}
