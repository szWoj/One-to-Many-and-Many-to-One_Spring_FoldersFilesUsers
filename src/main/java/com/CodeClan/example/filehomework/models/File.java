package com.CodeClan.example.filehomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="files")
public class File implements Serializable {

    @Column(name="first_name")
    private String firstName;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private String size;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"files"})
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String firstName, String extension, String size, Folder folder) {
        this.firstName = firstName;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
