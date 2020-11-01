package com.atguigu.chapter8

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter8
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 15:50
  */
object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    // 偏函数的转变
    // 例子：处理一个元组类型的list，key不变，value乘2
    val list = List(("a", 1), ("b", 2), ("c", 3))

    // 常规处理方式：map转换，传入一个匿名函数
    val newList = list.map( t => (t._1, t._2 * 2) )

    // 用模式转换，实现直接定义k，v的功能
    val newList1 = list.map( t => t match {
      case (k, v) => (k, v * 2)
    })

    // t作为参数可以省略，但{}不能省略，另外，如果只有一个参数还有{}，那么小括号可以省略
    val newList2 = list.map{
      case (word, count) => (word, count * 2)
    }

    // 这就是 偏函数

    // 偏函数的应用：求一个整数的绝对值
    // 定义求绝对值的各个部分函数（针对某一种输入情况的处理）
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case x if x == 0 => 0
    }
    val negetiveAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }

    // 由偏函数构成完整函数
    def myAbs(x: Int): Int = {
      (positiveAbs orElse zeroAbs orElse negetiveAbs) (x)
    }
    println(myAbs(-25))
    println(myAbs(0))
    println(myAbs(246))
  }
}
