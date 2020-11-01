package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 15:46
  */

// 集合计算高级函数-map类
object Test12_HighLevelFun_Map {
  def main(args: Array[String]): Unit = {
    // 以list为例
    val list = List(1,2,3,4,5,6,7,8,9)

    // 1. 过滤
    // 筛选出所有的偶数，保存到一个新的集合
    val evenList = list.filter( elem => {
      elem % 2 == 0
    } )
    println(evenList)
    println(list.filter( _ % 2 == 0 ))

    println("====================================")

    // 2. 转化/映射map
    println(list.map( _ * 2 + 10 ))

    println("===================================")

    // 3. 扁平化
    val nestedList : List[List[Int]] = List(List(1,2,3), List(4,5), List(6,7,8,9))
    println(nestedList)
    println(nestedList.flatten)
//    nestedList.head ::: nestedList(1) ::: nestedList(2)

    println("=============================")

    // 4. 扁平映射
    // flatmap相当于先进行定义的map操作，然后执行flatten操作

    // 比如，对一组字符串进行分词处理，把每个字符串按照空格分隔
    val strs: List[String] = List( "hello world", "hello scala", "hello atguigu", "we study" )
    val mappedStrs: List[Array[String]] = strs.map( str => str.split(" ") )
    val flattenedStrs = mappedStrs.flatten
    println( flattenedStrs )

    println( strs.flatMap( _.split(" ") ) )

    // 5. 分组groupBy，传入一个函数，要求返回分组的key
    // 得到一个(key, List(elem1, elem2))的map
    // 对list按照奇偶性分组
    val groupMap: Map[Int, List[Int]] = list.groupBy( _ % 2 )
    println(groupMap)

    // 作业：根据一组词的首字母进行分组
    val wordList: List[String] = List("china", "america", "alice", "canada", "japan")
//    val groupWordMap: Map[Char, List[String]] = wordList.groupBy( _.charAt(0) )
    val groupWordMap: Map[Char, List[String]] = wordList.groupBy( _.head )
    println(groupWordMap)
  }
}
