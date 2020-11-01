package com.atguigu.chapter5

import scala.annotation.tailrec

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 11:32
  */
object Test09_Recursion {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
  }

  def factorial(n: Int): Int = {
    // 首先要定义出基准情况，这是退出递归调用的保证
    if( n == 0 ) 1
    else n * factorial(n - 1)    // 而且递归调用时，参数必须可以收敛到基准情况
  }

  // 尾递归
  def tailFactorial(n: Int): Int = {
    // 定义一个内层循环调用函数，用一个参数acc保持状态（当前乘积），不用返回再做计算
    @tailrec
    def loop(acc: Int, n: Int): Int = {
      if( n == 0 ) acc
      else loop( n * acc, n - 1 )
    }
    loop(1, n)
  }
}
