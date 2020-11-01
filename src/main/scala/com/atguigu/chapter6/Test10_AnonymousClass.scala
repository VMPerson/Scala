package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 14:08
  */
object Test10_AnonymousClass {
  def main(args: Array[String]): Unit = {
    // 抽象类不能直接创建对象，必须先有实现的子类
    // 匿名子类
    val person: Person10 = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = println(name + " eat")
    }
    println(person.name)
    person.eat()
  }
}

// 定义一个抽象类
abstract class Person10{
  var name: String
  def eat(): Unit
}