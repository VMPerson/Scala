package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 16:39
  */
class Person {
  private var idCardNo: String = "123456"
  protected var name: String = "alice"
  private[chapter6] var age: Int = 18
  var sex: String = "female"

  def printInfo(): Unit = {
    println("this is a person: " + idCardNo + name + age + sex)
  }
}

