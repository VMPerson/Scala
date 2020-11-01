package com.atguigu.chapter8

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter8
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 15:35
  */

// 匹配样例类对象
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("junjie", 19)
    val res = student match {
      case Student1("junjie", 18) => "Yes"
      case _ => "Not junjie"
    }
    println(res)
  }
}

// 定义一个样例类，直接底层自动生成伴生对象，并实现apply和unapply
case class Student1(name: String, age: Int)