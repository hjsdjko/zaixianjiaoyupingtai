package com.entity.view;

import com.entity.KechngEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("kechng")
public class KechngView extends KechngEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 类型的值
		*/
		private String kechngValue;



	public KechngView() {

	}

	public KechngView(KechngEntity kechngEntity) {
		try {
			BeanUtils.copyProperties(this, kechngEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getKechngValue() {
				return kechngValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setKechngValue(String kechngValue) {
				this.kechngValue = kechngValue;
			}















}
