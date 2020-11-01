package com.atguigu.chapter1

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter1
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/18 11:45
  */
// object 定义了一个单例对象，有main方法，可以执行
object HelloWorld {
  /**
    * main方法里
    * 方法名后面的小括号里，是输入参数
    * 括号后面用冒号分隔，是输出类型
    * scala中没有static关键字，用object来实现相应的功能
    * 伴生对象
    * - 伴随着类产生的一个对象，只有一个实例
    * - 如果类本身没有定义，直接定义一个对象，就叫做单例对象
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("Hello World")
    System.out.println("Hello World from jdk")
  }
}

//class HelloWorld{}