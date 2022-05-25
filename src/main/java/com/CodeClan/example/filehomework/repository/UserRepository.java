package com.CodeClan.example.filehomework.repository;

import com.CodeClan.example.filehomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
