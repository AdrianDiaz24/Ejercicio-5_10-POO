import java.math.RoundingMode


fun main(){

    val persona1 = Persona("Adrian", 20)
    persona1.celebrarCumpleaños()
    println(persona1.edad)

    val empleado1 = Empleado("Rocio", 23, 100, 10)
    empleado1.trabajar()
    println(empleado1)

    val gerente1 = Gerente("Juan", 19, 100, 1000.0)
    val gerente2 = Gerente("Diego", 30, 100, 1000.0, true)

    gerente1.administrar()
    println(gerente1)
    println(gerente2)
    println(gerente1.calcularSalario())

}

fun Double.redondear(decimales: Int):Double{
    return this.toBigDecimal().setScale(decimales, RoundingMode.HALF_UP).toDouble()
}