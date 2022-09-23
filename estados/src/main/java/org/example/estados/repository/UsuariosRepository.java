package org.example.estados.repository;

import java.util.Optional;

import org.example.estados.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

	Optional<Usuarios> findByEmail(String email);
}
