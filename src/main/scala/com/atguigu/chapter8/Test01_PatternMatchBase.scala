package com.atguigu.chapter8

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter8
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 11:17
  */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    // 1. 基本定义
    val x: Int = 2
    val y = x match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Other"
    }
    println(y)

    // 2. 用模式匹配实现简单两数二元运算
    val a: Int = 25
    val b: Int = 12
//    def biOpEval( op: (Int, Int)=> Int ): Unit ={
//      op(a, b)
//    }

    def matchOpEval( op: Char ): Any = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "运算符不合法"
    }
    println(matchOpEval('+'))
    println(matchOpEval('-'))
    println(matchOpEval('*'))
    println(matchOpEval('/'))
    println(matchOpEval('%'))


    println("=========================")

    // 3. 模式守卫
    // 求一个整数的绝对值
    def abs(num: Int): Int = {
//      if(num >= 0) num else -num

      num match {
        case i if i >= 0 => i
        case j if j < 0 => -j
      }
    }

    println(abs(0))
    println(abs(-25))
    println(abs(96))
  }
}
