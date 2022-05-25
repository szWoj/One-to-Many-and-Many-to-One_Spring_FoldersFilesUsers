package com.CodeClan.example.filehomework.components;

import com.CodeClan.example.filehomework.models.File;
import com.CodeClan.example.filehomework.models.Folder;
import com.CodeClan.example.filehomework.models.User;
import com.CodeClan.example.filehomework.repository.FileRepository;
import com.CodeClan.example.filehomework.repository.FolderRepository;
import com.CodeClan.example.filehomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;




    public DataLoader() {

    }
    public void run(ApplicationArguments args) {
        User user1 = new User("Mike");
        userRepository.save(user1);

        User user2 = new User("Mikee");
        userRepository.save(user2);

        User user3 = new User("Mikeee");
        userRepository.save(user3);

        Folder folder1 = new Folder("My first title", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("My first titlee", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("My first titlee", user3);
        folderRepository.save(folder3);


        File file1 = new File("file1", "exe1", "256", folder1);
        fileRepository.save(file1);

        File file2 = new File("file2", "exe2", "256", folder2);
        fileRepository.save(file2);

        File file3 = new File("file3", "exe3", "256", folder3);
        fileRepository.save(file3);
    }
    }
