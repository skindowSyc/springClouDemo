package com.skindow.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skindow.common.Vo.ReturnVo;
import com.skindow.common.entity.consumer.CalTest;

import java.util.List;

/**
 * @ Author     ：syc.
 * @ Date       ：Created in 15:37 2021/4/9
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
public interface CalTestService extends IService<CalTest> {
    ReturnVo<List<CalTest>> queryAll();
}
