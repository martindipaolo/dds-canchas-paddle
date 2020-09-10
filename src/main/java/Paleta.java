import javax.persistence.*;

@Entity
@Table(name = "Paletas")
public class Paleta {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private int grosor;
    @ManyToOne
    private Color color;
    @ManyToOne
    private ConstructorPaleta constructor;
}
