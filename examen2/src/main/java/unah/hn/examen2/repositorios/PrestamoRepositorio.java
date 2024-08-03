package unah.hn.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.examen2.modelos.Prestamos;

public interface PrestamoRepositorio extends JpaRepository<Prestamos, Integer>{
    
}
