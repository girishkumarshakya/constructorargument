package core.car.kotlin

import java.beans.ConstructorProperties

class Arguments
    @ConstructorProperties("message","email","age")
    constructor(private val message:String,private val email:String,
               private val age:Int){

    override fun toString(): String {
        return "Arguments(message='$message', email='$email', age=$age)"
    }
}