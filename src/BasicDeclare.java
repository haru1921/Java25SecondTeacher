import java.util.Arrays;

public class BasicDeclare {
    public static void main(String[] args) throws Exception {
        /*
         * 基本型別介紹
         * int: 整數, 範圍: -2,147,483,648 ~ 2,147,483,647
         *
         * byte: 整數, 範圍: -128 ~ 127
         *
         * long: 整數, 範圍: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
         *
         * float: 32位元浮點數, 需要加上F
         *
         * double: 64位元浮點數, 預設型別
         *
         * char: 字元, 1個字元, 單引號
         *
         * String: 文字, 多個字元, 雙引號 S大寫
         *
         * boolean: 布林, true/false
         */

        // int age = 25;
        // System.out.println(age);

        long age = 2147483649L;  //超過範圍用long數字，數字最後面加L
        System.out.println(age);

        float weight1 = 49.4F;
        System.out.println(weight1);

        double weight2 = 49.49;
        System.out.println(weight2);

        char c1 = 'K';  //僅可英文
        System.out.println(c1);

        String name = "KAZE";  //可中文、日文...等
        System.out.println(name);

        boolean isStudent = true;  //false
        System.out.println(isStudent);

        /*
         * 陣列(Array)宣告
         * 陣列的長度是固定的, 不能改變
         * 陣列的長度是從0開始計算，索引值=長度-1
         */
        int[] bingo = { 7, 22, 89, 55, 33, 99 };  //int表示陣列裡都是數字 "陣列型別[] 陣列名稱"
        System.out.println(bingo[5]);
        System.out.println(bingo[2]);

        String[] students = { "A1", "A2", "A3" };
        System.out.println(students[1]);

        float[] weight3 = { 44.6F, 35.7F, 12.4F };
        System.out.println(weight3[2]);

        boolean[] choose = { true, false };
        System.out.println(choose[1]);

        String[] classRooms = { "教室A", "教室B"};
        System.out.println(classRooms[0]);
        System.out.println(Arrays.toString(classRooms));  //印出整排陣列
        

    }
}
