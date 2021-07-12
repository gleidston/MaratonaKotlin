package data

data class Funcionario(
    val nome: String,
    val cpf: Long,
    val endereco: String,
    val salrario: Double,
    val cargo : String
) {
    override fun toString(): String =
        """
        Nome: $nome 
        CPF : $cpf
        Endereco:$endereco
        Salario : $salrario
        Cargo : $cargo
    """.toString()
}