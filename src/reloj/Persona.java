package reloj;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, double altura, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }
  
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void decirHora() {
        System.out.println("La Hora es: "+reloj.getHora());
    }

    public void hablar() {
    }

    public void comer() {
    }
}
