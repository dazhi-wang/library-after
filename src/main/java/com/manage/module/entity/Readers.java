package com.manage.module.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 读者表
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@TableName("b_readers")
public class Readers extends Model<Readers> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 读者名称
     */
    private String readerName;

    /**
     * 读者年龄
     */
    private Integer readerAge;

    /**
     * 读者性别
     */
    private String readerSex;

    /**
     * 读者身份证号
     */
    private String readerId;

    /**
     * 读者地址
     */
    private String readerAdderss;

    /**
     * 读者信用值
     */
    private Integer readerPrestige;

    /**
     * 读者借书次数
     */
    private Integer readerNumber;

    /**
     * 借书卡截止日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime expireTime;

    /**
     * 押金
     */
    private BigDecimal deposit;

    /**
     * 创建人id
     */
    private String createId;

    /**
     * 创建人名称
     */
    private String createName;

    /**
     * 修改人id
     */
    private String updateId;

    /**
     * 修改人名称
     */
    private String updateName;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime updateTime;

    /**
     * 删除状态（-1 删除  0 正常）
     */
    private String delFlag;

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public Integer getReaderAge() {
        return readerAge;
    }

    public void setReaderAge(Integer readerAge) {
        this.readerAge = readerAge;
    }

    public String getReaderSex() {
        return readerSex;
    }

    public void setReaderSex(String readerSex) {
        this.readerSex = readerSex;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getReaderAdderss() {
        return readerAdderss;
    }

    public void setReaderAdderss(String readerAdderss) {
        this.readerAdderss = readerAdderss;
    }

    public Integer getReaderPrestige() {
        return readerPrestige;
    }

    public void setReaderPrestige(Integer readerPrestige) {
        this.readerPrestige = readerPrestige;
    }

    public Integer getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(Integer readerNumber) {
        this.readerNumber = readerNumber;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Readers{" +
        "id=" + id +
        ", readerName=" + readerName +
        ", readerAge=" + readerAge +
        ", readerSex=" + readerSex +
        ", readerId=" + readerId +
        ", readerAdderss=" + readerAdderss +
        ", readerPrestige=" + readerPrestige +
        ", readerNumber=" + readerNumber +
        ", expireTime=" + expireTime +
        ", deposit=" + deposit +
        ", createId=" + createId +
        ", createName=" + createName +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
