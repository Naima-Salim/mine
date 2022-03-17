//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number,  weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
//Create variables and assign them some values for each of these fields.

fun main (){
    var name=("Naima Salim Yusuf")
    println(name)
    var weight=45.7F
    println(weight)
    var citizen="Kenya"
    println(citizen)
    var age=21
    println(age)
    var myNum=254769523085L
    println(myNum)

    var a = greetings("naima")
    println(a)

    var e=modulus(34,12)
    println(e)

    var f=sum(45,6,23, 37)
    println(f)

    var l=interesting("i love my daddy")

    var c=myNum(arrayOf(2,3,4,5))
    println(c)

    var k=mine(arrayOf(3,4.5F,7.8F,"naima",'a',6.8,9.0))
    println(k)

    var t=takeIn(arrayOf('a', 'd', 'e', 'c', 'i', 'b', 'o', 'f', 'u'))
    println(t)

}

//Create and invoke a function that takes in a name and prints out “Hello ${name}”
//given “Ada” it will print out “Hello Ada”
//Create and invoke a function that given 2 numbers returns the remainder of their division
//Create and invoke  function that returns the sum of any given 4 numbers
//Create and invoke a function that prints out an interesting fact about yourself


fun greetings(name:String){
    println("Hello $name")
}
fun modulus(a:Int, b:Int,):Int {
    var quotient=a%b
    return quotient
}
fun sum(c:Int, d:Int, g:Int, h:Int):Int {
    var sum=c+d+g+h
    return sum
}
fun interesting(sentence:String){
    println(sentence)

    names(arrayOf("naima", "tessa", "chirii", "tut"))
    countries()

    numbers()

    var ppl=people(arrayOf("Naima", "Salim", "Yusuf"))
    println(ppl)




}

//Create a function that takes in 4 strings  and creates an array out of them then prints out the array
// Create a function that given an array below:
// var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
//Create one function that given the below array: var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//i) prints out the sum of the second and fifth elements
//ii) prints out the index of 158                                                                                (1 point)
//iii) prints out the elements in ascending order
//Create a function that takes in 3 names and returns a string array containing all 3 names

fun names(names:Array<String>){
    println(names.contentToString())
}
fun countries(){
    var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.sortedArray().forEach { naima->
        println(naima.capitalize())

    }

}
fun numbers(){
    var numArray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158)
    var sum=numArray[1].plus(numArray[4])
    println(sum)
    var index=numArray.indexOf(158)
    println(index)
    var sortedNums=numArray.sortedArray()
    println(sortedNums.contentToString())

}
fun people(names:Array<String>):String{
    var me =names.contentToString()
    return me

}
//Write a function that takes in an array of integers and returns the product of
//all the elements(3pts)
//.Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements(3pts)
//Write a function that takes in an array of characters and returns the number of
//vowels in the array

fun myNum(numbers:Array<Int>):Int {
    var product=1
    numbers.forEach { naima->
        product*=naima
    }
    return product
}
fun mine(num:Array<Any>):Float {
    var sum=0.0F
    num.forEach { salim->
        if(salim is Float|| salim is Double){
            sum+=salim.toString().toFloat()
        }
    }
    return sum
}
fun takeIn(vowel:Array<Char>):Int {
    var num=0
    vowel.forEach { yusuf->
        if(yusuf=='a'|| yusuf== 'e'|| yusuf=='i'|| yusuf=='o'|| yusuf=='u') {
            num++
        }
    }
    return num
}

