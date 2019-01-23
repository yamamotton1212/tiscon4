package jp.co.tis.tiscon4.common.code;

public enum IndustryType implements CodeEnum {

    /** 農林水鉱 */
    PRIMARY("農林水鉱", "農業・林業・水産業・鉱業"),
    /** 建築不動産 */
    BUILDING("建築不動産", "建設・不動産業"),
    /** 製造 */
    MANUFACTURING("製造", "製造業"),
    /** 卸小売流通 */
    WHOLESALE("卸小売流通", "卸売業・小売・その他流通業"),
    /** 金融保険 */
    FINANCIAL("金融保険", "金融・保険業"),
    /** 運輸通信 */
    TRANSPORTATION("運輸通信", "運輸・通信業"),
    /** 電気ガス */
    ELECTRICAI("電気ガス", "電気・ガス業"),
    /** 官公庁 */
    GOVERNMENT("官公庁", "官公庁"),
    /** サービス */
    SERVICE("サービス", "その他サービス業"),
    /** その他 */
    OTHER("その他", "その他・不明");

    /** 業種のラベル */
    private final String label;
    /** 業種のコード */
    private final String code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    IndustryType(String code, String label) {
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
