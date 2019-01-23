package jp.co.tis.tiscon4.core.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 郵便番号が有効であるかをチェックするバリデータクラス。
 *
 * @author Indo Yoshihiro
 */
public class ZipNumberValidator implements ConstraintValidator<ZipNumber, String> {

    @Override
    public void initialize(ZipNumber constraintAnnotation) {
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

        if (!VariousValidationUtil.isValidZipNum((String) value)) {
            return false;
        }

        return true;
    }


}
