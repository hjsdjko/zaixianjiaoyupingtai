package com.entity.vo;

import com.entity.ShangjiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 上交作业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("shangjiao")
public class ShangjiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
