package com.diario.diario;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diario_girls.diario.DiarioApplication;
import com.diario_girls.diario.entities.Usuario;
import com.diario_girls.diario.repositories.UsuarioRepository;

@SpringBootTest(classes = DiarioApplication.class)
class DiarioApplicationTests {
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Test
	void testConexao() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("inicio do teste ");
		
		LocalDate date = LocalDate.parse("13/11/2023", formato);
		Usuario usuario = new Usuario("nivia", "test2@gmail.com", "222N", date);

        Usuario usuarioSalvo = null;
		try {
			usuarioSalvo = usuarioRepo.save(usuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Assertions.assertNotNull(usuarioSalvo.getId(), "ID do usuário não deve ser nulo após o salvamento");
        Assertions.assertEquals("nivia", usuarioSalvo.getNome());
    
	}
	
}
