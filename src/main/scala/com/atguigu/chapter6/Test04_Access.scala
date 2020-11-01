package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 16:43
  */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    val person: Person = new Person
//    person.idCard
//    person.name
    println(person.age + "  " + person.sex)
    person.printInfo()

    val worker: Worker = new Worker
    worker.printInfo()
  }
}

// 定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
    println("this is a worker")

//    println(idCardNo)
    name = "bob"
    age = 25
    sex = "male"
    super.printInfo()
  }
}