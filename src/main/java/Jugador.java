import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Jugadores")
public class Jugador {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate nacimiento;
    @OneToOne
    private Paleta paleta;
}
