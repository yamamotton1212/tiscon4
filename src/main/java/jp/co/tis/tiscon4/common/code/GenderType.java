package jp.co.tis.tiscon4.common.code;

public enum GenderType implements CodeEnum {

    /** 男性 */
    MALE("male", "男性"),
    /** 女性 */
    FEMALE("female", "女性");

    /** 性別のラベル */
    private final String label;
    /** 性別のコード */
    private final String code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    GenderType(String code, String label) {
        this.label = label;
        this.code = code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getCode() {
        return code;
    }
}
