import java.math.RoundingMode


fun main(){

    val persona1 = Persona("Adrian", 20)
    persona1.celebrarCumpleaños()
    println(persona1.edad)

    val empleado1 = Empleado("Adrian", 20, 100, 10)

}

fun Double.redondear(decimales: Int):Double{
    return this.toBigDecimal().setScale(decimales, RoundingMode.HALF_UP).toDouble()
}