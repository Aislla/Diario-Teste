package main.java.com.diario_girls.diario.entities;
import javax.persistence.*;

@Entity
@Table(name = "calendario")
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int num;

    // Construtor padrão (obrigatório pelo JPA)
    public Calendario() {
    }

    // Construtor com parâmetro
    public Calendario(int num) {
        this.num = num;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

