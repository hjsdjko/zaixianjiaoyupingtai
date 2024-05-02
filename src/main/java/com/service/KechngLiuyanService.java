package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechngLiuyanEntity;
import java.util.Map;

/**
 * 课程留言 服务类
 * @author 
 * @since 2021-04-15
 */
public interface KechngLiuyanService extends IService<KechngLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}