import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Partidos")
public class Partido {
    @Id
    @GeneratedValue
    private int id;
    private LocalDate inicio_partido;
    private LocalDate fin_partido;
    @ManyToOne
    Cancha cancha;
    @ManyToOne
    Color colorCancha;
    @ManyToOne
    Jugador jugadorResponsable;
    @ManyToMany
    @JoinTable(name = "Participaciones")
    List<Jugador> jugadores = new ArrayList<>();
}
