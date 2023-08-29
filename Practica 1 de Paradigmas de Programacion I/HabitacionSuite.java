// Clase derivada: SuitePresidencial 
public class HabitacionSuite extends Habitacion {
    private boolean tieneServicioMayordomo;

    public HabitacionSuite(int numero, double precioPorNoche, boolean tieneServicioMayordomo) {
        super(numero, precioPorNoche);
        this.tieneServicioMayordomo = tieneServicioMayordomo;
    }

    public boolean TieneServicioMayordomo() {
        return tieneServicioMayordomo;
    }

    @Override
    public void mostrarInformacion(){ 
        super.mostrarInformacion();
        System.out.println("Tiene servicio al cuarto: " + (tieneServicioMayordomo ? "Si" : "No"));
    }
}