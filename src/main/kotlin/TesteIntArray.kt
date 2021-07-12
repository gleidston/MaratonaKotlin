

fun main () {
    val values = IntArray(5)
    values[0]=1
    values[1]=7
    values[2]=6
    values[3]=3
    values[4]=2
    // integrage no array com o laço for para que enquanto existir um indice do array ele continua interagindo
    for (valor in values){
     println(valor)
    }
    //modelo 2
    values.forEach {
        println(it)
    }
}