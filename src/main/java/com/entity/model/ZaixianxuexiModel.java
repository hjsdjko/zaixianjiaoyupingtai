package com.entity.model;

import com.entity.ZaixianxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 在线学习
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class ZaixianxuexiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
	 * 获取：标题
	 */
    public String getZaixianxuexiName() {
        return zaixianxuexiName;
    }


    /**
	 * 设置：标题
	 */
    public void setZaixianxuexiName(String zaixianxuexiName) {
        this.zaixianxuexiName = zaixianxuexiName;
    }
    /**
	 * 获取：封面
	 */
    public String getZaixianxuexiPhoto() {
        return zaixianxuexiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setZaixianxuexiPhoto(String zaixianxuexiPhoto) {
        this.zaixianxuexiPhoto = zaixianxuexiPhoto;
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
	 * 获取：学习视频
	 */
    public String getZaixianxuexiVideo() {
        return zaixianxuexiVideo;
    }


    /**
	 * 设置：学习视频
	 */
    public void setZaixianxuexiVideo(String zaixianxuexiVideo) {
        this.zaixianxuexiVideo = zaixianxuexiVideo;
    }
    /**
	 * 获取：发布教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：发布教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：详情信息
	 */
    public String getZaixianxuexiContent() {
        return zaixianxuexiContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setZaixianxuexiContent(String zaixianxuexiContent) {
        this.zaixianxuexiContent = zaixianxuexiContent;
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
