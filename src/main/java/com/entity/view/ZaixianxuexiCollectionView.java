package com.entity.view;

import com.entity.ZaixianxuexiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 在线学习收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("zaixianxuexi_collection")
public class ZaixianxuexiCollectionView extends ZaixianxuexiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



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

		//级联表 zaixianxuexi
			/**
			* 标题
			*/
			private String zaixianxuexiName;
			/**
			* 封面
			*/
			private String zaixianxuexiPhoto;
			/**
			* 类型
			*/
			private Integer kechngTypes;
				/**
				* 类型的值
				*/
				private String kechngValue;
			/**
			* 学习视频
			*/
			private String zaixianxuexiVideo;
			/**
			* 发布教师
			*/
			private Integer jiaoshiId;
			/**
			* 详情信息
			*/
			private String zaixianxuexiContent;

	public ZaixianxuexiCollectionView() {

	}

	public ZaixianxuexiCollectionView(ZaixianxuexiCollectionEntity zaixianxuexiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, zaixianxuexiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


				//级联表的get和set zaixianxuexi
					/**
					* 获取： 标题
					*/
					public String getZaixianxuexiName() {
						return zaixianxuexiName;
					}
					/**
					* 设置： 标题
					*/
					public void setZaixianxuexiName(String zaixianxuexiName) {
						this.zaixianxuexiName = zaixianxuexiName;
					}
					/**
					* 获取： 封面
					*/
					public String getZaixianxuexiPhoto() {
						return zaixianxuexiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setZaixianxuexiPhoto(String zaixianxuexiPhoto) {
						this.zaixianxuexiPhoto = zaixianxuexiPhoto;
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
					* 获取： 学习视频
					*/
					public String getZaixianxuexiVideo() {
						return zaixianxuexiVideo;
					}
					/**
					* 设置： 学习视频
					*/
					public void setZaixianxuexiVideo(String zaixianxuexiVideo) {
						this.zaixianxuexiVideo = zaixianxuexiVideo;
					}
					/**
					* 获取： 发布教师
					*/
					public Integer getJiaoshiId() {
						return jiaoshiId;
					}
					/**
					* 设置： 发布教师
					*/
					public void setJiaoshiId(Integer jiaoshiId) {
						this.jiaoshiId = jiaoshiId;
					}
					/**
					* 获取： 详情信息
					*/
					public String getZaixianxuexiContent() {
						return zaixianxuexiContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setZaixianxuexiContent(String zaixianxuexiContent) {
						this.zaixianxuexiContent = zaixianxuexiContent;
					}










}
