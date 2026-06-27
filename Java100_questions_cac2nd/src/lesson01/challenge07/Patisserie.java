/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double sitron = Double.parseDouble(sitronStr);

		System.out.println("ショコラ　　　>");
		String chocolateStr = reader.readLine();
		double chocolate = Double.parseDouble(chocolateStr);

		System.out.println("ピスターシュ　>");
		String pistacheStr = reader.readLine();
		double pistache = Double.parseDouble(pistacheStr);

		System.out.println("\nシトロン" + sitron + "個");
		System.out.println("ショコラ" + chocolate + "個");
		System.out.println("ピスターシュ" + pistache + "個");

		double sumBuyCount = sitron + chocolate + pistache;
		int totalPrice = (int) (250 * sitron + 280 * chocolate + 320 * pistache);

		System.out.println("\n合計個数　　" + sumBuyCount + "個");
		System.out.println("合計金額　" + totalPrice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		int sitronNewStock = (int) (sitronStock - sitron);
		int chocolateNewStock = (int) (chocolateStock - chocolate);
		int pistacheNewStock = (int) (pistacheStock - pistache);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + sitronNewStock + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocolateNewStock + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistacheNewStock + "個");
	}

}
