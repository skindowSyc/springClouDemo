package com.skindow.consumer.controller;

import com.skindow.common.Vo.ReturnVo;
import com.skindow.common.entity.consumer.CalTest;
import com.skindow.consumer.service.CalTestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ Author     ：syc.
 * @ Date       ：Created in 15:44 2021/4/8
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@RestController
@Slf4j
@RequestMapping("/calTest")
@Api(tags = "calTest测试")
public class CalTestController {
    @Resource
    private CalTestService calTestService;

    @GetMapping("/queryAll")
    @ApiOperation("查询所有")
    public ReturnVo<List<CalTest>> queryCalTest() {
        return calTestService.queryAll();
    }

    @PostMapping("/testSeata")
    public ReturnVo<Void> testSeata(){
        calTestService.testSeata();
        return ReturnVo.success();
    }
}
