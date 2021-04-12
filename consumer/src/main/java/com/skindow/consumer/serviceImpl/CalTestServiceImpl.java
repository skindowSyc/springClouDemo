package com.skindow.consumer.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skindow.common.Vo.ReturnVo;
import com.skindow.common.entity.consumer.CalTest;
import com.skindow.common.fiegn.provider.CalTestFeignService;
import com.skindow.consumer.mapper.CalTestMapper;
import com.skindow.consumer.service.CalTestService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Resource
    private CalTestFeignService calTestFeignService;

    @Override
    public ReturnVo<List<CalTest>> queryAll(){
        return ReturnVo.successData(baseMapper.selectList(null));
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public ReturnVo<Void> testSeata() {
        CalTest calTest = new CalTest();
        calTest.setId(1L);
        calTest.setName("seata");
        baseMapper.updateById(calTest);
        calTestFeignService.deleteById(1L);
        return ReturnVo.success();
    }
}
