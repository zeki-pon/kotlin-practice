/**
 * https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
 *
 * 基本的に、Nullを許容しないプロパティはコンストラクタで初期化しなければならないが、
 * 依存性の注入を通して初期化される場合やUTのsetUpメソッドのようなケースでは不便である。
 * そのような場合にクラスのボディ内でプロパティを参照する際にnullチェックを回避することを可能としている。
 * それが lateinit 修飾子
 */

class LateInitSample {
    // test codeで動作確認
}