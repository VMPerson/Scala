/**
 * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved
 * <p>
 * Project: scala0421
 * Package: PACKAGE_NAME
 * Version: 1.0
 * <p>
 * Created by wushengran on 2020/7/25 10:59
 */

/**
 * @ClassName: TestDynamicBinding
 * @Description:
 * @Author: wushengran on 2020/7/25 10:59
 * @Version: 1.0
 */
public class TestDynamicBinding {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        student.hello();
        student.hi();

        System.out.println("===================");

        // 多态的场景
        Person student1 = new Student();
        // 属性是静态绑定
        System.out.println(student1.name);
        // 方法是动态绑定
        student1.hello();
    }
}

// 定义父类
class Person{
    String name = "person";
    public void hello(){
        System.out.println("hello person " + name);
    }
}

// 定义子类
class Student extends Person {
    String name = "student";
    public void hello(){
        System.out.println("hello student " + name);
    }
    public void hi(){
        System.out.println("hi student " + name);
    }
}