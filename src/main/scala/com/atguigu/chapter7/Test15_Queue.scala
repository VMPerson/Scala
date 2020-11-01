package com.atguigu.chapter7

import scala.collection.mutable

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 10:41
  */

// 队列测试
object Test15_Queue {
  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[String]()
    val queue0: mutable.Queue[String] = mutable.Queue("abc", "def")

    queue.enqueue("a", "b", "c")
    queue.enqueue("d")

    println(queue)

    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())

    println(queue)

    // 栈的使用
    val stack = mutable.Stack[Int]()

    stack.push(23)
    stack.push(45)
    println(stack)

    println(stack.pop())
    println(stack)

    // 并行集合
    val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}    // 只有一个线程，串行
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}     // 并行

    println(result1)

    println("===========")

    println(result2)

  }
}
