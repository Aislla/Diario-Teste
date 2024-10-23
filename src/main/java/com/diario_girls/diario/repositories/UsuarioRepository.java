package src.main.java.com.diario_girls.diario.repositories;

import src.main.java.com.diario_girls.diario.entities.Usuario;
//import com.diario_girls.diario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// A anotação @Repository indica que esta interface é um componente Spring
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     // Não é necessário adicionar código aqui para as operações básicas.
    // O JpaRepository já fornece métodos como save, findAll, findById, deleteById, etc.
}
