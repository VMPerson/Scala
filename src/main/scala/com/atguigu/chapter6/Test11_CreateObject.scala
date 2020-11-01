package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 14:28
  */
object Test11_CreateObject {
  def main(args: Array[String]): Unit = {
    // 常规创建对象
//    val student1 = new Student11
//    println(student1)
//    val student2 = new Student11("alice", 18)
//    println(student2)

    println("====================")
    // 用伴生对象来创建对象实例
    val student3 = Student11.apply()
    println(student3)
    val student4 = Student11("alice", 18)
    println(student4)
  }
}

// 定义类，构造方法私有化
class Student11 private(){
  var name: String = _
  var age: Int = _

  private def this(name: String, age: Int){
    this()
    this.name = name
    this.age = age
  }

  // 重写toString方法
  override def toString: String = s"Student11($name, $age)"
}

//class Student(var name: String, var age: Int)

// 伴生对象
object Student11{
  def apply(): Student11 = new Student11()

  def apply(name: String, age: Int): Student11 = new Student11(name, age)

  // apply方法一般用于创建当前类型的对象，也可以自定义其它返回，但比较少用
//  def apply(name: String): String = "abc" + name
}