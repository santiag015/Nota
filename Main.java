import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Datos iniciales
            LocalDate fechaNacimiento = LocalDate.of(2006, 4, 16);
            Estudiante Santiago = new Estudiante("Santiago", fechaNacimiento, 4.5, 5.0, 2.5);
            System.out.println("Estudiante: " + Santiago.getNombre());

        // Edad
            System.out.println("Fecha de Nacimiento: " + Santiago.getfechaNacimiento());
            System.out.println("Edad: " + Santiago.getEdad() + " Años");

        // Notas
            System.out.println("/////// Notas ///////");
            System.out.println("Nota 1: " + Santiago.getNota1());
            System.out.println("Nota 2: " + Santiago.getNota2());
            System.out.println("Nota 3: " + Santiago.getNota3());
            System.out.println("///////////////////");

        // Promedio
            System.out.println("Promedio: " + Santiago.getPromedio());

    }//Cierra Main
}//Cierra Class