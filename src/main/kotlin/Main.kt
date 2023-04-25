import java.net.PasswordAuthentication

fun main() {
    var x = word("chepkemboi")
    println(x[0])
    println(x[9])

    println(number())

    CurrentAccount(123421, "Annah", 2345.00)
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun word(name: String): String{
    return name
}


//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun detail(det :PasswordAuthentication){
    var x = "password"
    if (x < 8  ){
        println("true")
    }
    else if (x > 16){
        println("true")
    }
    else if (x = x){
        println("true")
    }
    else if (x = digit){
        println("true")
    }

}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)

fun number(){
    for(num in 1..1000)
        if(num % 6 == 0){
            println("bingo")
        }
    else if (num % 8 == 0){
        println("bingo")
    }

}


//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var number: Int, var name: String, var balance: Double ){
    fun deposit(amount: Double){
        balance++
    }
    fun withdraw(amount: Double){
        balance--
    }
    fun details(){
        println("Account number $number with balance $balance is operated by $name")
    }
}


//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(var number: Int, var name: String, var balance: Double, wittdrawals:Int) {
    fun withdraw(){

    }
}