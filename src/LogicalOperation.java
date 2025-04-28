public class LogicalOperation {
    public static void main(String[] args) throws Exception {
        /*
         * 基本運算邏輯
         */
        
        /*
         *  + : 加法
         */
        int a = 5;
        int b = 12;
        int sum = a + b;
        System.out.println(sum);

        /*
         *  - : 減法
         */
        // int a = 5;
        // int b = 12;
        int diff1 = b - a;
        System.out.println(diff1);

        int diff2 = a - b;
        System.out.println(diff2);

        /*
         *  * : 乘法
         */
        // int a = 5;
        // int b = 12;
        int product = a * b;
        System.out.println(product);

        /*
         *  / : 除法
         */
        // int a = 5;
        // int b = 12;
        double quotiend1  = a / b;  //除法分母不能為0
        System.out.println(quotiend1);

        double quotiend2  = b / a;
        System.out.println(quotiend2);

        /*
         *  % : 餘數
         */
        int c = 15;
        int d = 4;
        int remainder = c % d;
        System.out.println(remainder);

        
        /*
         *  == : 等於
         */
        // int a = 5;
        // int b = 12;
        boolean isEqual = (a == b);
        System.out.println(isEqual);

        /*
         *  != : 不等於
         */
        // int a = 5;
        // int b = 12;
        boolean isNotEqual = (a != b);
        System.out.println(isNotEqual);


        /*
         *  > : 大於
         */
        // int a = 5;
        // int b = 12;
        boolean greaterThen = (a > b);
        System.out.println(greaterThen);

        /*
        *  < : 小於
        */
        // int a = 5;
        // int b = 12;
        boolean lessThen = (a < b);
        System.out.println(lessThen);


        /*
         *  >= : 大於或等於
         */
        boolean greaterThenOrEqual = (a >= b);
        System.out.println(greaterThenOrEqual);
 
        /*
         *  <= : 小於或等於
         */
        boolean lessThenOrEqual = (a <= b);
        System.out.println(lessThenOrEqual);


        /*
         *  && : 並且
         */
        int x = 2;
        int y = 5;
        boolean and = (x == 2) && (y == 5);  //兩個條件都要成立
        System.out.println(and);

        /*
         *  || : 或者
         */
        boolean or = (a < b) || (b < a);  //其一條件成立即可
        System.out.println(or);


        /*
         *  !  : 反轉
         */
        boolean not = !(a < b);  //將答案反轉
        System.out.println(not);


        /*
         *  ++ : 自增1
         */
        // int a = 5;
        a = a + 1;
        a++;
        System.out.println(a);

        /*
         *  -- : 自減1
         */
        // int a = 5;
        a = a - 1;
        a--;
        System.out.println(a);

        /*
         *  += : 加法後再賦值
         */
        // int a = 5;
        a = a + 2;
        a += 2;
        System.out.println(a);

        /*
         *  -= : 減法後再賦值
         */
        // int a = 5;
        a = a - 2;
        a -= 2;
        System.out.println(a);


        //字串相加
        String test1 = "I am";
        test1 = test1 + " a student";
        System.out.println(test1);


        
    }
}
