package com.github.Ciiccillo73.Files.fileManagment.repositories;

import com.github.Ciiccillo73.Files.fileManagment.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
