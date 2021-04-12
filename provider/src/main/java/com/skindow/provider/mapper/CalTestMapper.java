package com.skindow.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skindow.common.entity.consumer.CalTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CalTestMapper extends BaseMapper<CalTest> {
}