package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

  public static void Practice04To06(String[] args) {
    
    // 04_変数と値の取り扱い 簡単な計算
    // 文字列結合と数値計算結果の結合をして
    // 自分の名前 + 自分の年齢 + 歳です。が出力されるようにする。
    String firstName = "mura";
    String lastName = "osa";
    int number = 50 + 40 +8;
    System.out.println(firstName + lastName + "は" + number + "歳です");


    // 05_基本型_標準API _分岐処理
    // 条件式を使った課題。
    // 文字列型を使って、変数を二つ用意する。その変数には名字と名前を入れる。
    // 条件は名字の文字数が2文字以上の場合 かつ 名前の文字数が2文字以上の場合はtrue。
    // 条件がtrueの場合はその名前を表示する。
    // 条件がfalseの場合は条件に一致しませんでした。という文言を表示する。
    String firstName2 = "mura";
    String lastName2 = "osa";

    if (firstName2.length() > 2 && lastName2.length() > 2) {
      System.out.println(firstName2 + lastName2);
    }else
      System.out.println("条件に一致しませんでした。");

    // 追加課題
    // 日付を使って条件分岐を作る
    LocalDateTime date = LocalDateTime.now();
    LocalTime currentTime = date.toLocalTime();

    if (currentTime.isBefore(LocalTime.NOON)) {
      System.out.println("現在日時は" + date + "です。おはようございます！");
    } else if (currentTime.isBefore(LocalTime.of(17, 0))) {
      System.out.println("現在日時は" + date + "です。こんにちは！");
    } else {
      System.out.println("現在日時は" + date + "です。こんばんは！");
    }

    // 06_繰り返し処理_配列_ListとMap_switch式
    // 文字列のリストを作ってください。
    // リストの数は10個以上。
    // リストに入っている文字数が3文字以上のものを表示する。
    // このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。
    List<String> starters = new ArrayList<>();
    starters.add("ヌートバー");
    starters.add("近藤");
    starters.add("大谷");
    starters.add("村上");
    starters.add("吉田");
    starters.add("岡本");
    starters.add("牧");
    starters.add("源田");
    starters.add("甲斐");
    starters.add("佐々木");
    starters.add("宮城");
    starters.add("戸郷");

    for (String name : starters)
      if (name.length() >= 3){
        System.out.println(name);
    }

    // 追加課題
    // Mapを作ってください。生徒名と番号の組み合わせ。(1，"江並")みたいな
    // Mapの要素は10個以上。
    // Mapの中の番号が偶数の物をMapから削除する。
    // 上記の処理を行う繰り返し処理を実装してください、
    // 削除した状態の物を出力して表示してください。
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "ヌートバー");
    map.put(2, "近藤");
    map.put(3, "大谷");
    map.put(4, "村上");
    map.put(5, "吉田");
    map.put(6, "岡本");
    map.put(7, "牧");
    map.put(8, "源田");
    map.put(9, "甲斐");
    map.put(10, "佐々木");
    map.put(11, "宮城");
    map.put(12, "戸郷");

    // Mapの要素をイテレータを使用して削除
    Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();
      if (entry.getKey() % 2 == 0) {  // 番号が偶数の場合
        iterator.remove();  // 削除
      }
    }

    // 削除後のMapの状態を表示
    System.out.println("削除後のMapの状態:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
