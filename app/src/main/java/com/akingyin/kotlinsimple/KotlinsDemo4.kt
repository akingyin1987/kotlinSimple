package com.akingyin.kotlinsimple

/**
 * @ Description:
 * @author king
 * @ Date 2018/6/8 11:44
 * @version V1.0
 */
class KotlinsDemo4{
//    When 表达式
//    when 将它的参数和所有的分支条件顺序比较，直到某个分支满足条件。
//
//    when 既可以被当做表达式使用也可以被当做语句使用。如果它被当做表达式，符合条件的分支的值就是整个表达式的值，如果当做语句使用， 则忽略个别分支的值。
//
//    when 类似其他语言的 switch 操作符。其最简单的形式如下：

    fun   whenDemo(x:Int){
        when (x) {

            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // 注意这个块
                print("x 不是 1 ，也不是 2")
            }
        }
    }

    fun   whenDemo2(x:Any)= when (x) {
        in 1..10 -> print("x is in the range")
        x is String -> print(" x is String")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

}