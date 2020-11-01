package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/27 9:39
  */
object Test17_Extend {
  def main(args: Array[String]): Unit = {
    // 1. 类型转换和检查

    // 判断对象是否为某个类型的实例
    val student = new Student7("alice", 18)
    val person = new Person7("bob", 25)
    val isStudent: Boolean = student.isInstanceOf[Student7]
    val isPerson: Boolean = student.isInstanceOf[Person7]
    println(isStudent)
    println(isPerson)
    val isStudent2: Boolean = person.isInstanceOf[Student7]
    val isPerson2: Boolean = person.isInstanceOf[Person7]

    // 将对象转换成某个类型的实例
    if (isPerson) {
      val person2: Person7 = student.asInstanceOf[Person7]
      person2.printInfo()
    }
//    val student2: Student7 = person.asInstanceOf[Student7]
//    student2.printInfo()

    // 获取类的信息
    val info: Class[Student7] = classOf[Student7]
    println(info)

    // 测试枚举类
    println(WorkDay.TUESDAY)

  }
}

// 枚举类
object WorkDay extends Enumeration{
  val MONDAY = Value(1)
  val TUESDAY = Value(2)
  val WEDNESDAY = Value(3)
}

// 应用类
object MyApp extends App{
  println("this is my app")

  // 定义新类型
  type MyString = String
  val a: MyString = "abc"
  println(a)
}