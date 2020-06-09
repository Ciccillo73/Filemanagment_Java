package com.github.Ciiccillo73.Files.fileManagment.components;

import com.github.Ciiccillo73.Files.fileManagment.models.File;
import com.github.Ciiccillo73.Files.fileManagment.models.Folder;
import com.github.Ciiccillo73.Files.fileManagment.models.User;
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

    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        User francesco = new User("Francesco");
        userRepository.save(francesco);

        User antonio = new User("Antonio");
        userRepository.save(antonio);

        User john = new User("John");
        userRepository.save(john);

        Folder folder1 = new Folder("papers", francesco);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("photos", francesco);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("places", francesco);
        folderRepository.save(folder3);

        File file1 = new File("pic1", ".jpg",3456, folder1);
        fileRepository.save(file1);
        File file2 = new File("install", ".exe",5465, folder2);
        fileRepository.save(file2);

        File file3 = new File("document", ".doc",52334, folder3);
        fileRepository.save(file3);





    }


}


