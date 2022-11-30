package cl.tarot.repository;

import cl.tarot.entity.Tarotista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarotistaRepository extends JpaRepository<Tarotista, Integer> {
}
