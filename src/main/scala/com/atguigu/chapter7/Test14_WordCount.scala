package com.atguigu.chapter7

import scala.collection.mutable

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 9:21
  */

// word count，计算文本输入中的词频，按大小排序输出前3
object Test14_WordCount {
  def main(args: Array[String]): Unit = {
    // 简单版本
    val stringList: List[String] = List(
      "Hello",
      "Hello World",
      "Hello Scala",
      "Hello Spark in Scala",
      "Hello Flink in Scala"
    )

    // 1. 对集合中的字符串进行切分，并作扁平化处理
//    val wordListList = stringList.map( _.split(" ") )
//    val wordList = wordListList.flatten
    val wordList: List[String] = stringList.flatMap( _.split(" ") )
    println(wordList)

    // 2. 将相同的word放在一组，得到一个以word作为key的map

    //    val map: mutable.Map[String, Int] = mutable.Map()
    //    for (elem <- wordList) {
    ////      if( map.contains(elem) ) map(elem) = map(elem) + 1 else map(elem) = 1
    //      val count = map.getOrElse(elem, 0)
    //      map.put(elem, count + 1)
    //    }
    //    println(map)

    val groupMap: Map[String, List[String]] = wordList.groupBy( word => word )    // f(_) --> x => f(x)   f(x=>x)
    println(groupMap)

    // 3. 对分组之后的map里的内容进行转换，得到每个word的count数量
    val countMap: Map[String, Int] = groupMap.map( kv => (kv._1, kv._2.size) )
    println(countMap)

    // 4. 排序取前3
    val countList: List[(String, Int)] = countMap.toList
    val sortedList: List[(String, Int)] = countList.sortBy(_._2)(Ordering.Int.reverse)
    val first3List: List[(String, Int)] = sortedList.take(3)

    println(countList)
    println(first3List)

    println("=====================================")

    // 复杂版本
    val tupleList: List[(String, Int)] = List(
      ("Hello Scala Spark World ", 4),
      ("Hello Scala Spark", 3),
      ("Hello Scala", 2),
      ("Hello", 1))
    // 首先将元组进行转换，变成一个大的字符串
    val newStrList: List[String] = tupleList.map( kv => (kv._1.trim + " ") * kv._2 )

//    println(newStrList)

    // 接下来操作就完全相同了
    val wordCountList: List[(String, Int)] = newStrList
      .flatMap( _.split(" ") )
      .groupBy( word => word )
      .map( kv => (kv._1, kv._2.length) )
      .toList
      .sortWith( _._2 > _._2 )
      .take(3)

    println(wordCountList)

  }
}
