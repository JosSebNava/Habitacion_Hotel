// Clase derivada: HabitacionEconomica
public class HabitacionEconomica extends Habitacion{
    private boolean esCompartida;

    public HabitacionEconomica(int numero, double precioPorNoche, boolean esCompartida) {
        super(numero, precioPorNoche);
        this.esCompartida = esCompartida;
    }

    public boolean EsCompartida() {
        return esCompartida;
    }

    @Override
    public void mostrarInformacion(){ // Polimorfismo: Sobrescribe el método
        super.mostrarInformacion();
        System.out.println("La habitacion es compartida: " + (esCompartida ? "Si" : "No"));
    }
}