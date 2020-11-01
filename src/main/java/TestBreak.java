/**
 * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved
 * <p>
 * Project: scala0421
 * Package: PACKAGE_NAME
 * Version: 1.0
 * <p>
 * Created by wushengran on 2020/7/21 15:42
 */

/**
 * @ClassName: TestBreak
 * @Description:
 * @Author: wushengran on 2020/7/21 15:42
 * @Version: 1.0
 */
public class TestBreak {
    public static void main(String[] args) {
        // 常规写法
//        for( int i = 0; i < 10 ; i++ ){
//            System.out.println("hello");
//            if( i == 5 )
//                break;
////                i = 11;
//            System.out.println(i);
//        }

        // 用抛出异常的方式实现break
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
                if (i == 5)
//                    break;
                    throw new RuntimeException();
                System.out.println(i);
            }
        }catch (Exception e){
            // 什么都不做，只是退出循环
        }
        System.out.println("this is outside loop");
    }
}
