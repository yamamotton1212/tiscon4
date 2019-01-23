package jp.co.tis.tiscon4.core.validation.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * メールアドレスであることを表すアノテーション。<br>
 *
 * @author Indo Yoshihiro
 */
@Documented
@Constraint(validatedBy = MailAddressValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface MailAddress {

    /**
     * グループを取得する。
     *
     * @return グループ
     */
    Class<?>[] groups() default {};

    /**
     * メールアドレス精査エラーの場合のメッセージID。<br/>
     * 指定しなかった場合、デフォルトが使用される。
     */
    String message() default "{nablarch.core.validation.ee.MailAddress.message}";

    /**
     * Payloadを取得する。
     *
     * @return Payload
     */
    Class<? extends Payload>[] payload() default {};
}