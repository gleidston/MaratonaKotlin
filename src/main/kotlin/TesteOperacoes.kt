fun main() {
    val salarios = doubleArrayOf(10000.00,1500.00,2000.00,5000.50)

    println("o maior salario e : ${salarios.maxOrNull()}")
    println("o menor salario e : ${salarios.minOrNull()}")
    println("a media dos salarios é : ${salarios.average()}" )

    // filter faz uma validaçao sobre a condiçao do it abaixo
     val salariosMaiorDoismil = salarios.filter {

         it>2000

     }
    println("--------------------------------------------------")
    salariosMaiorDoismil.forEach{(println(it))}


    println("--------------------------------------------------")

    println(salarios.count{
        (it in 2000.00..5000.00)
    })
    println(salarios.find{
        (it ==5000.50)
    })

    println(salarios.find{
        (it ==500.50)
    })
    println("--------------------------------------------------")
    println(salarios.any{
        (it ==1500.00)
    })
}