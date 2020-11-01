package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 15:42
  */
object Test13_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.study()
    student.knowledgeIncrese()
    student.play()
    student.dating()
    student.knowledgeIncrese()

    // 特征的动态混入：创建对象的时候，直接为当前对象添加新的特质
    val student1 = new Student13 with Talent{
      override def singing(): String = "good at singing"
      override def dancing(): String = "not good at dancing"
    }
    println("dancing: " + student1.dancing() + ", singing: " + student1.singing())
  }
}

// 再定义一个特征：天赋技能
trait Talent {
  def singing(): String
  def dancing(): String
}

// 再定义一个特征：知识量
trait Knowledge {
  def knowledgeIncrese(): Unit
  def play(): Unit = println("playing knowledge")
}

// 重新定义Student，特征增加一个Knowledge
class Student13 extends Person12 with Young with Knowledge{
  name = "student"
  age = 15
  var stuNo: String = _

  override def sayHello(): Unit = println("Hello from student " + name)

  def study(): Unit = println(name + " is studying")

  override def dating(): Unit = println("student is dating")

  override def play(): Unit = println("student is playing")

  override def knowledgeIncrese(): Unit = println(name + " knowledge increase")
}