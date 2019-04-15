import java.lang.reflect.Field;

/**
 * Created by avokado on 15.04.2019.
 */
public class Validator {
    ValidationResult isValid(String userInput){
        ValidationResult result = new ValidationResult();
        Field[] fields = result.getClass().getDeclaredFields();


        String[] paramArray = userInput.split(",");
        int paramLength = paramArray.length;

        if (paramLength != 4){
            result.isValid = false;
            return result;
        }

        for (int i = 0; i < paramLength; i++) {
            if (paramArray[i].trim().equals("")){
                result.isValid = false;
                return result;
            }
        }

        if (!(paramArray[0] instanceof String)){
            result.isValid = false;
            return result;
        }

        for (int i = 1; i < paramLength; i++) {
            try {
                result.firtsSide = Double.parseDouble(paramArray[i]);
                fields[i].setDouble();
            }
        }



        return result;
    }
}
