package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 10:11
  */
object Test01_FunAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("Hi, " + name)
    }

    // 函数调用
    sayHi("Alice")
    val res = sayHello("Bob")
    println(res)

    // 对象方法的调用
    Test01_FunAndMethod.sayHi("Cary")
    Test01_FunAndMethod.sayHi(2)
  }

  // 在main外面定义函数，这是object的一个方法
  def sayHello(name: String): String = {
    println("Hello, " + name)
    return "say Hello"
  }

  def sayHi(name: String): Unit = {
    println("hi, " + name)
  }
  def sayHi(name: Int): Unit = {
    println("hi2, " + name)
  }
}
