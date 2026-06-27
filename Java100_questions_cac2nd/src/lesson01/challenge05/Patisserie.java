/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int sitronStock = 30;
		int chocolateStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + sitronStock + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocolateStock + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistacheStock + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.println("シトロン　　　>");
		String sitronStr = reader.readLine();
		int sitron = Integer.parseInt(sitronStr);

		System.out.println("ショコラ　　　>");
		String chocolateStr = reader.readLine();
		int chocolate = Integer.parseInt(chocolateStr);

		System.out.println("ピスターシュ　>");
		String pistacheStr = reader.readLine();
		int pistache = Integer.parseInt(pistacheStr);

		System.out.println("\nシトロン" + sitron + "個");
		System.out.println("ショコラ" + chocolate + "個");
		System.out.println("ピスターシュ" + pistache + "個");

		int sumBuyCount = sitron + chocolate + pistache;
		int totalPrice = 250 * sitron + 280 * chocolate + 320 * pistache;

		System.out.println("\n合計個数　　" + sumBuyCount + "個");
		System.out.println("合計金額　" + totalPrice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
