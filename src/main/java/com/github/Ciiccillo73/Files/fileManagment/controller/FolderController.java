package com.github.Ciiccillo73.Files.fileManagment.controller;

import com.github.Ciiccillo73.Files.fileManagment.models.Folder;
import com.github.Ciiccillo73.Files.fileManagment.models.User;
import com.github.Ciiccillo73.Files.fileManagment.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;
    //index route, all users
    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    //show route, show a user by id

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolderById(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    //create route, create a new instance of user

    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> addFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }



}
