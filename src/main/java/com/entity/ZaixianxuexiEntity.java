package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 在线学习
 *
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("zaixianxuexi")
public class ZaixianxuexiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZaixianxuexiEntity() {

	}

	public ZaixianxuexiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "zaixianxuexi_name")

    private String zaixianxuexiName;


    /**
     * 封面
     */
    @TableField(value = "zaixianxuexi_photo")

    private String zaixianxuexiPhoto;


    /**
     * 类型
     */
    @TableField(value = "kechng_types")

    private Integer kechngTypes;


    /**
     * 学习视频
     */
    @TableField(value = "zaixianxuexi_video")

    private String zaixianxuexiVideo;


    /**
     * 发布教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 详情信息
     */
    @TableField(value = "zaixianxuexi_content")

    private String zaixianxuexiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getZaixianxuexiName() {
        return zaixianxuexiName;
    }


    /**
	 * 获取：标题
	 */

    public void setZaixianxuexiName(String zaixianxuexiName) {
        this.zaixianxuexiName = zaixianxuexiName;
    }
    /**
	 * 设置：封面
	 */
    public String getZaixianxuexiPhoto() {
        return zaixianxuexiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setZaixianxuexiPhoto(String zaixianxuexiPhoto) {
        this.zaixianxuexiPhoto = zaixianxuexiPhoto;
    }
    /**
	 * 设置：类型
	 */
    public Integer getKechngTypes() {
        return kechngTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setKechngTypes(Integer kechngTypes) {
        this.kechngTypes = kechngTypes;
    }
    /**
	 * 设置：学习视频
	 */
    public String getZaixianxuexiVideo() {
        return zaixianxuexiVideo;
    }


    /**
	 * 获取：学习视频
	 */

    public void setZaixianxuexiVideo(String zaixianxuexiVideo) {
        this.zaixianxuexiVideo = zaixianxuexiVideo;
    }
    /**
	 * 设置：发布教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：发布教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：详情信息
	 */
    public String getZaixianxuexiContent() {
        return zaixianxuexiContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setZaixianxuexiContent(String zaixianxuexiContent) {
        this.zaixianxuexiContent = zaixianxuexiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zaixianxuexi{" +
            "id=" + id +
            ", zaixianxuexiName=" + zaixianxuexiName +
            ", zaixianxuexiPhoto=" + zaixianxuexiPhoto +
            ", kechngTypes=" + kechngTypes +
            ", zaixianxuexiVideo=" + zaixianxuexiVideo +
            ", jiaoshiId=" + jiaoshiId +
            ", zaixianxuexiContent=" + zaixianxuexiContent +
            ", createTime=" + createTime +
        "}";
    }
}
