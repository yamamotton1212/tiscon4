package jp.co.tis.tiscon4.dto;

import java.io.Serializable;

/**
 * 郵便番号データを保持するDTO。
 */
public class ZipcodeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 郵便番号（7桁） */
    private String zipcode;

    /**
     * 郵便番号（7桁）を返します。
     *
     * @return 郵便番号
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 郵便番号（7桁）を設定します。
     *
     * @param zipcode 郵便番号
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
