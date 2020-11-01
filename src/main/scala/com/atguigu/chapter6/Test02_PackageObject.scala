// 1. 在当前包内，直接调用包对象内容
package com.atguigu.chapter6 {
  object Test02_PackageObject{
    def main(args: Array[String]): Unit = {
      println("package common value: " + commonValue)
      commonMethod()
    }
  }
}

// 2. 在其它包内访问对象
package ccc{
  package ddd{

    object Test02_PackageObject{
      def main(args: Array[String]): Unit = {
        import com.atguigu.chapter6.Inner
        Inner
        com.atguigu.chapter6.commonMethod()
        new _root_.java.util.Date()
      }
    }
  }
}