public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         *     條件成立時執行的程式碼
         * } else {
         *     條件不成立時執行的程式碼
         * }
         */
        int a = 2;
        int b = 3;

        // if(!(a <= b)) {  //反轉答案
        //     System.out.println("a 的確 <= b");
        // } else {
        //     System.out.println("a 沒有 <= b");
        // }

        // if((a == 2) && (b == 3)) {
        //     System.out.println("條件成立");
        // } else {
        //     System.out.println("條件不成立");
        // }

        if((a == 2) && (b == 3) || (b == 4)) {
            System.out.println("條件成立");
        } else {
            System.out.println("條件不成立");
        }


        /*
         * else if
         * 
         * if (條件1) {
         *    條件1成立時執行的程式碼
         * } else if (條件2) {
         *    條件2成立時執行的程式碼
         * } else {
         *    條件1跟條件2都不成立時執行的程式碼
         * }
         */

        int n = 5;

        if(n == 0) {
            System.out.println("n : 0");
        } else if(n == 1) {
            System.out.println("n : 1");
        } else if(n == 2) {
            System.out.println("n : 2");
        } else {
            System.out.println("n 為0,1,2以外的數字");
        }

        // String[] results = {
        //     "n : 2",
        //     "n : 3",
        //     "n : 4",
        //     "n 為2,3,4以外的數字"
        // };
        // System.out.println(results[0]);


        //判斷分數
        //如果分數超過90 印出(超棒)
        //如果分數80~90 印出(很好)
        //如果分數60~80 印出(好)
        //其他 印出(OK)
        int score =100 ;

        if (score >= 90){
            System.out.println("超棒");
        }  else if(score >= 80 && score < 90){
            System.out.println("很好");
        } else if(score >= 60 && score < 80){
            System.out.println("好");
        } else{
            System.out.println("OK");
        }
 


        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        int c = 5;
        int d = 3;

        String min = (c < d) ?  "C < D" :  "C > D";
        System.out.println(min);

        /*
         * 上面兩行 效果等於以下寫法
         */
        // if(a < b) {
        //     System.out.println("A < B");
        // } else {
        //     System.out.println("B > A");
        // }

        
        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         *     條件成立時執行的程式碼
         * }
         */
        for(int index = 0; index <= 10; index ++) {
            System.out.println(index);  //ln表示換行
        }

        /* 設計一個99乘法表
         * 1x1=1 1x2=2.......
         * 2x1=2 2x2=4........
         * 
         * 9x1=9 9x2=18.......
        */
        // for(int x = 1; x <= 9 ; x++ ){
        //     for(int y = 1; y <= 9 ; y++ ){
        //         System.out.print(x + "x" + y + "=" + (x*y) + " ");  //不換行
        //     }
        //     System.out.println();  //換行
        // }

        //不要印出重複的 1x1=1 2x2=4......
        for(int x = 1; x <= 9 ; x++ ){
            for(int y = 1; y <= 9 ; y++ ){
                if (!(x == y)){
                    System.out.print(x + "x" + y + "=" + (x*y) + " ");  //不換行
                }
            }
            System.out.println();  //換行
        } 


        /* 設計一個金字塔
         *
         *      *
         *     ***
         *    *****
         *   *******
         *  .............
         */

        for (int s = 1; s <= 10; s++){
            for (int t=1; t <= 10; t+=2){
                System.out.println("*");
            }

        }         






        /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         */
        // int[] bingo = {7, 22, 89, 55};
        // for(int index = 0; index < bingo.length; index ++) {
        // for(int index = 0; index <= bingo.length-1; index ++) {
        //     System.out.println(bingo[index]);
        // }


        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        //     System.out.println(index);
        // }


        /*
         * for each 迴圈
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         *     條件成立時執行的程式碼
         * }
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (String stu : students) {
        //     System.out.println(stu);
        // }


        /*
         * 105 ~ 108 這幾行 效果等於以下寫法
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (int index = 0; index <= students.length - 1; index++) {
        //     System.out.println(students[index]);
        // }

    }
}
