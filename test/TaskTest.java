package exercise03.test;

// JUnit4のアサーションメソッドをインポート
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise03.Task;

public class TaskTest {

    // テスト対象の Task インスタンス
    private Task task;

    // 各テスト実行前に呼ばれる共通初期化処理
    @Before
    public void setUp() {
        // テスト用の Task インスタンスを生成
        // タイトル・説明・期限を設定、完了状態はデフォルトでfalse
        task = new Task("レポート提出", "技術レポートの作成", "2024-07-20");
    }

    // ---------------------------------------
    // コンストラクタの動作確認テスト
    // ---------------------------------------
    @Test
    public void testConstructor() {
        // コンストラクタで設定した値が正しく取得できるか確認
        assertEquals("レポート提出", task.getTitle());
        assertEquals("技術レポートの作成", task.getDescription());
        assertEquals("2024-07-20", task.getDueDate());
        assertFalse(task.isDone()); // デフォルトで未完了(false)であることを確認
    }

    // ---------------------------------------
    // getter / setter の動作確認テスト
    // ---------------------------------------
    @Test
    public void testGetterSetter() {
        // setter を使用して値を更新
        task.setTitle("買い物");
        task.setDescription("野菜と果物を買う");
        task.setDueDate("2024-07-22");
        task.setDone(true); // 完了状態をtrue(完了)に設定

        // 更新した値がgetterで正しく取得できるか確認
        assertEquals("買い物", task.getTitle());
        assertEquals("野菜と果物を買う", task.getDescription());
        assertEquals("2024-07-22", task.getDueDate());
        assertTrue(task.isDone()); // 完了状態がtrueになっているか確認
    }
}
