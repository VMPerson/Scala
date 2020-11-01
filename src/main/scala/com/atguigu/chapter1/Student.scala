package com.atguigu.chapter1

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter1
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/18 14:14
  */
class Student(var name: String, var age: Int) {
  def printInfo(): Unit ={
    println("name: " + name + ",age: " + age + ",school: " + Student.school)
  }
}

object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val stu1 = new Student("alice", 20)
    val stu2 = new Student("bob", 28)
    stu1.printInfo()
    stu2.printInfo()
  }
}
