// Clase derivada: HabitacionDoble 
public class HabitacionDoble extends Habitacion{ // Herencia: Extiende de la clase base: Habitacion
    private int numeroCamas;

    public HabitacionDoble(int numero, double precioPorNoche, int numeroCamas) {
        super(numero, precioPorNoche);
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    @Override
    public void mostrarInformacion(){ // Polimorfismo: Sobrescribe el método
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numeroCamas); 
    }
}