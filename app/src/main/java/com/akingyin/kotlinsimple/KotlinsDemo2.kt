package com.akingyin.kotlinsimple

/**
 * 字符串模板
 *
 * @ Description:
 * @author king
 * @ Date 2018/6/7 17:44
 * @version V1.0
 */

class KotlinsDemo2{
//    $ 表示一个变量名或者变量值
//
//    $varName 表示变量值
//
//    ${varName.fun()} 表示变量的方法返回值:

   fun   demo1(){
       var a = 1
       // 模板中的简单名称：
       val s1 = "a is $a"

       println(s1)
       a = 2
       // 模板中的任意表达式：
       val s2 = "${s1.replace("is", "was")}, but now is $a"

       println(s2)
   }


    //NULL检查机制

//    Kotlin的空安全设计对于声明可为空的参数，
//    在使用时要进行空判断处理，有两种处理方式，字段后加!!像Java一样抛出空异常，
//    另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理


  //类型后面加?表示可为空
   var age: String? = "23"
    //抛出空指针异常
    val ages = age!!.toInt()
    //不做处理返回 null
    val ages1 = age?.toInt()
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1


   // 当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。

    //当 str 中的字符串内容不是一个整数时, 返回 null:



    fun parseInt(str: String): Int? {
       return   str.toInt()
    }
    fun   checknull(){
        var   a:String?=null
        var   a1 = a?.toInt()?:-1
        println(a1)
    }



    //类型检测及自动类型转换
    fun  getStringLength(obj:Any):Int?{
      if(obj  is String){
          return   obj.length
      }
      return null
    }


    //区间

//    区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
//
//    区间是为任何可比较类型定义的，但对于整型原生类型，它有一个优化的实现。以下是使用区间的一些示例:


    // In关键字包括两个区间值 （等于 i>=1 && i<=7）
    fun    sectionDemo(){
        for (i in 1..7){
            print(i)
        }
    }

    //递减无法输出
    fun    sectionDemo2(){
        for (i in 7..1){
            print(i)
        }
    }


    // until 关键字，即区间变为[1,10)
    fun  sectionDemo3(){
        for (i in 1 until 10)
            print(i)


    }

    //step 关键字指定步长
    fun   setpDemo(){
        for (i in 1..4 step 2) print(i)
    }

    fun   setpDowntoDemo(){
       for (i in 4 downTo 1 step 2)
           print(i)
    }


}