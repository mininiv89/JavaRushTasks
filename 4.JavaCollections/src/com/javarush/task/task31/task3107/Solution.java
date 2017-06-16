package com.javarush.task.task31.task3107;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    private boolean hidden;
    private boolean executable;
    private boolean directory;
    private boolean writable;
    private Path path;

    public Solution(String pathToFile) {
        try {
            this.path = Paths.get(pathToFile);
            this.hidden = Files.isHidden(path);
            this.executable = Files.isExecutable(path);
            this.directory = Files.isDirectory(path);
            this.writable = Files.isWritable(path);

            this.fileData = new ConcreteFileData(hidden, executable, directory, writable);

        } catch (Exception e) {
            e.printStackTrace();
            this.fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
