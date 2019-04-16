package validators;

import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.WrongParameterQuantityException;
import validators.IValidator;

/**
 * Created by avokado on 15.04.2019.
 */
public class TriangleValidator implements IValidator {

    private final int PARAMETER_COUNT = 4;

    @Override
    public boolean isValid(String params) throws WrongParameterQuantityException, EmptyStringException, IllegalArgumentException, NegativeArgumentValueException {

        String[] paramArray = params.split(",");
        int paramLength = paramArray.length;

        if (paramLength != PARAMETER_COUNT) {
            throw new WrongParameterQuantityException(paramLength);
        }

        for (int i = 0; i < paramLength; i++) {
            if (paramArray[i].trim().equals("")) {
                throw new EmptyStringException(i);
            }
        }

        for (int i = 1; i < paramLength; i++) {
            try {
                double param = Double.parseDouble(paramArray[i]);
                if (param < 0) throw new NegativeArgumentValueException(i);
            } catch (NumberFormatException e) {
                throw e;
            }
        }

        return true;
    }
}
