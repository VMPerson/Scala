package com.atguigu.chapter4

import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 15:56
  */
object Test04_Break {
  def main(args: Array[String]): Unit = {
    // 1. 用抛出异常的方式，退出循环
    try {
      for( i <- 1 to 10 ){
        println("hello")
        if( i == 5 ) throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception =>   // 什么都不做
    }
    println("正常退出循环")

    // 2. 采用scala自带的break方法调用，实现break退出循环的功能
    // 需要在循环外层标明当前代码块是可中断的
    Breaks.breakable(
      for( i <- 1 to 10 ){
        println("hello")
        if( i == 5 ) Breaks.break()
        println(i)
      }
    )
    println("正常退出循环")

    // 3. 简化：对Breaks进行省略
    breakable(
      for( i <- 1 to 10 ){
        println("hello")
        if( i == 5 ) break
        println(i)
      }
    )
  }
}
