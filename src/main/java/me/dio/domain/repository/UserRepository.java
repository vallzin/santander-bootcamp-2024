package me.dio.domain.repository;

import me.dio.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{

    boolean existsByAccountNumber(String accountNumber);
}
