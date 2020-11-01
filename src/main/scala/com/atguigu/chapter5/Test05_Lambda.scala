package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 14:13
  */
object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    // 简单的两数求和函数
    def add2(a: Int, b: Int) = a + b

    // 定义一个“二元运算”函数，接收一个二元函数作为参数，固定操作的两个数
    def dualFunOneAndTwo( fun: (Int, Int) => Int ): Int = {
      fun(1, 2)
    }

    println(dualFunOneAndTwo(add2))

    // lambda表达式的写法
    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunOneAndTwo(add))
    println(dualFunOneAndTwo(minus))

    // 可以直接把lambda表达式作为dualFun的参数
    dualFunOneAndTwo((a: Int, b: Int) => a + b)
    dualFunOneAndTwo( (a, b) => a + b )
    dualFunOneAndTwo( _ + _ )
    println(dualFunOneAndTwo( _ - _ ))
    println(dualFunOneAndTwo( (x, y) => y - x ))
    println(dualFunOneAndTwo( -_ + _ ))

    println(dualFunOneAndTwo(Math.max))
  }
}
