package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 10:29
  */
object Test02_FunDef {
  def main(args: Array[String]): Unit = {
    //（1）函数1：无参，无返回值
    def f1(): Unit = {
      println("1：无参，无返回值")
    }
    f1()
    println(f1())

    //（2）函数2：无参，有返回值
    def f2(): Int = {
      println("2：无参，有返回值")
      return 2
    }
    println(f2())

    //（3）函数3：有参，无返回值
    def f3(a: Int): Unit = {
      println("3：有参，无返回值 " + a)
    }
    println(f3(13))

    //（4）函数4：有参，有返回值
    def f4(a: Int): String = {
      println("4：有参，有返回值 " + a)
      return "return " + a
    }
    println(f4(24))

    //（5）函数5：多参，无返回值
    def f5(a: Int, b: String): Unit = {
      println("5：多参，无返回值 " + a + b)
    }
    println(f5(25, "hello"))

    //（6）函数6：多参，有返回值
    def f6(a: Int, b: String): String = {
      println("6：多参，有返回值 " + a + b)
      return "return " + a + b
    }
    println(f6(16, "hello"))
  }
}
