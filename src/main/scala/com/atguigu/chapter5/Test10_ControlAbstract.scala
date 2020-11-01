package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 11:54
  */
object Test10_ControlAbstract {
  def main(args: Array[String]): Unit = {
    // 1. 值调用
    def f0(a: Int): Unit = {
      println("a: " + a)
    }
    def f1(b: Int): Int = {
      println("f1()")
      10
    }
    f0(f1(1))

    // 2. 名调用（传名参数）：传递的是代码块
    def f2(a: => Int): Unit ={
      println("a: " + a)
    }
    f2({
      println("f1()")
      10
    })
  }
}
