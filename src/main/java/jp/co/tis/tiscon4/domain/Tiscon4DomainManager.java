package jp.co.tis.tiscon4.domain;

import nablarch.core.validation.ee.DomainManager;

/**
 * {@link DomainManager} の実装クラス。
 * <p/>
 * ドメインを定義したBeanクラスを返却する。
 */
public final class Tiscon4DomainManager
    implements DomainManager<Tiscon4DomainBean> {

    @Override
    public Class<Tiscon4DomainBean> getDomainBean() {
        // ドメインBeanのClassオブジェクトを返す。
        return Tiscon4DomainBean.class;
    }
}
