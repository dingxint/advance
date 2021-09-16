package com.desiree.advance.aspect.controller;


import com.desiree.advance.aspect.dto.FileDto;
import com.desiree.advance.aspect.service.FileService;
import com.desiree.advance.aspect.vo.BookVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    @PostMapping(value = "add")
    public void findVehicles(@RequestBody BookVo bookVo) {

        return;
    }

    @GetMapping(value = "{id}")
    public FileDto test01(@PathVariable String id) {

        FileDto fileDto = fileService.get(id);

        return fileDto;
    }
}
