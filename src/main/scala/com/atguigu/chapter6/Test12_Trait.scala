package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 15:13
  */
object Test12_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student12
    student.sayHello()
    student.study()
    student.play()
    student.dating()
  }
}

// 先定义父类
class Person12{
  var name: String = "person"
  var age: Int = 20
  def sayHello(): Unit ={
    println("Hello from person " + name)
  }
}

// 定义一个特征
trait Young {
  // 抽象属性
  var age: Int

  // 声明具体方法
  def play(): Unit = println("young people is playing")
  // 声明抽象方法
  def dating(): Unit
}

// 定义子类，继承特征
class Student12 extends Person12 with Young{
  name = "student"
  age = 15
  var stuNo: String = _

  override def sayHello(): Unit = println("Hello from student " + name)

  def study(): Unit = println(name + " is studying")

  override def dating(): Unit = println("student is dating")
}

// 也可以直接单独继承一个特征
//class Student extends Young{
//  override var age: Int = 15
//  override def dating(): Unit = println("young people is dating")
//}