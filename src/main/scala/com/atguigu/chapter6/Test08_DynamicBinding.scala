package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 10:54
  */
object Test08_DynamicBinding {
  def main(args: Array[String]): Unit = {
    val student: Student8 = new Student8()
    println(student.name)
    student.sayHello()
    student.sayHi()

    println("===================")

    // 多态，对于scala，属性和方法都是动态绑定
    val student1: Person8 = new Student8()
    println(student1.name)
    student1.sayHello()
//    student1.sayHi()    // 没有sayHi方法

  }
}

class Person8() {
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit = {
    println("person " + name + "say hello")
  }
}

class Student8() extends Person8(){
  override val name: String = "student"
  age = 15    // 对于var类型的属性重写，直接赋值

  override def sayHello(): Unit = println("student " + name + "say hello")
  def sayHi(): Unit = println("student " + name + "say hi")
}