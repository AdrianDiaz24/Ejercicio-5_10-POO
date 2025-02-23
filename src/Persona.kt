

class Persona(val nombre: String, var edad: Int) {

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }

    fun celebrarCumpleaños(){
        println("Feliz cumpleaños $nombre! Ahora tienes ${++edad}")
    }

}