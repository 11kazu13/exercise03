package exercise03;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {

	public static void main(String[] args) {
		// Taskクラスのインスタンス（タスク）を管理するリストを作成
		ArrayList<Task> tasks = new ArrayList<Task>();

		// ユーザー入力を受け取るためのScannerを作成
		Scanner sc = new Scanner(System.in);

		//=== ToDo管理アプリ ===と表示する
		System.out.println("=== ToDo管理アプリ ===");
		System.out.println();

		// サンプルタスクを3件作成（タイトル・説明・期限）
		Task task1 = new Task("掃除", "キッチンの掃除", "2025-12-29");
		Task task2 = new Task("勉強", "経理の勉強", "2025-12-25");
		Task task3 = new Task("課題", "数学の課題", "2025-12-24");

		// 作成したタスクをtasksリストに追加
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);

		// 登録済みのタスクを一覧表示
		System.out.println("=== タスク一覧 ===");
		
		for (Task task : tasks) {
			task.showTask();
		}
		
		System.out.println();

		// タスク情報をコンソールに表示
//		task1.showTask();
//		task2.showTask();
//		task3.showTask();

		// ユーザーに完了処理を行いたいタスクのタイトルを入力させる
		System.out.println("完了にするタスクのタイトルを入力してください > ");
		String target = sc.next();
		System.out.println();

		// 該当タスクが見つかったかどうかを記録
		boolean found = false;
		
		for (Task task : tasks) {
			if (target.equals(task.getTitle())) {
				task.setDone(true);
				System.out.println("=== 更新結果 ===");
				task.showTask();
				found = true;
				break;
			}	
		}
			
		if (!found) {
			System.out.println("該当タスクが見つかりませんでした。");
		}

		// Scannerを閉じてリソースを解放
		sc.close();
	}
}
