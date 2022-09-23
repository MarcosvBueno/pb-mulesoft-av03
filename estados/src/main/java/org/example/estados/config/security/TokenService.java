package org.example.estados.config.security;

import java.util.Date;

import org.example.estados.model.Usuarios;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
    @Value("${estados.jwt.expiration}")
    private String expiration;

    @Value("${estados.jwt.secret}")
    private String secret;

    public String gerarToken(Authentication authentication){
        Usuarios logado = (Usuarios) authentication.getPrincipal();
        Date hoje = new Date();
        Date dataExpiracao = new Date(hoje.getTime() + Long.parseLong(expiration));
        return Jwts.builder()
                .setIssuer("API - Estados")
                .setSubject(logado.getId().toString())
                .setIssuedAt(hoje)
                .setExpiration(dataExpiracao)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

}