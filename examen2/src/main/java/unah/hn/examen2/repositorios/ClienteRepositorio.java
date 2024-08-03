package unah.hn.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.examen2.modelos.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, String> {
    
}
