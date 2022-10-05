import modelo.Vehiculo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> listadoVehiculos = Utilidad.obtenerListadoVehiculosAleatorios();
        /**
         * Tengo un listado de vehículos (que viene de otra clase que me genera un listado aleatorio de Vehículos)
         * Entre los vehículos hay motos, coches y camiones
         * No se sabe la cantidad de vehículos ni de qué tipo son
         * Pero si se sabe que cada uno tiene su propio método REGISTRAR heredado de vehículo
         * Por lo que cada vehículo puede hacer uso de ese método
         * pero ejecutará el de modelo.Moto, modelo.Coche o Camión según corresponda
         * Esas son las distintas formas que puede adoptar un Vehículo (polimorfismo)
         * Por ejemplo, haré un 'for each' para iterar los vehículos y llamar a REGISTAR en cada uno
         */
        for (Vehiculo vehiculo : listadoVehiculos) {
            vehiculo.registar();
        }
    }

}
