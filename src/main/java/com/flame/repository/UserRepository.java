package com.flame.repository;


import com.flame.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * Интерфейс репозитория с CRUD-операциями и дополнительным методом
 * для поиска учетной записи по имени пользователя.
 * Spring Data JPA автоматически генерирует реализацию интерфейса во время выполнения.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}