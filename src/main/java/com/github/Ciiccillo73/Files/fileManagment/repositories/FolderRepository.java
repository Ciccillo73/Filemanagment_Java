package com.github.Ciiccillo73.Files.fileManagment.repositories;


import com.github.Ciiccillo73.Files.fileManagment.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
