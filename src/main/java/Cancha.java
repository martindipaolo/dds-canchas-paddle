import javax.persistence.*;

@Entity
@Table(name = "Canchas")
public class Cancha {

    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private boolean estaIluminada;

    @ManyToOne
    private Color color;
}
