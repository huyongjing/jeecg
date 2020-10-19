package org.jeecg.modules.demo.fy.service.impl;

import org.jeecg.modules.demo.fy.entity.FyTest;
import org.jeecg.modules.demo.fy.mapper.FyTestMapper;
import org.jeecg.modules.demo.fy.service.IFyTestService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 单表测试
 * @Author: jeecg-boot
 * @Date:   2020-10-19
 * @Version: V1.0
 */
@Service
public class FyTestServiceImpl extends ServiceImpl<FyTestMapper, FyTest> implements IFyTestService {

}
