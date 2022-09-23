package org.example.estados.config.security;

import java.util.Optional;

import org.example.estados.model.Usuarios;
import org.example.estados.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService{

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuarios> usuarios = usuariosRepository.findByEmail(username);
		if(usuarios.isPresent()) {
			return usuarios.get();
		}
		
		throw new UsernameNotFoundException("Os dados inseridos são invalidos!");
	}

}
