package com.dao;

import com.entity.ZaixianxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianxuexiView;

/**
 * 在线学习 Dao 接口
 *
 * @author 
 * @since 2021-04-15
 */
public interface ZaixianxuexiDao extends BaseMapper<ZaixianxuexiEntity> {

   List<ZaixianxuexiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
