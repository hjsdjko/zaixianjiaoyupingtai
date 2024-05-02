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
 * 上交作业
 *
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("shangjiao")
public class ShangjiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangjiaoEntity() {

	}

	public ShangjiaoEntity(T t) {
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
    @TableField(value = "shangjiao_name")

    private String shangjiaoName;


    /**
     * 类型
     */
    @TableField(value = "kechng_types")

    private Integer kechngTypes;


    /**
     * 文件
     */
    @TableField(value = "shangjiao_file")

    private String shangjiaoFile;


    /**
     * 上交学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 详情信息
     */
    @TableField(value = "shangjiao_content")

    private String shangjiaoContent;


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
    public String getShangjiaoName() {
        return shangjiaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setShangjiaoName(String shangjiaoName) {
        this.shangjiaoName = shangjiaoName;
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
	 * 设置：文件
	 */
    public String getShangjiaoFile() {
        return shangjiaoFile;
    }


    /**
	 * 获取：文件
	 */

    public void setShangjiaoFile(String shangjiaoFile) {
        this.shangjiaoFile = shangjiaoFile;
    }
    /**
	 * 设置：上交学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：上交学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：详情信息
	 */
    public String getShangjiaoContent() {
        return shangjiaoContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setShangjiaoContent(String shangjiaoContent) {
        this.shangjiaoContent = shangjiaoContent;
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
        return "Shangjiao{" +
            "id=" + id +
            ", shangjiaoName=" + shangjiaoName +
            ", kechngTypes=" + kechngTypes +
            ", shangjiaoFile=" + shangjiaoFile +
            ", yonghuId=" + yonghuId +
            ", shangjiaoContent=" + shangjiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
