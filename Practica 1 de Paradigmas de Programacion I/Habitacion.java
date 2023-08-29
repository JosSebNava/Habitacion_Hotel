// Clase base: Habitacion 
public class Habitacion {
    private int numero; // Encapsulacion: Atributos Privados
    private double precioPorNoche; // Encapsulacion: Atributos Privados

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;  // Encapsulacion: Metodo getter
    }

    public double getPrecioPorNoche() {
        return precioPorNoche; // Encapsulacion: Metodo getter
    }

    public void mostrarInformacion(){
        System.out.println("Numero de habitacion: " + numero);
        System.out.println("Precio de habitacion: $" + precioPorNoche);
    }

    public double calcularCostoTotal(int numNoches){
        return precioPorNoche * numNoches;
    }
}