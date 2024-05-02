package com.entity.vo;

import com.entity.ZaixianxuexiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 在线学习
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("zaixianxuexi")
public class ZaixianxuexiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
