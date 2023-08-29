public class PruebaHotel {
    public static void main(String[] args) {
        Habitacion habitacion1 = new HabitacionIndividual(101, 120.0, true);
        Habitacion habitacion2 = new HabitacionDoble(202, 180.0, 2);

        System.out.println("Informacion de la primera habitacion:");
        habitacion1.mostrarInformacion();
        System.out.println("Costo total de las 5 noches hospedadas: $" + habitacion1.calcularCostoTotal(5));
        System.out.println();

        System.out.println("Informacion de la segunda habitacion:");
        habitacion2.mostrarInformacion();
        System.out.println("Costo total de las 3 noches hospedadas: $" + habitacion2.calcularCostoTotal(3));
    } 
}
