import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ConstructoresPaletas")
public class ConstructorPaleta {

    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String domicilio;
}
