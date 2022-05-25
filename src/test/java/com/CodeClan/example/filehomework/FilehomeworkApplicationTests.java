package com.CodeClan.example.filehomework;

import com.CodeClan.example.filehomework.models.File;
import com.CodeClan.example.filehomework.models.Folder;
import com.CodeClan.example.filehomework.models.User;
import com.CodeClan.example.filehomework.repository.FileRepository;
import com.CodeClan.example.filehomework.repository.FolderRepository;
import com.CodeClan.example.filehomework.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilehomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createFolderAndUserThenSave(){
		User user1 = new User("Mike");
		userRepository.save(user1);

		Folder folder1 = new Folder("My first title", user1);
		folderRepository.save(folder1);

		File file1 = new File("Name", "exe", "256", folder1);
		fileRepository.save(file1);
	}

}
