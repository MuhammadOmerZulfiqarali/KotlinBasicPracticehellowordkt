package com.example.kotlinbasics

import java.security.Principal
import java.util.logging.Filter

class KotlinBasicPractice {


}

fun main() {
    //println("Hello Word")
    //println("Whats up")
    //println("")
    //println("How Are You")
    //variable()
    //hello()
    //country()
    //age()
    //fourlines()
    //getmax()
    //prime()
    //sum()
    //product()
    //rectangle()
    //triangle()
    //head()
    //principal()
    //function()
    //gram()
    //exeption()
    lamda()






}

fun variable() {
    var myVariable: Boolean = true
    println("myVariable")
    println("The value of my variable is : $myVariable")
    myVariable = false
    println("the value of my variable is : $myVariable")

    var x = 9
    var y = 22
    println("the value of x + y is: ${x + y}")

    x += 10
    println("the value of x + y is: ${x + y}")

    var a = 2
    var b = 3
    var c = 4

    println("show the value of: $a")
    println("show the value of: ${a + b}")
    println("show the value of: ${a + b + c}")

    val age = 25
    val favouriteNumber = 22

    println("I am $age years old and my favourite number is $favouriteNumber ")

    val z = 3F
    val h = 92F

    println("print the a / b is: ${z / h}")

    val hello = "this is an example text"
    println("our string is: ${hello.uppercase()}")

    val string = "Phillips"
    println("display my name: ${string.reversed()}")

    val g = 5
    val i = 5

    val j = 23
    val k = 32
    println((g == i || j == k) && (g <= i))

    val m = 18
    val n = 10

    if (m < n) {
        println("m is lesser than y")
    } else {
        if (m > n)
            println("m is greater than n")
    }

    println("please enter your age")
    val ge = readln().toInt()

    if (ge != null) {
        if (ge in 0..17) {
            println("you're not adult yet")
        } else if (ge in 18..65) {
            println("you re an adult")
        } else {
            println("you are really really old")
        }
    }
    val myArray = arrayOf("hello", "to", "array")
    val arrayLength = myArray.size
    var o = 1
    while (o < arrayLength) {
        println(myArray[o])
        o++
    }

    for (i in 'a'..'z') {
        println(i)
    }
// mutable list ki smj ni ayi


}

fun hello() {
    val age = readln()?.toInt()
    when (age) {
        in 0..5 -> println("You are young kid")
        in 6..17 -> println("You Are teenager")
        18 -> println("finally, you're 18")
        19, 20 -> println("You're young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're Really Old")
    }

}


fun country() {
    println("where are you from?")
    val country = readlnOrNull()

    when(country) {
        "Pakistan" -> println("Salam")
        "India" -> println("Namasty")
        "America" -> println("Hello")
        "Italy" -> println("Cao")

        else -> println("I Dont Know That")

    }
}
fun age() {
    println("how old are you")
    var age = readln()?.toInt()

    when(age) {
       in 0 ..5 -> println("You're not adult")
        in 6..17 -> println("You're Teenager")
        in 18..24 -> println("You're an young Adult")
        in 25..65 -> println("You're an adult")
        else -> println("You're Really Old")
    }
}

fun fourlines () {
printPow(3, 6)
    printPow(3, 5)
    printPow(3, 4)
    printPow(3, 3)



}
fun printPow(base: Int , exponent: Int): Int {
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result")
    return result

}

fun getmax() {
    val max = getmax(0 , 1, 2, 34, 12, 78)
    println("The maximum is $max")

}

fun getmax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

        return max
    }

fun prime() {
    println("please enter a number")
    var input = readLine()?.toInt()

    if (input != null){
        if (input.isPrime()) {
            println("$input is a prime number")
            } else {
                println("$input is not a prime number")
        }

        }


}

fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1){
        if (this % i == 0){
            return false
        }
    }
    return true
}

fun sum() {
    val sum = alternatingSum(2, 10, 9, 7, 3, 11, 13, 15)
    println("the alternating sum is $sum")

}

fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for (number in numbers) {
        if (toggle) {
            sum += number
        } else {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}

fun product(){
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println("the product of $list is ${list.product()}")


}
fun List<Int>.product(): Int {
    var result = 1
    for (value in this){
        result *= value
    }
    return result
}

fun rectangle() {
    val myRect = Rectangle(4.0 ,7.0)
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle Perimeter is ${myRect.perimeter()}")
    println("Is Rectangle is square? ${myRect.isSquare()}")

    val circle1 = Circle(5.0)
    val circle2 = Circle(7.0)

    val myCircle1 = Circle(5.0)
    myCircle1.changeName("peter")
    println("the name of my circle is ${myCircle1.name}")



}
 fun triangle(){
     val myTriangle = Triangle(2.0, 4.0, 6.0)
     myTriangle.changeName("Susan")
     println("The name of my Triangle is ${myTriangle.name}")

 }

fun head(){
    val rect = Rectangle(5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(7.0, 7.0, 7.0)

    val maxAreaRectAndCircle = maxArea(rect, circle)
}

fun maxArea(shape1: Shape, shape2: Shape): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}
 fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double{
     val maxAreaShape1Shape2 = maxArea(shape1, shape2)
     val areaShape3 = shape3.area()
     return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
 }

fun principal(){
    val list = listOf(1, 2, 3, 4, 5)
    val array = arrayOf(1, 2, 3, 4, 5)

    println("List: $list")

    printAlternately(array)

}

fun printAlternately(list: List<Int>) {
    var i = 0
    var j = list.size - 1
    var toggle = true
    while (i <= j) {

        if (toggle) {

            println(list[i])
            i++
        } else {
            println(list[j])
            j--
        }
        toggle = !toggle
    }
}

fun printAlternately(array: Array<Int>){
    var i = 0
    var j = array.size - 1
    var toggle = true
    while (i <= j) {
        if (toggle){

            println(array[i])
            i++
        } else {
            println(array[j])
            j--
        }
        toggle = !toggle
    }
}

fun function(){
    val Rectangle = Rectangle.randomRectangle()
}

fun gram(){
    val a = 3.0
    val b = 4.0
    val height = 2.0
    val parallelogram = object : Shape("parallelogram", a, b, height) {
        init {
            println("parallelogram created with a = $a, b = $b, height = $height")
            println("the area is ${area()}")
            println("the perimeter is ${perimeter()}")
        }
        override fun area(): Double {
            return a * height

        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b

        }

        fun isRectangle(): Boolean = height == b
    }
    print("is parallelogram a rectangle? ${parallelogram.isRectangle()}")

}

fun exeption(){
    val division = try {
        divide(5.0,0.0)
    } catch (e: DivisionByZeroExeption){
        0.0
    }
    println("The Result of division is $division")

    println("Please Enter a number: ")
    val input = try {
        readLine()?.toInt()
    } catch(e: NumberFormatException) {
        0
    }
    finally {
        println("This is from the finally block")
    }
    println("You entered: $input")
}
class DivisionByZeroExeption : Exception("You Cant Divide by zero. Please Choose a Different Number")
fun divide(a: Double, b: Double): Double{
    if (b == 0.0) {
        throw DivisionByZeroExeption()
    }
    return a / b
}

fun lamda(){
    var list = (1..20).toList()
    println(list)
    list = list.filter { it % 2 == 0 }
    println(list)
    list = list.filter { it > 8 }
    println(list)

    val circle1 = Circle(9.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0, 4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0, 3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var integers = (1..10).toList().customFilter { it > 5 }
    var triple = Triple<Int, String, Boolean>(3, "hello", true)
    var customTriple = CustomTriple<Int, String, Boolean>(3,"hello", true)
    customTriple.printTypes()


    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy { it.area() }
    for(shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }
}

fun <S> List<S>.customFilter(filterFunction: (S) -> (Boolean)): List<S> {
    val resultList = mutableListOf<S>()
    for (item in this){
        if (filterFunction(item)){
            resultList.add(item)
        }
    }
    return resultList
}