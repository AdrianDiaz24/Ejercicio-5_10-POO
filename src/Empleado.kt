import java.math.RoundingMode

open class Empleado(nombre: String, edad: Int, var salarioBase: Double, var porcentajeImpuesto: Double = 10.0): Persona(nombre, edad) {

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuesto: Int): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuesto.toDouble())

    constructor(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuesto: Int): this(nombre, edad, salarioBase, porcentajeImpuesto.toDouble())

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuesto: Double): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuesto)

    open fun calcularSalario(): Double{
        val salarioFinal = salarioBase - (salarioBase * (porcentajeImpuesto / 100.0))
        return salarioFinal.redondear(2)
    }

    override fun toString(): String {
        return super.toString() + " Salario: ${calcularSalario()}"
    }

     fun trabajar(){
        println("$nombre esta trabajando en la empresa")
    }

}