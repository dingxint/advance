package com.desiree.advance.aspect.service;

import com.desiree.advance.aspect.dto.FileDto;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    public FileDto get(String id) {

        FileDto fileDto = new FileDto();
        fileDto.setId("12");
        fileDto.setFilePath("2394823984");
        fileDto.setFilePath("3");

        return fileDto;
    }
}
