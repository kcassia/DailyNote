package com.sweetwith.dailynote.domain.file;

import lombok.extern.java.Log;

@Log
public class FileMgr
{
    private static FileMgr instance = new FileMgr();

    public static FileMgr getInstance()
    {
        if (instance == null)
            instance = new FileMgr();
        return instance;
    }

    public void writeFile(String title, File file)
    {
        log.info("FileMgr::writeFile start");

        // to be implemented

        log.info("FileMgr::writeFile end");
    }

    public File readFile(String title)
    {
        log.info("FileMgr::readFile start");

        // to be implemented

        log.info("FileMgr::readFile end");
        return null; // temp
    }
}
