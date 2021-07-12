import data.Funcionario

fun main() {
    val joao = Funcionario("Joao ", 33399988826, "rua castelo branco 33 ", 19.222, "gerente")
    val maria = Funcionario("Maria ", 33399977726, "rua castelo branco 45 ", 9.222, "Po")
    val carla = Funcionario("Carla ", 33399955526, "rua castelo branco 55", 10.222, "analista")
    val patric = Funcionario("Patric ", 33399944426, "rua castelo branco 75", 10.222, "analista")
    val funcionarioSet1 = setOf(joao, carla)
    val funcionarioSet = setOf(maria, patric)
    val funcionarioSet2 = setOf(maria, patric, joao)
    val resultadoUniao = funcionarioSet.union(funcionarioSet1)
    val resultadoUniao2 = funcionarioSet.subtract(funcionarioSet2)
    val resultadoUniao3 = funcionarioSet.intersect(funcionarioSet2)
    println(funcionarioSet1)
    println("--------------------------------------------------")
    println(funcionarioSet)
    println("--------------------------------------------------")
    resultadoUniao.forEach {
        println(it)
    }

    println("--------------------------------------------------")
    resultadoUniao2.forEach {
        println(it)
    }

    println("--------------------------------------------------")
    resultadoUniao3.forEach {
        println(it)
    }
}