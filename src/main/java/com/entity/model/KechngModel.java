package com.entity.model;

import com.entity.KechngEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class KechngModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private Integer kechngName;


    /**
     * 课程图片
     */
    private String kechngPhoto;


    /**
     * 类型
     */
    private Integer kechngTypes;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shangkeTime;


    /**
     * 下课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiakeTime;


    /**
     * 课程信息
     */
    private String kechngContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：课程名称
	 */
    public Integer getKechngName() {
        return kechngName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechngName(Integer kechngName) {
        this.kechngName = kechngName;
    }
    /**
	 * 获取：课程图片
	 */
    public String getKechngPhoto() {
        return kechngPhoto;
    }


    /**
	 * 设置：课程图片
	 */
    public void setKechngPhoto(String kechngPhoto) {
        this.kechngPhoto = kechngPhoto;
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
	 * 获取：上课时间
	 */
    public Date getShangkeTime() {
        return shangkeTime;
    }


    /**
	 * 设置：上课时间
	 */
    public void setShangkeTime(Date shangkeTime) {
        this.shangkeTime = shangkeTime;
    }
    /**
	 * 获取：下课时间
	 */
    public Date getXiakeTime() {
        return xiakeTime;
    }


    /**
	 * 设置：下课时间
	 */
    public void setXiakeTime(Date xiakeTime) {
        this.xiakeTime = xiakeTime;
    }
    /**
	 * 获取：课程信息
	 */
    public String getKechngContent() {
        return kechngContent;
    }


    /**
	 * 设置：课程信息
	 */
    public void setKechngContent(String kechngContent) {
        this.kechngContent = kechngContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
