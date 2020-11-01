package com.atguigu.chapter4

import scala.collection.immutable.StringOps
import scala.io.StdIn

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 8:49
  */
object Test01_If {
  def main(args: Array[String]): Unit = {
    // 1. 单分支
    println("请输入芳龄：")
    val age: Int = StdIn.readInt()
    if (age < 18) {
      println("童年")
    }

    // 2. 双分支
    if (age < 18) {
      println("童年")
    } else {
      println("成年")
    }

    // 3. 多分支
    if (age < 18) {
      println("童年")
    } else if (age < 35) {
      println("青年")
    } else if (age < 60) {
      println("中年")
    } else {
      println("老年")
    }

    // 4. 分支语句的返回值，就是当前分支代码块最后一行的返回值
    val res1: Unit = if (age < 18) {
      println("童年")
    } else {
      println("成年")
    }

    // 如果每个分支返回值类型不同，那么返回它们最近的公共父类类型
    val res2: AnyVal = if (age < 18) {
      println("童年")
      val str = new StringOps("童年")
    } else {
      println("成年")
      age
    }
    println("res2: " + res2)

    // 5. 嵌套分支，分支条件是逻辑与的关系
    val a: AnyVal = if (age < 18) {
      println("青少年")
      if (age < 12) {
        if (age < 6) {
          println("幼年")
        } else {
          println("童年")
        }
      } else {
        // >=12 && <18
        println("少年")
        age
      }
    } else {
      println("成年")
      age
    }
    println("a = " + a)

    // scala中没有?:三元运算符，用if-else代替
    // String type =  age < 18 ? "童年": "成年";
    val res3 = if (age < 18) {
      "童年"
    } else {
      "成年"
    }
    val res4: String = if(age < 18) "童年" else "成年"
  }
}
