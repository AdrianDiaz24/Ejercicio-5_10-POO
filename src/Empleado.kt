class Empleado(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuesto: Double = 10.0): Persona(nombre, edad) {

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuesto: Int): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuesto.toDouble())

}