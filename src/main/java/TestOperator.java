/**
 * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved
 * <p>
 * Project: scala0421
 * Package: PACKAGE_NAME
 * Version: 1.0
 * <p>
 * Created by wushengran on 2020/7/20 14:23
 */

/**
 * @ClassName: TestOperator
 * @Description:
 * @Author: wushengran on 2020/7/20 14:23
 * @Version: 1.0
 */
public class TestOperator {
    public static void main(String[] args) {
        // 比较运算符
        String str1 = new String("hello");
        String str2 = "hello";
        System.out.println(str1 == str2);    // false
        System.out.println(str1.equals(str2));    // true

        // 逻辑运算符，短路特性
        int a = 1;
        System.out.println( (4 > 5) && (a ++ == 2) );   // false
//        System.out.println( (4 > 5) & (a ++ == 2) );
        System.out.println(a);

        System.out.println(isNotEmpty(null));

        // 赋值运算符
        byte b = 10;
//        b = b + 1;    // error
        b += 1;    // 默认强转
        System.out.println(b);

        // ++/--运算符
        // ++在后，先赋值再运算
        int x1 = 10;
        int y1 = x1 ++;
        System.out.println("x = " + x1 + ";  y = " + y1);   // 11, 10

        // ++在前，先运算再赋值
        int x2 = 10;
        int y2 = ++ x2;
        System.out.println("x = " + x2 + ";  y = " + y2);   // 11，11

        int x3 = 10;
        x3 = x3 ++;
        System.out.println(x3);    // 10

        System.out.println(factorial(5));
    }

    public static boolean isNotEmpty(String s){
        return s != null && !"".equals(s.trim());
    }
    // 定义一个递归函数，用来求阶乘
//    public static int factorial(int n){
//        int res = 1;
//        for(int i = 1; i <= n; i++){
//            res *= i;
//        }
//        return res;
//    }
    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(--n);    // 不能n--，否则会栈溢出
    }
}

