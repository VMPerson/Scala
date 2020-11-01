package com.atguigu.chapter2

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/18 15:35
  */
object Test02_StringPrint {
  def main(args: Array[String]): Unit = {
    //（1）字符串，通过+号连接
    val name: String = "junjie"
    var age: Int = 18
    val school: String = "尚硅谷"
    println(age + "岁的" + name + "在" + school + "学习")

    // 字符串可以用*复制多次拼接起来
    println(name * 3)

    //（2）printf用法：字符串，通过%传值。
    printf("%d岁的%s在%s学习\n", age, name, school)

    //（3）字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在${school}学习")

    // f做模板的格式化字符串插值
    val num = 1.235
    println(f"num is: ${num}%2.2f")

    // raw做模板，原样输出
    println(raw"d:\doc")

    // 三引号表示字符串原样输出
    val a: String =
      """ d:\"
        |"!\n\s\t%d """.stripMargin
    val sql: String =
      s"""
        |select *
        |from
        |   student
        |where
        |   name = ${name}
      """.stripMargin
    println(sql)

  }
}
