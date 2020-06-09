package com.github.Ciiccillo73.Files.fileManagment.repositories;

import com.github.Ciiccillo73.Files.fileManagment.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public enum UserRepository extends JpaRepository<User, Long> {
}
