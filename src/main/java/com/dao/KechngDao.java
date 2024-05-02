package com.dao;

import com.entity.KechngEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechngView;

/**
 * 课程 Dao 接口
 *
 * @author 
 * @since 2021-04-15
 */
public interface KechngDao extends BaseMapper<KechngEntity> {

   List<KechngView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
