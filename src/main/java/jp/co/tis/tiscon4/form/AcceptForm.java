package jp.co.tis.tiscon4.form;

import nablarch.core.validation.ee.Required;

import java.io.Serializable;

public class AcceptForm implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 加入条件の同意確認 */
    @Required
    private String acceptance;

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }
}
