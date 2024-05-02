package com.dao;

import com.entity.ShangjiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiaoView;

/**
 * 上交作业 Dao 接口
 *
 * @author 
 * @since 2021-04-15
 */
public interface ShangjiaoDao extends BaseMapper<ShangjiaoEntity> {

   List<ShangjiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
