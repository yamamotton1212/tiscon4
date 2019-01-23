package jp.co.tis.tiscon4.common.code;

public enum JobType implements CodeEnum {

    /** 経営自営 */
    MANAGER("経営自営", "経営・自営業"),
    /** 会社員 */
    EMPLOYEE("会社員", "会社員"),
    /** 契約派遣 */
    TEMPORARY("契約派遣", "契約・派遣社員"),
    /** 公務員 */
    PUBLICWORKER("公務員", "公務員"),
    /** 民間団体 */
    NGO("民間団体", "民間団体"),
    /** 主婦 */
    HOUSEWIFE("主婦", "主婦"),
    /** 学生 */
    STUDENT("学生", "学生"),
    /** 年金受給 */
    PENSIONER("年金受給", "年金受給者の方"),
    /** パートアルバイト */
    PERTTIMEWORKER("パートアルバイト", "パート・アルバイト"),
    /** 他有職 */
    EMPLOYED("他有職", "その他 (有職）"),
    /** 他無職 */
    UNEMPLOYED("他無職", "その他 (無職）");

    /** 職業のラベル */
    private final String label;
    /** 職業のコード */
    private final String code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    JobType(String code, String label) {
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
