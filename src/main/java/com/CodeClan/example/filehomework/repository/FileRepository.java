package com.CodeClan.example.filehomework.repository;

import com.CodeClan.example.filehomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
