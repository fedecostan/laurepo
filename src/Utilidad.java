import modelo.Camion;
import modelo.Coche;
import modelo.Moto;
import modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Utilidad {

    // Este metodo retorna una cantidad random de vehiculos random
    // para no saber de qué tipo seran los vehiculos a registrar o cuántos van a ser
    public static List<Vehiculo> obtenerListadoVehiculosAleatorios() {
        List<Vehiculo> listadoVehiculos = new ArrayList<>();
        for (int i = 0; i < obtenerNumeroAleatorio(6, 10); i++) {
            listadoVehiculos.add(obtenerVehiculoAleatorio());
        }
        return listadoVehiculos;
    }

    private static Vehiculo obtenerVehiculoAleatorio() {
        switch (obtenerNumeroAleatorio(1, 3)) {
            case 1:
                return new Moto();
            case 2:
                return new Coche();
            default:
                return new Camion();
        }
    }

    private static int obtenerNumeroAleatorio (int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
