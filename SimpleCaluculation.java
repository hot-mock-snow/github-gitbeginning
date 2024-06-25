import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCaluculation {
  public static void main(String[] args) {
    // // 変数宣言
    // double firstNumber = 0;
    // double secondNumber = 0;
    // double answer = 0;
    // String symbol = "";

    // // 繰り返しに使用 0：ループ
    // int calculationLoop = 0;
    // int firstLoop = 0;
    // int secondLoop = 0;
    // String symbolLoop = "0";
    // String enter = "0";

    // // 入力受取用のScanner
    // Scanner scanner = new Scanner(System.in);
    // // Scanner firstScanner = new Scanner(System.in);
    // // Scanner secondScanner = new Scanner(System.in);
    // // Scanner symbolScanner = new Scanner(System.in);

    // // 繰り返し計算ここから
    // while (calculationLoop == 0) {
    // enter = "0"; // Enter初期化
    // try {
    // // 1つ目の数
    // while (firstLoop == 0) {
    // System.out.println("1つ目の数値を入力してください。");
    // // 入力の受取
    // firstNumber = scanner.nextDouble();
    // // firstNumber = firstScanner.nextDouble();
    // if ((int) firstNumber == 0) {
    // firstLoop = 1;
    // } else {
    // firstLoop = (int) firstNumber;
    // }
    // }

    // // 2つ目の数
    // while (secondLoop == 0) {
    // System.out.println("2つ目の数値を入力してください。");
    // // 入力の受取
    // secondNumber = scanner.nextDouble();
    // // secondNumber = secondScanner.nextDouble();
    // if ((int) secondNumber == 0) {
    // secondLoop = 1;
    // } else {
    // secondLoop = (int) secondNumber;
    // }
    // }

    // // 演算記号
    // while (symbolLoop.equals("0") || symbolLoop == null) {
    // System.out.println("演算記号（+, -, *, /）を入力してください。");
    // // 入力の受取
    // symbol = scanner.next();
    // // symbol = symbolScanner.next();
    // if (symbol.equals("+") || (symbol.equals("-"))
    // || (symbol.equals("*")) || (symbol.equals("/"))) {
    // symbolLoop = "1";
    // } else { //指定の演算記号以外が入力された場合
    // System.err.println("入力値エラーです。");
    // System.out.println("----------------------------------------");
    // symbolLoop = "0";
    // }
    // }

    // // 計算を実行
    // if (symbol.equals("+")) {
    // answer = firstNumber + secondNumber;
    // } else if (symbol.equals("-")) {
    // answer = firstNumber - secondNumber;
    // } else if (symbol.equals("*")) {
    // answer = firstNumber * secondNumber;
    // } else if (symbol.equals("/")) {
    // answer = firstNumber / secondNumber;
    // }

    // // 答え
    // System.out.println("答えは");
    // DecimalFormat format = new DecimalFormat("0.#");
    // System.out.println(format.format(answer));

    // // Enterキーの入力を求める
    // while (!(enter.equals(""))) {
    // System.out.println("Enterキーを押すと次へ進みます。");
    // scanner = new Scanner(System.in);
    // // Scanner enterScanner = new Scanner(System.in);
    // enter = scanner.nextLine();
    // // Enterキーが入力された場合
    // if (enter.equals("")) {
    // System.out.println("----------------------------------------");
    // System.out.println("計算を続けますか？ 1：はい 2：いいえ");
    // scanner = new Scanner(System.in);
    // // Scanner loopScanner = new Scanner(System.in);
    // calculationLoop = (scanner.nextInt() - 1);
    // // calculationLoop = (loopScanner.nextInt() - 1);

    // // 再計算の場合、各要素とループに使う変数を初期化
    // firstNumber = 0;
    // secondNumber = 0;
    // answer = 0;
    // symbol = "";
    // firstLoop = 0;
    // secondLoop = 0;
    // symbolLoop = "0";

    // // プログラムを終了する場合
    // if (calculationLoop != 0) {
    // // Scannerクローズ
    // scanner.close();
    // // firstScanner.close();
    // // secondScanner.close();
    // // symbolScanner.close();
    // // loopScanner.close();
    // // enterScanner.close();
    // System.out.println("計算を終了します。");
    // }

    // // Enterキー以外が入力された場合
    // } else {
    // System.out.println("入力エラー");
    // System.out.println("Enterを押下しないと次へ進みません。");
    // System.out.println("----------------------------------------");
    // }
    // }

    // // エラー時の処理
    // } catch (Exception e) {
    // System.out.println("入力値エラーです。");
    // System.err.println("エラー内容：" + e);
    // System.out.println("----------------------------------------");
    // if (firstLoop == 0 && symbolLoop.equals("0")) {
    // scanner.next();
    // // firstScanner.next();
    // } else if (secondLoop == 0 && symbolLoop.equals("0")) {
    // scanner.next();
    // // secondScanner.next();
    // }
    // }
    // } // 繰り返しここまで

    // 繰り返しにwhileを使う
    while (true) {

      // 毎回繰り返す内容を書く
      // 例：System.out.println("1つ目の数値を入力して下さい");
      // 例：scanner.next();

      try { // 例外が発生するかもしれない処理があるので、try-catchを使うことにしました！
        // 例外が発生するかもしれない処理
        // 例：firstNumber = scanner.nextDouble();
        // ↑ユーザーの入力をDoubleで受け取る
        // しかしこのとき数字ではなく「a」などの文字を入力されると、
        // InputMismatchExceptionのエラーが発生するため↓のcatchで例外をキャッチする
        // 例外がキャッチされたら↓のコードは実行されずにcatchの中身へ飛ぶ
        // 続きの処理
        // 例：firstNumber = scanner.nextDouble();

        break; // 例外が発生しなければbreak;でwhileループを抜ける

      } catch (Exception e) { // Exceptionはキャッチしたいエラーの種類を書く eはキャッチしたエラーを入れる変数名なので何でも良い
        // エラーをキャッチしたときの処理を書く
        // 例：System.out.println("不正な値です。");
      }
    }

    // 1と2の入力
    // 1が入力されたときは処理を繰り返す
    // 2が入力されたときはプログラムを終了する
    // 1と2以外の数字が入力されたときは、エラー分を表示して再入力を求める
    // 文字が入力されたときは、エラー分を表示して再入力を求める

    while (true) {
      System.out.println("何かしらの計算が行われます・・・");
      System.out.println("・・・");
      System.out.println("・・・");
      Scanner scanner = new Scanner(System.in); //入力のためのScanner作成。既に作成しているならこの1行は不要
      try {
        System.out.println("計算を続けますか？　1：はい　2：いいえ");
        int loop = scanner.nextInt(); // 入力されたものをint型の変数loopへ入れる
                                      //文字が入った場合はエラーが発生して↓のcatchへ飛ぶ
        if (loop == 1) { //ユーザーが1を入力したとき
          System.out.println("計算を続けます。");
          loop = 0; // loopに1が入っている状態なのでリセットする
        } else if (loop == 2) { //ユーザーが2を入力したとき
          System.out.println("計算を終了します。");
          scanner.close(); // scannerクローズ
          break; // whileを抜けて、プログラムを終了する
        } else {
          System.out.println("不正な値です。");
        }
      } catch (InputMismatchException e) {
        System.out.println("不正な値です。");
      }
    }





  }
}