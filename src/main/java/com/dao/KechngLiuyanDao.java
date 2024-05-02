package com.dao;

import com.entity.KechngLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechngLiuyanView;

/**
 * 课程留言 Dao 接口
 *
 * @author 
 * @since 2021-04-15
 */
public interface KechngLiuyanDao extends BaseMapper<KechngLiuyanEntity> {

   List<KechngLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
