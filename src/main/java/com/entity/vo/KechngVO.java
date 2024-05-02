package com.entity.vo;

import com.entity.KechngEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("kechng")
public class KechngVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程名称
     */

    @TableField(value = "kechng_name")
    private Integer kechngName;


    /**
     * 课程图片
     */

    @TableField(value = "kechng_photo")
    private String kechngPhoto;


    /**
     * 类型
     */

    @TableField(value = "kechng_types")
    private Integer kechngTypes;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangke_time")
    private Date shangkeTime;


    /**
     * 下课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiake_time")
    private Date xiakeTime;


    /**
     * 课程信息
     */

    @TableField(value = "kechng_content")
    private String kechngContent;


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
	 * 设置：课程名称
	 */
    public Integer getKechngName() {
        return kechngName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechngName(Integer kechngName) {
        this.kechngName = kechngName;
    }
    /**
	 * 设置：课程图片
	 */
    public String getKechngPhoto() {
        return kechngPhoto;
    }


    /**
	 * 获取：课程图片
	 */

    public void setKechngPhoto(String kechngPhoto) {
        this.kechngPhoto = kechngPhoto;
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
	 * 设置：上课时间
	 */
    public Date getShangkeTime() {
        return shangkeTime;
    }


    /**
	 * 获取：上课时间
	 */

    public void setShangkeTime(Date shangkeTime) {
        this.shangkeTime = shangkeTime;
    }
    /**
	 * 设置：下课时间
	 */
    public Date getXiakeTime() {
        return xiakeTime;
    }


    /**
	 * 获取：下课时间
	 */

    public void setXiakeTime(Date xiakeTime) {
        this.xiakeTime = xiakeTime;
    }
    /**
	 * 设置：课程信息
	 */
    public String getKechngContent() {
        return kechngContent;
    }


    /**
	 * 获取：课程信息
	 */

    public void setKechngContent(String kechngContent) {
        this.kechngContent = kechngContent;
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
