package com.skindow.consumer.service;

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
public interface CalTestService {

    /**
     * @return 查询所有
     */
    ReturnVo<List<CalTest>> queryAll();

    /**
     * @return 测试分布式锁
     */
    public ReturnVo<Void> testSeata();
}
