package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 14:29
  */
object Test12_MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 10
    // 0. 常规while
    while( n >= 1 ){
      println(n)
      n -= 1
    }

    // 1. 递归函数实现循环，有两个参数：判断条件，和执行的代码块；闭包实现
    def myWhile( condition: => Boolean ): (=>Unit)=>Unit = {
      // 内层函数实现循环，参数是循环执行的代码块
      def doLoop(op: => Unit): Unit = {
        if(condition){
          op
          myWhile(condition)(op)
        }
      }
      doLoop
    }

    // 2. 匿名函数简写
    def myWhile1(condition: =>Boolean): (=>Unit)=>Unit = {
      op => {
        if(condition){
          op
          myWhile1(condition)(op)
        }
      }
    }

    // 3. 柯里化
    def myWhile2(condition: =>Boolean)(op: =>Unit): Unit = {
      if(condition){
        op
        myWhile2(condition)(op)
      }
    }

    // 测试
    n = 10
    myWhile( n >= 1 ){
      println("myWhile: " + n)
      n -= 1
    }
    n = 10
    myWhile1( n >= 1 ){
      println("myWhile1: " + n)
      n -= 1
    }
    n = 10
    myWhile2( n >= 1 ){
      println("myWhile2: " + n)
      n -= 1
    }

  }
}
