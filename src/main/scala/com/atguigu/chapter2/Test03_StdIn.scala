package com.atguigu.chapter2

import scala.io.StdIn

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/18 16:21
  */
object Test03_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入你的大名")
    val name: String = StdIn.readLine()
    println("请输入你的芳龄")
    val age = StdIn.readInt()

    // 打印输出
    println(s"欢迎${age}岁的${name}来到尚硅谷学习")
  }
}
