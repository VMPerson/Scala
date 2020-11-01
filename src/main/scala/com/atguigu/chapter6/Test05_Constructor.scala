package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 16:55
  */
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1()
    student1.Student1()

    val student2 = new Student1("alice")

    val student3 = new Student1("bob", 27)
  }
}

// 主构造方法无参，可以省略括号
class Student1 {
  // 定义属性
  var name: String = _
  var age: Int = _

  // 类体中的代码都会在主构造方法调用时执行
  println("1. Student主构造方法被调用")

  println("name: " + name + ", age: " + age)

  // 声明辅助构造方法
  def this(name: String){
    this()
    println("2. Student第一个辅助构造方法被调用")
    this.name = name
    println("name: " + name + ", age: " + age)
  }

  def this(name: String, age: Int){
    this(name)
    println("3. Student第二个辅助构造方法被调用")
    this.age = age
    println("name: " + name + ", age: " + age)
  }

  def Student1(): Unit = {
    println("一般方法调用")
  }
}
