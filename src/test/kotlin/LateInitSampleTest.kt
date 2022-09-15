import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * lateinit修飾子は、クラスのボディ内でトップレベルのプロパティやローカル変数と同じように宣言される"var"プロパティで使用する。
 * (プライマリコンストラクタではなく、そのプロパティがカスタムゲッターやカスタムセッターを持っていないときのみ)
 * プロパティや変数の型は非null ※プリミティブ型はNG
 *
 * 初期化される前にlateinitプロパティにアクセスすると特別な例外が投げられる
 * ※アクセスされるプロパティと、それが初期化されていないことを明確に特定する例外
 */
internal class LateInitSampleTest {

    lateinit var testObject: TestObject
//    testObject: TestObject

    @BeforeEach
    fun setUp() {
        testObject = TestObject()  // lateinit var がない場合はここでエラー"Unresolved reference: testObject"
    }

    @Test
    fun test() {
        // late init varないとエラー"Unresolved reference: testObject"
        assertEquals("lateinit sample!", testObject.getMessage())
    }

    // .isInitializedで lateinit var が初期化済みかどうか確認できる
    @Test
    fun test_isInitialized() {
        assertTrue(this::testObject.isInitialized)
    }
}

class TestObject {
    fun getMessage(): String {
        return "lateinit sample!"
    }
}