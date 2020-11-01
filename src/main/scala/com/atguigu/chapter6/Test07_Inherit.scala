package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 10:14
  */
object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1: Student7 = new Student7("alice", 28)
    println("====================")
    val student2: Student7 = new Student7("bob", 35, "213412")
    println("====================")
    val student3: Person7 = new Student7("cary", 28, "523221")
    println("====================")

    student1.printInfo()
    // 多态
    student3.printInfo()
  }
}

// 定义父类
class Person7(var name: String, var age: Int){
//  var name: String = _
//  var age: Int = _

  println("1. Person主构造器调用")

  def this(name: String, age: Int, idNo: String){
    this(name, age)
//    this.name = name
//    this.age = age
    println("2. Person辅助构造器调用")
  }
  def printInfo(): Unit = {
    println("Person: " + name + "  " + age)
  }
}

// 定义子类
class Student7(name: String, age: Int) extends Person7(name, age){
  var stdNo: String = _
  println("3. Student主构造器调用")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    this.stdNo = stdNo
    println("4. Student辅助构造器调用")
  }

  override def printInfo(): Unit = {
    println("Student: " + name + "  " + age + "  " + stdNo)
  }
}
