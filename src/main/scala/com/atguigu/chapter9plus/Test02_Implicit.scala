package com.atguigu.chapter9plus

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter9plus
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 16:41
  */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    // 1. 隐式函数
    implicit def transform(num: Int): MyRichInt = {
      new MyRichInt(num)
    }
    println( 12.myMax(5) )

    println("====================")

    // 2. 隐式参数
    implicit val str: String = "hello scala"

    def hello(implicit param: String = "good bye"): Unit ={
      println(param)
    }
    hello("hello world")
    hello     // 调用时可以不传参，自动寻找环境中相同类型隐式变量的定义

  }
}

// 定义自己的RichInt类型
class MyRichInt(val self: Int) {
  def myMax(i: Int): Int = {
    if (self < i) i else self
  }
  def myMin(i: Int): Int = {
    if (self > i) i else self
  }
}