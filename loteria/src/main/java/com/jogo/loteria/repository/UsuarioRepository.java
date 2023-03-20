package com.jogo.loteria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jogo.loteria.model.Usuario;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    
}
