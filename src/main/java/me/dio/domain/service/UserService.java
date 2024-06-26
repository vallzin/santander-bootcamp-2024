package me.dio.domain.service;

import me.dio.domain.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Usuario findById(Long id);

    Usuario create(Usuario usuarioToCreate);

}
