package com.skindow.provider.controller;

import com.skindow.common.Vo.ReturnVo;
import com.skindow.common.entity.consumer.CalTest;
import com.skindow.provider.service.CalTestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/deleteId")
    public ReturnVo<Boolean> deleteById(@RequestParam(name = "id") Long id) {
        log.info("删除id{}", id);
        return ReturnVo.successData(calTestService.removeById(id));
    }
}
