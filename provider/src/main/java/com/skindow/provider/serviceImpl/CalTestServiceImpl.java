package com.skindow.provider.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skindow.common.Vo.ReturnVo;
import com.skindow.common.entity.consumer.CalTest;
import com.skindow.provider.mapper.CalTestMapper;
import com.skindow.provider.service.CalTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：syc.
 * @ Date       ：Created in 15:23 2021/4/8
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Slf4j
@Service
public class CalTestServiceImpl extends ServiceImpl<CalTestMapper, CalTest> implements CalTestService {


    @Override
    public ReturnVo<List<CalTest>> queryAll(){
        return ReturnVo.successData(baseMapper.selectList(null));
    }
}
