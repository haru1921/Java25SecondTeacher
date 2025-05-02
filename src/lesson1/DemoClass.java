package lesson1;

import basic.Person;
import lesson1.homework.traning.Employee;
import lesson2.Car;

public class DemoClass {
    public static void main(String[] args) {
        // lesson2.Car c1 = new lesson2.Car("001","黃色");
        // c1.name = "002";
        // c1.showCarInfo();
        // c1.change();
        // // Car c1 = new Car("001","黃色" );
        // c1.showCarInfo();
        // c1.showCarInfo();
        // c1.name = "002";
        // c1.color = "橘色";
        // c1.showCarInfo();

        // Car c2 = new Car("002","黑色" );
        // c2.showCarInfo();

        // c2.name="002";
        // c2.color="黑色";
        // c2.showCarInfo();

        /*
         * 封裝練習 Getter * Setter
         */
        // 想像情境: 開戶並且存款1000
        // Bank b1 = new Bank("glen0711", 1000);

        // // // 想像情境: 顯示帳戶跟餘額
        // b1.showBalance();

        // b1.setBalance1("glen0711","deposit", 5000);
        // int myBalance = b1.getBalance1();
        // System.out.println("您的餘額:" + myBalance);

        // b1.setBalance1("glen0711","deposit", 0);
        // int myBalanc1 = b1.getBalance1();
        // System.out.println("2.您的餘額:" + myBalanc1);

        // // 假裝帳號輸入錯誤
        // b1.setBalance1("glen07112","deposit", 0);
        // int myBalanc2 = b1.getBalance1();
        // System.out.println("3.您的餘額:" + myBalanc2);

        // // // 提款 4000
        // b1.setBalance1("glen0711","withdraw", 4000);
        // int myBalanc3 = b1.getBalance1();
        // System.out.println("4.您的餘額:" + myBalanc3);

        // // // 提款 3000
        // b1.setBalance1("glen0711","withdraw", 3000);
        // int myBalanc4 = b1.getBalance1();
        // System.out.println("5.您的餘額:" + myBalanc4);
        
        /*
         * 課程練習 請大家修改可以變更account
         * 一樣要注意需比對原帳號 正確才能做修正
         * 改完帳號 分別用新舊帳號試試存錢或是提領操作
         */
        // 修改帳號
        // b1.setAccount("glen0711", "glen07");
        // System.out.println(b1.getAccount());
        
        // // 修改帳號後用舊帳號測試
        // b1.setBalance1("glen0711","deposit", 1000);
        // int myBalanc5 = b1.getBalance1();
        // System.out.println("您的餘額:" + myBalanc5);

        // // 修改帳號後用新帳號測試
        // b1.setBalance1("glen07","deposit", 1000);
        // int myBalanc6 = b1.getBalance1();
        // System.out.println("您的餘額:" + myBalanc6);


        /*
         * 課程練習 請命名一個類別Student
         * 三個私有屬性 score1, score2, teacherAccount
         * 請用 getter setter 存取 score1 跟 score2
         * setScore1, setScore2 內要檢查 teacherAccount是否為建構子時候的輸入老師帳號, 
         * 且輸入的score需為 0 ~ 100 之間才能寫入
         * 不在此範圍須跳出回應 "分數需在 0 ~ 100 之間"
         * getScore1, getScore2 內要檢查 teacherAccount是否為建構子時候的輸入老師帳號 
         * 才回傳score, 非老師帳號 可印出"老師帳號錯誤"且回傳 -1
         */

        // Student s1 = new Student("teacher1");
        // // 假設老師帳號輸入錯誤 (score1)
        // s1.setScore1("teacher12", 55);
        // int score11 =  s1.getScore1("teacher1");
        // System.out.println("score1:" + score11);

        // // 老師帳號輸入正確 (score1)
        // s1.setScore1("teacher1", 55);
        // int score12 =  s1.getScore1("teacher1");
        // System.out.println("score1:" +score12);

        // // 老師帳號輸入正確 但是分數超過 0 ~ 100 (score2)
        // s1.setScore2("teacher1", 101);
        // int score21 =  s1.getScore2("teacher1");
        // System.out.println("score2:" +score21);

        // // 老師帳號輸入正確 (score2)
        // s1.setScore2("teacher1", 66);
        // int score22 =  s1.getScore2("teacher1");
        // System.out.println("score2:" + score22);

        /*
        * 多載介紹(Overload)
        */

        // Printer p1 = new Printer();
        // p1.show();
        // p1.show(1);
        // p1.show("Test1");
        // p1.show("Test2", "Test3");
        // p1.show("Test4", 2);

        /*
         * 課堂練習:
         * 請大家產生一個 Area 類別
         * 產生Method 名稱為 cal()
         * 分別產出 圓形的面積計算 三角形面積計算 長方形面積計算
         */

        // Area a1 = new Area();
        // a1.cal(9);
        // a1.cal(5, 10);
        // a1.cal("長", 3, 2);
        // a1.cal("正", 3, 3);


        /*
         * package 呼叫
         */
        // basic.Person p2 = new basic.Person("A2", 0);
        // System.out.println(p2.getName());
        // Person p3 = new Person("A3", 0);
        // System.out.println(p3.getName());

        /*
         * 課堂練習:
         * 請大家在lesson1 產生以下 路徑資料夾  lesson1 > homework > traning
         * 在traning 內放 Employee 類別 
         * Employee 請用 getter setter 存取 name 
         * 最後在DemoClass 實作一個 Employee 物件 且印出 getName()
         */

        // lesson1.homework.traning.Employee e1 = new lesson1.homework.traning.Employee("E1");
        // System.out.println(e1.getName());

        // Employee e2 = new Employee("E2");
        // System.out.println(e2.getName());
    }

}
