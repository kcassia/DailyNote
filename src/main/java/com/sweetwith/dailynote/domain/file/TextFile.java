package com.sweetwith.dailynote.domain.file;

public class TextFile extends File
{
    public TextFile(String fileName, String filePath, Byte[] fileBody, String fileAuthor)
    {
        super(fileName, filePath, fileBody, fileAuthor);
        setFileType("text");
    }
}
