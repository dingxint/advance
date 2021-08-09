package com.desiree.advance.controller;


import com.desiree.advance.dto.FileDto;
import com.desiree.advance.service.FileService;
import com.desiree.advance.vo.BookVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.annotation.Retention;

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
