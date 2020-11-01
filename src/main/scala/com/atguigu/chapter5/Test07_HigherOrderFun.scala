package com.atguigu.chapter5

import com.atguigu.chapter1.Student

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 15:44
  */
object Test07_HigherOrderFun {
  def main(args: Array[String]): Unit = {
     // 0. 简单函数的声明与调用
     def f0(): Int = {
       println("f0()..")
       10
     }
    f0()
    // 获取函数的返回值进行进一步计算
    val res: Int = f0
    println(res)

    // 1. 函数可以作为值进行进一步处理计算
    val f1: ()=>Int = f0   // 可以直接指定当前变量的类型是函数
    def f2: ()=>Int = f0
    val f3 = f0 _    // // 可以在函数名后，空格再加_，表示获取函数体本身
    println(f1)
    println(f2())
    println(f3)
    println( f1 == f3 )
    println( f1 == f0 _ )

    def f(a: Int): Int = a
    val f4: Int=>Int = f
    println(f4)
    println(f4(12))

    // 2. 函数可以作为函数参数，进行传递
    // 操作数也作为参数传入的通用二元计算函数
    def dualEval( a: Int, b: Int, op: (Int, Int)=>Int ): Int = {
      op(a, b)
    }
    // 定义一个两数求和函数
    def add(a: Int, b: Int) = a + b
    println(dualEval(12, 36, add))
    println(dualEval(15, 39, _-_))

    // 3. 函数作为返回值进行返回
    // 函数的嵌套
    def f5(): ()=>Unit = {
      // 在函数内另外定义函数，并将函数体返回
      def f6(): Unit = {
        println("f6()..")
      }
      f6
    }
    // 调用
    val f7 = f5()    // 得到的f7就相当于f6
    f7()
    f5()()
  }
}
