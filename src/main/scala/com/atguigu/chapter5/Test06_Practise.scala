package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 14:46
  */
object Test06_Practise {
  def main(args: Array[String]): Unit = {
    // 1. 用匿名函数实现一个三参数的函数，输入类型Int，String，Char，返回类型Booleean
    // 要求 fun(0, "", '0')的返回值为false，其它情况返回true
//    def fun(f: (Int, String, Char) => Boolean): Boolean = f(0, "", '0')
//
//    def f(a: Int, b: String, c: Char): Boolean = {
//      if (a == 0 && b == "" && c == '0') true else false
//    }
//    println(fun(f))
//    val fun: (Int, String, Char) => Boolean = (i: Int, s: String, c: Char) => {
//      if (i == 0 && s == "" && c == '0') false else true
//    }

    val fun = (i: Int, s: String, c: Char) => !(i == 0 && s == "" && c == '0')

//    val fun: (Int, String, Char) => Boolean = !( _ == 0 && _ == "" && _ == '0')

    println(fun(0, "", '0'))
    println(fun(0, "hello", '0'))
    println(fun(13, "", '3'))

    println(((a: Int, b: String, c: Char) => !(a == 0 && b == "" && c == '0'))(0, "", '0'))

    // 2. 实现一个高阶函数，返回值是函数，嵌套三个函数，最终返回Boolean
    // 要求 func(0)("")('0')的返回值为false，其它情况为true
    def func(i: Int): String=>(Char=>Boolean) = {
      def f1(s: String): Char=>Boolean = {
        def f2(c: Char): Boolean = !(i == 0 && s == "" && c == '0')
        f2
      }
      f1
    }

//    def func2(i: Int): String=>(Char=>Boolean) = {
//      def f1(s: String): Char=>Boolean = {
//        val i_f1 = i
//        def f2(c: Char): Boolean = {
//          val i_f2 = i_f1
//          val s_f2 = s
//          !(i_f2 == 0 && s_f2 == "" && c == '0')
//        }
//        f2
//      }
//      f1
//    }

    // 用lambda表达式进行简写
    def func1(i: Int): String=>(Char=>Boolean) = {
      (s: String) =>  (c: Char) => !(i == 0 && s == "" && c == '0')
    }

    def func2(i: Int)(s: String)(c: Char): Boolean = !(i == 0 && s == "" && c == '0')

    println(func2(0)("")('0'))

    println(func1(0)("")('0'))
    println(func1(34)("")('0'))
    println(func1(0)("scala")('9'))

  }
}
