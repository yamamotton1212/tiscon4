package jp.co.tis.tiscon4.core.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * メールアドレスが有効であるかをチェックするバリデータクラス。
 *
 * @author Indo Yoshihiro
 */
public class MailAddressValidator implements ConstraintValidator<MailAddress, String> {

    @Override
    public void initialize(MailAddress constraintAnnotation) {
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

        if (!VariousValidationUtil.isValidMailAddress((String) value)) {
            return false;
        }

        return true;
    }


}
