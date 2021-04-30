package com.sweetwith.dailynote.domain.file;

import com.sweetwith.dailynote.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Log
@Getter @Setter
public abstract class File extends BaseTimeEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String fileType; // image, text…
    private String filePath;
    private String fileLocation; // getting from front-end
    private String fileAuthor;
    private Byte[] fileBody;
    private int fileSize;

    public File(String fileName, String filePath, Byte[] fileBody, String fileAuthor)
    {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileAuthor = fileAuthor;
        this.fileBody = fileBody;
        fileSize = fileBody.length;
    }
}
