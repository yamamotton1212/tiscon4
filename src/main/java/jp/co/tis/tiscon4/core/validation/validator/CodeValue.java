package jp.co.tis.tiscon4.core.validation.validator;

import jp.co.tis.tiscon4.common.code.CodeEnum;

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
 * {@link CodeEnum}のコード値のバリデーションを行うクラス。
 *
 * @author Indo Yoshihiro
 */
@Documented
@Constraint(validatedBy = CodeValueValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface CodeValue {

    /**
     * バリデーションエラー発生時に設定するメッセージ。
     *
     * @return メッセージ
     */
    String message() default "{nablarch.common.code.validator.ee.CodeValue.message}";

    /**
     * コードenumを取得する。
     *
     * @return コードenum
     */
    Class<? extends Enum<?>> enumClass();

    /** 複数指定用のアノテーション */
    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
    @Retention(RUNTIME)
    @Documented
    @interface List {

        /**
         * CodeValueの配列を取得する。
         *
         * @return CodeValueの配列
         */
        CodeValue[] value();
    }

    /**
     * グループを取得する。
     *
     * @return グループ
     */
    Class<?>[] groups() default {};

    /**
     * Payloadを取得する。
     *
     * @return Payload
     */
    Class<? extends Payload>[] payload() default {};

}
