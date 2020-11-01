package com.atguigu.chapter2

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/20 9:24
  */
object Test05_FileIO {
  def main(args: Array[String]): Unit = {
    // 1. 从文件读取，相对路径从项目根目录开始
    Source.fromFile("src/main/resources/hello.txt")
      .foreach(print)
    // 这里的foreach，就类似java8中的forEach

    // 2. 写入文件
    // scala中没有专门提供文件写入的工具，可以调用java的I/O类来实现
    val writer = new PrintWriter(new File("src/main/resources/out.txt"))
    writer.write("hello world")
    writer.close()
  }
}
