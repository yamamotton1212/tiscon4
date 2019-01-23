package jp.co.tis.tiscon4.common.code;

public enum InsuranceType implements CodeEnum {

    /** Treat */
    TREAT("treat", "treat"),
    /** TreatLady */
    TREATLADY("treatLady", "treatLady"),
    /** Future */
    FUTURE("future", "future");

    /** 保険タイプのラベル */
    private final String label;
    /** 保険タイプのコード */
    private final String code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    InsuranceType(String code, String label) {
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
