
package reloj;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Usuario
 */
public class MainReloj {


    public static void main(String[] args) {
        
    
     Reloj casio = new Reloj(LocalDate.now(), LocalTime.now(), "Pepe", 12354);

    Persona person = new Persona("Juan", "Perez", 43, 1.75, casio);
     person.decirHora();
     casio.incrementarDia(5);
     casio.incrementarHora(10);

     person.decirHora();
    
    RelojFit appleWatch =new RelojFit(LocalDate.now(), LocalTime.now(), "verde",12360);
    
    appleWatch.cuentaPasos(10, 8);
        
    }
    
}
