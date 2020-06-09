package com.github.Ciiccillo73.Files.fileManagment.controller;

import com.github.Ciiccillo73.Files.fileManagment.models.File;
import com.github.Ciiccillo73.Files.fileManagment.models.User;
import com.github.Ciiccillo73.Files.fileManagment.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {
    @Autowired
    FileRepository fileRepository;
    //index route, all users
    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    //show route, show a user by id

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFileById(@PathVariable Long id){
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    //create route, create a new instance of user

    @PostMapping(value = "/files")
    public ResponseEntity<File> addFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }




}
