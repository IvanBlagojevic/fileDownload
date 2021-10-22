package com.example.downloadDemo.services;

import com.example.downloadDemo.models.FileDataDto;

import java.io.File;
import java.io.IOException;


public interface FileService {

    File writeToFile(FileDataDto fileData) throws IOException;


}
