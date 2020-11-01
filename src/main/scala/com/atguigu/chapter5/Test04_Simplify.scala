package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/22 11:18
  */

// 函数至简原则：能省就省
object Test04_Simplify {
  def main(args: Array[String]): Unit = {
    // 0. 原始正常定义函数
    def f0(name: String): String = {
      return name
    }

    println(f0("f0调用"))

    //（1）return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }

    //（2）如果函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name

    //（3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
    def f3(name: String) = name
    def add2(a: Int, b: Int) = a + b

    //（4）如果有return，则不能省略返回值类型，必须指定
    //    def f4(name: String) = {
    //      return name
    //    }    // error

    //（5）如果函数明确声明Unit，那么即使函数体中使用return关键字也不起作用
    def f5(name: String): Unit = {
      return name
    }

    println(f5("junjie"))

    //（6）Scala如果期望是无返回值类型，可以省略等号，这种形式称为过程
    def f6(name: String) {
      println("name is: " + name)
    }

    f6("junjie")

    //（7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7(): Unit = {
      println("f7()")
    }

    f7()
    f7

    //（8）如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("f8调用")
    }

    //    f8()    // error
    f8

    //（9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    //    def f9(str: String): Unit = {
    //      println(str)
    //    }
//    def f9(str: String) = println(str)

    // 匿名函数：lambda表达式
//    (str: String) => println(str)

    // 可以把匿名函数赋值给变量，这里的f9跟之前定义的函数是一样
    val f9 = (str: String) => println("my school is: " + str)
    println(f9("hello"))
    println(f9)

    // 匿名函数可以用来扩展函数功能，具体扩展是通过将函数作为参数传给另一个函数实现的
    // 定义一个f10，作用是传入一个函数，执行这个函数
    def f10( fun: (String) => Unit ) {
      println("这是调用别的函数的一个高层级函数，要调的函数作为参数传入")
      fun("atguigu")    // 把具体执行函数的参数固化
    }
    f10(f9)

    f10( (str: String) => {println(str)} )

    //（1）参数的类型可以省略，会根据形参进行自动的推导
    f10( (str) => {println(str)} )

    //（2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号。
    f10( str => {println(str)} )

    //（3）匿名函数如果只有一行，则大括号也可以省略
    f10( str => println(str) )

    //（4）如果参数只出现一次，则参数省略且后面参数可以用_代替
    f10( println(_) )

    // (5) 如果可以直接推断出，当前的函数名是一个函数体，而不是函数调用，那么(_)也可以省略
    f10( println )

  }
}
