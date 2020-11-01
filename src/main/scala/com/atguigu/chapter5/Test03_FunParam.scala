package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 10:44
  */
object Test03_FunParam {
  def main(args: Array[String]): Unit = {
    //（1）可变参数
    def f1(str: String*): Unit = {
      println(str)
    }
    f1()
    f1("aa", "bb")

    //（2）如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2( str1: String, str2: String* ): Unit ={
      println("str1: " + str1 + ", str2: " + str2)
    }
    f2("aa", "bb")

    //（3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String, school: String = "atguigu"): Unit = {
      println("welcome " + name + " to " + school)
    }
    f3("junjie", "university")
    f3("junjie")

    //（4）带名参数
    def f4(sex: String = "male", name: String, school: String = "atguigu"): Unit = {
      println("welcome " + name + "::" + sex + " to " + school)
    }
    f4(school = "university", name = "junjie")

  }
}
