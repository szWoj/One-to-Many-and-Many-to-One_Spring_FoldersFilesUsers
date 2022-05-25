package com.CodeClan.example.filehomework.controller;

import com.CodeClan.example.filehomework.models.File;
import com.CodeClan.example.filehomework.models.Folder;
import com.CodeClan.example.filehomework.repository.FileRepository;
import com.CodeClan.example.filehomework.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFolders(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping(value = "files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> createShip(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
