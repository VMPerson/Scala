/**
 * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved
 * <p>
 * Project: scala0421
 * Package: PACKAGE_NAME
 * Version: 1.0
 * <p>
 * Created by wushengran on 2020/7/20 10:31
 */

/**
 * @ClassName: TestCast
 * @Description:
 * @Author: wushengran on 2020/7/20 10:31
 * @Version: 1.0
 */
public class TestCast {
    public static void main(String[] args) {
        byte b = 10;
//        test(b);
//        test(b + 5);
        test(b + (short) 5);
        char c = 'a';
        test(c);
    }
    public static void test(byte b){
        System.out.println("bbbb");
    }
    public static void test(short b){
        System.out.println("ssss");
    }
    public static void test(int b){
        System.out.println("iiii");
    }
    public static void test(char b){
        System.out.println("cccc");
    }
}
