import java.math.RoundingMode

class Empleado(nombre: String, edad: Int, var salarioBase: Double, var porcentajeImpuesto: Double = 10.0): Persona(nombre, edad) {

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuesto: Int): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuesto.toDouble())

    constructor(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuesto: Int): this(nombre, edad, salarioBase, porcentajeImpuesto.toDouble())

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuesto: Double): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuesto)

    fun calcularSalario(){
        salarioBase *= ((porcentajeImpuesto / 100.0)).toBigDecimal().setScale(2, RoundingMode.HALF_UP).toDouble()
    }

    override fun toString(): String {
        return super.toString() + "Salario: ${calcularSalario()}"
    }

    fun trabajar(){
        println("$nombre esta trabajando en la empresa")
    }

}