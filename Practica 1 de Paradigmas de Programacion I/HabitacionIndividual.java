// Clase derivada: HabitacionIndividual 
public class HabitacionIndividual extends Habitacion{ // Herencia: Extiende de la clase base: Habitacion
    private boolean tieneVistaAlMar;

    public HabitacionIndividual(int numero, double precioPorNoche, boolean tieneVistaAlMar) {
        super(numero, precioPorNoche);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean TieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion(){ // Polimorfismo: Sobrescribe el método
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
    }
}