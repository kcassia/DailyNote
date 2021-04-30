package com.sweetwith.dailynote.domain.file;

public class ImageFile extends File
{
    public ImageFile(String fileName, String filePath, Byte[] fileBody, String fileAuthor)
    {
        super(fileName, filePath, fileBody, fileAuthor);
        setFileType("image");
    }
}
