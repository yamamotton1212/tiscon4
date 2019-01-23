package jp.co.tis.tiscon4.form;

import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;

import java.io.Serializable;

public class IndexForm implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 保険の区分 */
    @Required
    @Domain("insuranceType")
    private String insuranceType;

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
