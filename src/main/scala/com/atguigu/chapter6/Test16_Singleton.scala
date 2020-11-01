package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/27 9:21
  */
object Test16_Singleton {
  def main(args: Array[String]): Unit = {
    val student = Student16.getInstance()
    println(student)
    val student1 = Student16.getInstance()
    println(student1)
    println(student == student1)
    println(student.eq(student1))
  }
}

// 定义类，构造方法私有化
class Student16 private(var name: String, var age: Int){
  override def toString: String = s"Student16($name, $age)"
}

// 定义伴生对象，实现单例设计模式
// 1. 懒汉式
//object Student16 {
//  private var student: Student16 = _
//  def getInstance(): Student16 = {
//    if( student == null ){
//      student = new Student16("default", 18)
//    }
//    student
//  }
//}

// 饿汉式
object Student16 {
  private val student: Student16 = new Student16("default", 18)
  def getInstance(): Student16 = student
}