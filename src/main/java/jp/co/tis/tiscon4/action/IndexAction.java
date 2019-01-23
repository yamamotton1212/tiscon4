package jp.co.tis.tiscon4.action;

import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;

/**
 * トップページに関するActionクラス.
 *
 * @author Kudo Sae
 */
public class IndexAction {

    /**
     * トップ画面を表示する。
     *
     * @param req リクエストコンテキスト
     * @param ctx HTTPリクエストの処理に関連するサーバ側の情報
     * @return HTTPレスポンス
     */
    public HttpResponse index(HttpRequest req, ExecutionContext ctx) {
        return new HttpResponse("index.html");
    }

}
