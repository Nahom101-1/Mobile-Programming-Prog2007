package org.example

import java.util.stream.Stream

fun main() {
    //Kotlin has fixed-size numeric types (like Java, not dynamic like Python)
    //Byte → 8-bit → range: -128 to 127
    // Short → 16-bit → range: -32,768 to 32,767
    // Int → 32-bit → range: -2,147,483,648 to 2,147,483,647
    // Long → 64-bit → huge numbers
    // Float → 32-bit floating-point (decimal)
    // Double → 64-bit floating-point (more precision)
    val age: Int = 20
    val pi: Double = 3.14
    val bigNumber: Long = 123456L

    // 2. Characters and Strings
    // Char → single character (in ' ')
    // String → sequence of characters (in " ")
    val grade: Char = 'a'
    val name: String = "Alice"
    val multiline = """
        This is a multi line string
    """.trimIndent()

   //  Boolean → true or false
    val isStudent: Boolean = true
    val isAdult = age >= 18

    // Kotlin functions are declated using fun keyword:
    fun double(X: Int): Int{
        return 2 * X
    }
    // functions are called using the standard approach
    val result = double(2)

    // Calling memeber functions uses dot notation
    // Stream.read() // create instance of class stream and call read()

    // PARAMETERS
    // function parameters are defined using pascal notation -name: type.
    // parameters are sepreated using commas, and each paramter must be explicitly typed

    fun powerOf(number: Int, exponent: Int): Unit{
       /*...*/
    }

    //parameters with default values, used when you skip the corresponding arugment. This reduces the numbers of overloads
    fun read(
        b: ByteArray,
        off: Int = 0,
        len: Int = b.size
    ){/*...*/}

    open Class A {
        open fun foo(i: Int = 10){/*...*/}
    }

    // By default kotlinz, all classes are final, If you want a class to inhertiable, you must
    // mark it with open
    class B: A(){
        override fun foo(i: Int) {/*...*/}
    }

    // if a parameter with default value precedes
    fun foo (
        bar: Int = 0,
        baz: Int,
    ){/*...*/}
    foo(baz = 1)
    


}