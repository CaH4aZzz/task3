package validators;

import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.WrongParameterQuantityException;

/**
 * Created by avokado on 16.04.2019.
 */
public interface IValidator {
    boolean isValid(String params) throws WrongParameterQuantityException, EmptyStringException, NegativeArgumentValueException;
}
