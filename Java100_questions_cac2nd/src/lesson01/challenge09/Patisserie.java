/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計　　　\\" + totalPrice);
		System.out.println("\n内訳");
		System.out
				.println("シトロン　　　\\" + (int) (250 * sitron) + "・・・" + (int) ((250 * sitron) / totalPrice * 100) + "%");
		System.out.println(
				"ショコラ　　　\\" + (int) (280 * chocolate) + "・・・" + (int) ((280 * chocolate) / totalPrice * 100) + "%");
		System.out.println(
				"ピスターシュ　\\" + (int) (320 * pistache) + "・・・" + (int) ((320 * pistache) / totalPrice * 100) + "%");

		int average = (int) (totalPrice / (sitron + chocolate + pistache)) / 10 * 10;

		System.out.println("明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味・・・" + (int) ((250 * sitron) / totalPrice * 100) + "%");
		System.out.println("ショコラの味・・・" + (int) ((280 * chocolate) / totalPrice * 100) + "%");
		System.out.println("ピスターシュの味・・・" + (int) ((320 * pistache) / totalPrice * 100) + "%");
		System.out.println("\n値段は\\" + average + "です。");

	}

}
