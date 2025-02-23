class Gerente(nombre: String, edad: Int, salarioBase: Double, var bonus: Double, var exentoImpuesto: Boolean = false): Empleado(nombre, edad, salarioBase, 33.99) {

    constructor(nombre: String, edad: Int, salarioBase: Int, bonus: Double, exentoImpuesto: Boolean = false): this(nombre, edad, salarioBase.toDouble(), bonus, exentoImpuesto)

    override fun calcularSalario(): Double {
        if (!exentoImpuesto) {
            return super.calcularSalario() + bonus
        } else {
            return salarioBase + bonus
        }
    }

    override fun toString(): String {
        if (exentoImpuesto) {
            return super.toString() + " Bonus: $bonus, Exento de impuestos: Si"
        } else {
            return super.toString() + " Bonus: $bonus, Exento de impuestos: No"
        }
    }

    fun administrar(){
        println("$nombre esta administrando la empresa")
    }

}