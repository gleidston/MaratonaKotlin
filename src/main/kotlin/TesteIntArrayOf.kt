fun main () {

val values = intArrayOf(1,2,3,4,5,10,12)
    values.forEach {
        println(it)
    }
   println("--------------------------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}