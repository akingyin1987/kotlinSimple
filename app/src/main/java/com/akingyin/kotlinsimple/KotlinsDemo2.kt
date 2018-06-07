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
    fun   checknull(){
        var   a:String?=null
        var   a1 = a?.toInt()?:-1
        println(a1)
    }
}