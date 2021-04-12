package com.skindow.common.fiegn.provider;

import com.skindow.common.Vo.ReturnVo;
import com.skindow.common.entity.consumer.CalTest;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ Author     ：syc.
 * @ Date       ：Created in 15:41 2021/4/8
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Component
@FeignClient(value = "nacos-provider")
public interface CalTestFeignService {
    /**
     * @return 查询所有
     */
    @GetMapping("/calTest/queryAll")
    @ApiOperation("查询所有")
    ReturnVo<List<CalTest>> queryAll();

    @PostMapping("/calTest/deleteId")
    ReturnVo<Boolean> deleteById(@RequestParam(name = "id") Long id);
}
