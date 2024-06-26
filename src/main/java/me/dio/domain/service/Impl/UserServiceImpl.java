package me.dio.domain.service.Impl;

import me.dio.domain.model.Usuario;
import me.dio.domain.repository.UserRepository;
import me.dio.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioToCreate) {
        if(userRepository.existByAccountNumber(usuarioToCreate.getAccount().getNumber()))
            throw new IllegalArgumentException("This Account number already exists.");

        return userRepository.save(usuarioToCreate);
    }
}
