package io.github.jfalves.catalogo.repository;

import io.github.jfalves.catalogo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
