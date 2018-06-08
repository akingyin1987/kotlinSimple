package com.akingyin.kotlinsimple

/**
 * @ Description:
 * @author king
 * @ Date 2018/6/8 11:05
 * @version V1.0
 */
class  KotlinsDemo3{

//    Kotlin 基本数据类型
//    Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。
//    不同于Java的是，字符不属于数值类型，是一个独立的数据类型。

//    字面常量
//    下面是所有类型的字面常量：
//
//    十进制：123
//    长整型以大写的 L 结尾：123L
//    16 进制以 0x 开头：0x0F
//    2 进制以 0b 开头：0b00001011
//    注意：8进制不支持
//    Kotlin 同时也支持传统符号表示的浮点数值：
//
//    Doubles 默认写法: 123.5, 123.5e10
//    Floats 使用 f 或者 F 后缀：123.5f
//    你可以使用下划线使数字常量更易读：

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010



//
//    比较两个数字
//    Kotlin 中没有基础数据类型，只有封装的数字类型，你每定义的一个变量，其实 Kotlin 帮你封装了一个对象，
//    这样可以保证不会出现空指针。数字类型也一样，
//    所有在比较两个数字的时候，就有比较数据大小和比较两个对象是否相同的区别了。
//
//    在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。

    fun   compareDemo(){
        val a: Int = 10000
        println(a === a) // true，值相等，对象地址相等

        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
        println(boxedA == anotherBoxedA) // true，值相等
    }



//    类型转换
//    由于不同的表示方式，较小类型并不是较大类型的子类型，
//    较小的类型不能隐式转换为较大的类型。
//    这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。

//    val b: Byte = 1 // OK, 字面值是静态检测的
//    val i: Int = b // 错误

    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt() // OK



//    位操作符
//    对于Int和Long类型，还有一系列的位操作符可以使用，分别是：
//
//    shl(bits) – 左移位 (Java’s <<)
//    shr(bits) – 右移位 (Java’s >>)
//    ushr(bits) – 无符号右移位 (Java’s >>>)
//    and(bits) – 与
//    or(bits) – 或
//    xor(bits) – 异或
//    inv() – 反向




//    数组
//    数组用类 Array 实现，并且还有一个 size 属性及 get 和 set 方法，
//    由于使用 [] 重载了 get 和 set 方法，
//    所以我们可以通过下标很方便的获取或者设置数组对应位置的值。
//
//    数组的创建两种方式：一种是使用函数arrayOf()；
//    另外一种是使用工厂函数。如下所示，我们分别是两种方式创建了两个数组
 //   注意: 与 Java 不同的是，Kotlin 中数组是不型变的（invariant）
    fun   arrayDemo(){
        //[1,2,3]
        val a = arrayOf(1, 2, 3)
        //[0,2,4]
        val b = Array(3, { i -> (i * 2) })

        //读取数组内容
        println(a[0])    // 输出结果：1
        println(b[1])    // 输出结果：2
        for (i in b ){
            print(i)
        }
        b.map { i: Int -> print(i) }

    }




    //字符串

    //Kotlin 支持三个引号 """ 扩起来的字符串，支持多行字符串，比如：

    fun  StringDemo(){
        val text = """
    多行    字符串
    多行字符串
    """
        println(text)   // 输出有一些前置空格
    }


    //String 可以通过 trimMargin() 方法来删除多余的空白。
    fun  StringDemo2(){
        val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
        println(text)    // 前置空格删除了
    }


//    字符串模板
//    字符串可以包含模板表达式 ，
// 即一些小段代码，会求值并把结果合并到字符串中。
// 模板表达式以美元符（$）开头，由一个简单的名字构成:


    fun  StringDemo3(){
        val i = 10
        val s = "i = $i" // 求值结果为 "i = 10"
        println(s)

        val s2 = "runoob"
        val str = "$s.length is ${s2.length}" // 求值结果为 "runoob.length is 6"
        println(str)

        val price = """
        ${'$'}9.99
        """
        println(price)  // 求值结果为 $9.99

    }


}