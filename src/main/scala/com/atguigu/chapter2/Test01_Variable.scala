package com.atguigu.chapter2

import com.atguigu.chapter1.Student

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/18 15:10
  */
object Test01_Variable {
  def main(args: Array[String]): Unit = {
    // 声明变量的常规方式
    var a: Int = 10
    val b: Long = 20L

    //（1）声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 10
    println(a1)

    //（2）类型确定后，就不能修改，说明Scala是强数据类型语言。
    var a2: Int = 20
//    a2 = "abc"

    //（3）变量声明时，必须要有初始值
//    var a3: Int

    //（4）在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改。
    a = 30
//    b = 10L

    //（5）var修饰的对象引用可以改变，val修饰的对象则不可改变，但对象的状态（值）却是可以改变的
    var std1 = new Student("alice", 20)
    std1.age = 21
    std1 = new Student("bob", 28)

    val std2 = new Student("alice", 20)
    std2.name = "bob"
//    std2 = new Student("bob", 28)

//    var aa: Int = 25
//    val aaa = "aaa"
  }
}
