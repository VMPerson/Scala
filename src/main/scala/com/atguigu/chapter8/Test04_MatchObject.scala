package com.atguigu.chapter8


/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter8
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 15:13
  */

// 匹配对象

object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("alice", 18)

    // 针对对象的属性值进行模式匹配
    val res = student match {
      case Student("alice", 18) => "Yes"
      case _ => "Not alice"
    }
    println(res)
  }
}

//  定义一个类
class Student(val name: String, val age: Int)

// 伴生对象
object Student{
  // 根据传入的属性参数，调用类的构造器创建对象
  def apply(name: String, age: Int): Student = new Student(name, age)

  // 根据传入的对象，解析获取对象的所有属性（用来进行模式匹配）
  def unapply(student: Student): Option[(String, Int)] = {
    if(student == null)
      None
    else
      Some((student.name, student.age))
  }
}