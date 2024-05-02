package com.entity.view;

import com.entity.KechngLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("kechng_liuyan")
public class KechngLiuyanView extends KechngLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 kechng
			/**
			* 课程名称
			*/
			private String kechngName;
			/**
			* 课程图片
			*/
			private String kechngPhoto;
			/**
			* 类型
			*/
			private Integer kechngTypes;
				/**
				* 类型的值
				*/
				private String kechngValue;
			/**
			* 上课时间
			*/
			private Date shangkeTime;
			/**
			* 下课时间
			*/
			private Date xiakeTime;
			/**
			* 课程信息
			*/
			private String kechngContent;

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public KechngLiuyanView() {

	}

	public KechngLiuyanView(KechngLiuyanEntity kechngLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, kechngLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set kechng
					/**
					* 获取： 课程名称
					*/
					public String getKechngName() {
						return kechngName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechngName(String kechngName) {
						this.kechngName = kechngName;
					}
					/**
					* 获取： 课程图片
					*/
					public String getKechngPhoto() {
						return kechngPhoto;
					}
					/**
					* 设置： 课程图片
					*/
					public void setKechngPhoto(String kechngPhoto) {
						this.kechngPhoto = kechngPhoto;
					}
					/**
					* 获取： 类型
					*/
					public Integer getKechngTypes() {
						return kechngTypes;
					}
					/**
					* 设置： 类型
					*/
					public void setKechngTypes(Integer kechngTypes) {
						this.kechngTypes = kechngTypes;
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
					/**
					* 获取： 上课时间
					*/
					public Date getShangkeTime() {
						return shangkeTime;
					}
					/**
					* 设置： 上课时间
					*/
					public void setShangkeTime(Date shangkeTime) {
						this.shangkeTime = shangkeTime;
					}
					/**
					* 获取： 下课时间
					*/
					public Date getXiakeTime() {
						return xiakeTime;
					}
					/**
					* 设置： 下课时间
					*/
					public void setXiakeTime(Date xiakeTime) {
						this.xiakeTime = xiakeTime;
					}
					/**
					* 获取： 课程信息
					*/
					public String getKechngContent() {
						return kechngContent;
					}
					/**
					* 设置： 课程信息
					*/
					public void setKechngContent(String kechngContent) {
						this.kechngContent = kechngContent;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}












}
