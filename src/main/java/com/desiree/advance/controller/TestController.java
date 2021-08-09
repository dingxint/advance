package com.desiree.advance.controller;


import com.desiree.advance.vo.BookVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping(value = "add")
    public void findVehicles(@RequestBody BookVo bookVo) {

        return;
    }

    @GetMapping(value = "test01")
    public void test01(@ApiParam("姓名") @RequestParam("name") String name,
                       @ApiParam(value = "页面", required = true) @RequestParam("page") Integer page, Integer count) {

        return;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名称", required = true,
                    dataType = "string", paramType = "query", defaultValue = "辽A12345"),
            @ApiImplicitParam(name = "page", value = "page", required = false,
                    dataType = "Integer", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "count", value = "count", required = false,
                    dataType = "Integer", paramType = "query", defaultValue = "10")
    })
    @GetMapping(value = "detail")
    public void findVehicles(@RequestParam("name") String name, Integer page, Integer count) {

        return;
    }


}
