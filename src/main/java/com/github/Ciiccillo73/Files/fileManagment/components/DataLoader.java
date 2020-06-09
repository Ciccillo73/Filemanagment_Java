package com.github.Ciiccillo73.Files.fileManagment.components;

import com.github.Ciiccillo73.Files.fileManagment.repositories.FileRepository;
import com.github.Ciiccillo73.Files.fileManagment.repositories.FolderRepository;
import com.github.Ciiccillo73.Files.fileManagment.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader  implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}
}

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }


