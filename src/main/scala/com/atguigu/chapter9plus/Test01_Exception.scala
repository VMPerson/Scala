package com.atguigu.chapter9plus

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter9plus
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 16:32
  */
object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try{
      val a = 25 / 0
    } catch {
      case e: ArithmeticException => {
        println("算术异常")
      }
      case e: Exception => {
        println("其它异常")
      }
    } finally {
      println("运行结束")
    }
  }
}
