package validators;

import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.WrongParameterQuantityException;
import model.Figure;

public interface IValidator {
    Figure validate(String params) throws WrongParameterQuantityException, EmptyStringException, NegativeArgumentValueException;
}
