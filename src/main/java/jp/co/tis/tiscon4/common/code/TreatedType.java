package jp.co.tis.tiscon4.common.code;

public enum TreatedType implements CodeEnum {

    /** 治療歴あり */
    TREATED("1", "はい"),
    /** 治療歴なし */
    UNTREATED("0", "いいえ");

    /** 治療歴有無のラベル */
    private final String label;
    /** 治療歴有無のコード */
    private final String code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    TreatedType(String code, String label) {
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
