// 测试package
package com{

  import com.atguigu.chapter6.Inner

  // 外层包中定义一个单例对象
  object Outer{
    var out: String = "Out"

    def main(args: Array[String]): Unit = {
      println("Outer " + out)
      // 父包访问子包中的内容，需要import导入
      println(Inner.in)
    }
  }
  // 定义内层包和对象
  package atguigu{
    package chapter6{
      // 定义内层单例对象
      object Inner{
        val in: String = "In"
        def main(args: Array[String]): Unit = {
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

// 同一源文件定义多个包
package aaa{
  package bbb{

    import com.Outer
    import com.atguigu.chapter6.Inner

    object Test01_OtherPackage{
      def main(args: Array[String]): Unit = {
        Outer.out = "out"
        println(Inner)
      }
    }
  }
}