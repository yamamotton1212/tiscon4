package jp.co.tis.tiscon4.core.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 日本の電話番号が有効であることをチェックするバリデータクラス。
 *
 * @author Indo Yoshihiro
 */
public class JapaneseTelNumberValidator implements ConstraintValidator<JapaneseTelNumber, String> {


    @Override
    public void initialize(JapaneseTelNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value == null) {
            return true;
        } else if (!(value instanceof String)) {
            return false;
        } else if ("".equals(value)) {
            return true;
        }

        if (!VariousValidationUtil.isValidJapaneseTelNum((String) value)) {
            return false;
        }

        return true;
    }
}
