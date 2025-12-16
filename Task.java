package exercise03;

public class Task {
	// タスクのタイトル
	public String title;
	// タスクの説明
	public String description;
	// タスクの期限
	public String dueDate;
	// タスクの完了状態（true: 完了、false: 未完了）
	public boolean isDone;

	// ---------------------------------------------------
	// 引数なしコンストラクタ
	// 全てのフィールドを "未設定" または false で初期化する
	// ---------------------------------------------------
	public Task() {
		this.title = "未設定";
		this.description = "未設定";
		this.dueDate = "未設定";
		this.isDone = false;
	}

	// ---------------------------------------------------
	// 引数ありコンストラクタ
	// タイトル・説明・期限を指定してタスクを生成し、
	// 完了状態は未完了(false)で初期化する
	// ---------------------------------------------------
	public Task(String title, String description, String dueDate) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.isDone = false;
	}

	// ---------------------------------------------------
	// タスクの内容をコンソールに出力するメソッド
	// 完了状態に応じて「完了」または「未完了」と表示する
	// ---------------------------------------------------
	public void showTask() {
		System.out.printf("タイトル：%s, 説明：%s, 期限：%s, ステータス：%s\n", this.title, this.description, this.dueDate, this.isDone);
	}

	// ---------------------------------------------------
	// 以下はカプセル化のための getter / setter メソッド
	// 各フィールドの値の取得・設定ができるようにする
	// ---------------------------------------------------

	// タイトルを取得する
	public String getTitle() {
		return this.title;
	}

	// タイトルを設定する
	public void setTitle(String title) {
		this.title = title;
	}

	// 説明を取得する
	public String getDescription() {
		return this.description;
	}

	// 説明を設定する
	public void setDescription(String description) {
		this.description = description;
	}

	// 期限を取得する
	public String getDueDate() {
		return this.dueDate;
	}

	// 期限を設定する
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	// 完了状態を取得する
	public boolean isDone() {
		return this.isDone;
	}

	// 完了状態を設定する
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
}
