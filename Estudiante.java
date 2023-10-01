import java.time.LocalDate;
public class Estudiante {
    //atributos
    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private LocalDate fechaNacimiento;

    public Estudiante(String nombre, LocalDate fechaNacimiento, double nota1, double nota2, double nota3){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.fechaNacimiento = fechaNacimiento;
    }//Cierra Constructor


    public String getNombre() {
        return nombre;
    }//Cierra get

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Cierra set

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }//Cierra get

    public void setEdad(int edad) {
        this.edad = edad;
    }//Cierra set

    public double getNota1() {
        return nota1;
    }//Cierra get

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }//Cierra set

    public double getNota2() {
        return nota2;
    }//Cierra get

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }//Cierra set

    public double getNota3() {
        return nota3;
    }//Cierra get

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }//Cierra set

    public double getPromedio() {
        return Math.round((nota1+nota2+nota3)/3);
    }//Cierra get

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }//Cierra set

    public LocalDate getfechaNacimiento() {
        return fechaNacimiento;
    }//Cierra get

    public void setfechaNacimiento(LocalDate fechaNacimiento) {
        fechaNacimiento = fechaNacimiento;
    }//Cierra set





}//Cierra Class