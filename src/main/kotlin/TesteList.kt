import data.Funcionario

fun main() {
    val joa = Funcionario("Joao ", 33399988826, "rua castelo branco 33 ", 19.222,"gerente")
    val maria = Funcionario("Maria ", 33399977726, "rua castelo branco 45 ", 9.222,"Po")
    val carla = Funcionario("Carla ", 33399955526, "rua castelo branco 55", 10.222,"analista")
    val patric = Funcionario("Patric ", 33399944426, "rua castelo branco 75", 10.222,"analista")


    val funcionarios = listOf(joa, maria, carla)
    funcionarios.forEach {
        println(it)
    }
    println("--------------------------------------------------")
    funcionarios.sortedBy {
        it.salrario
    }.forEach {
        println(it)
    }
    println("--------------------------------------------------")
    funcionarios.groupBy {
        it.cargo
    }.forEach{
        println(it)
    }
}







