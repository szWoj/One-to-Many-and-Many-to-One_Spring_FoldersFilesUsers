package com.CodeClan.example.filehomework.repository;

import com.CodeClan.example.filehomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
