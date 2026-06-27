/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int sitronNewStock = sitronStock - sitron;
		int chocolateNewStock = chocolateStock - chocolate;
		int pistacheNewStock = pistacheStock - pistache;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + sitronNewStock + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocolateNewStock + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistacheNewStock + "個");

	}

}
