package com.entity.model;

import com.entity.ShangjiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 上交作业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class ShangjiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String shangjiaoName;


    /**
     * 类型
     */
    private Integer kechngTypes;


    /**
     * 文件
     */
    private String shangjiaoFile;


    /**
     * 上交学生
     */
    private Integer yonghuId;


    /**
     * 详情信息
     */
    private String shangjiaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getShangjiaoName() {
        return shangjiaoName;
    }


    /**
	 * 设置：标题
	 */
    public void setShangjiaoName(String shangjiaoName) {
        this.shangjiaoName = shangjiaoName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getKechngTypes() {
        return kechngTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setKechngTypes(Integer kechngTypes) {
        this.kechngTypes = kechngTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getShangjiaoFile() {
        return shangjiaoFile;
    }


    /**
	 * 设置：文件
	 */
    public void setShangjiaoFile(String shangjiaoFile) {
        this.shangjiaoFile = shangjiaoFile;
    }
    /**
	 * 获取：上交学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：上交学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：详情信息
	 */
    public String getShangjiaoContent() {
        return shangjiaoContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setShangjiaoContent(String shangjiaoContent) {
        this.shangjiaoContent = shangjiaoContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
