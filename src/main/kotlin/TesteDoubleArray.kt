fun main() {
    val salarios = doubleArrayOf(10000.00,1500.00,2000.00,5000.50)
     salarios.sort()
    salarios.forEach {
       var  salarioCd= it * 1.1
        println(salarioCd )
    }
}