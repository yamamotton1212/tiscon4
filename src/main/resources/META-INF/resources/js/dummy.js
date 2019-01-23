// FIXME: 時間計測のためにレンダリングblockを発生させる. 時が来たら消す.

(function (time) {
    var d1 = new Date();
    while (true) {
        if (new Date() - d1 > time) return;
    }
})(2000);
