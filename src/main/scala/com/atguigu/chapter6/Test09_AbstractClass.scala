package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 11:42
  */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    println(student.age)
    student.eat()
    student.sleep()
  }
}

// 定义一个抽象类
abstract class Person9{
  // 非抽象属性
  val name: String = "person"

  // 抽象属性
  var age: Int

  // 非抽象方法
  def eat(): Unit = println("person eat")

  // 抽象方法
  def sleep(): Unit
}

// 定义子类继承抽象类
class Student9 extends Person9{
  // 重写非抽象属性
  override val name: String = "student"
  // 实现抽象属性，可以不加override
  override var age: Int = 18

  // 重写非抽象方法
  override def eat(): Unit = {
    println("student eat " + name + "  " + age)
  }

  // 实现抽象方法
  def sleep(): Unit = println("student sleep")
}