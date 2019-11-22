package com.manage.module.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 还书表
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
public class ReturnBooks extends Model<ReturnBooks> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 书籍id
     */
    private String bookId;

    /**
     * 还书人姓名
     */
    private String returnName;

    /**
     * 是否超期
     */
    private String overdue;

    /**
     * 超时扣费
     */
    private BigDecimal overtimeMoney;

    /**
     * 超时天数
     */
    private Integer overtimeDays;

    /**
     * 借书人id
     */
    private String readersId;

    /**
     * 借书日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime borrowTime;

    /**
     * 预计归还日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime expectReturnTime;

    /**
     * 实际归还日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime returnTime;

    /**
     * 创建人id
     */
    private String createId;

    /**
     * 创建人名称
     */
    private String createName;

    /**
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 修改人id
     */
    private String updateId;

    /**
     * 修改人名称
     */
    private String updateName;

    /**
     * 修改日期
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

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    public BigDecimal getOvertimeMoney() {
        return overtimeMoney;
    }

    public void setOvertimeMoney(BigDecimal overtimeMoney) {
        this.overtimeMoney = overtimeMoney;
    }

    public Integer getOvertimeDays() {
        return overtimeDays;
    }

    public void setOvertimeDays(Integer overtimeDays) {
        this.overtimeDays = overtimeDays;
    }

    public String getReadersId() {
        return readersId;
    }

    public void setReadersId(String readersId) {
        this.readersId = readersId;
    }

    public LocalDateTime getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(LocalDateTime borrowTime) {
        this.borrowTime = borrowTime;
    }

    public LocalDateTime getExpectReturnTime() {
        return expectReturnTime;
    }

    public void setExpectReturnTime(LocalDateTime expectReturnTime) {
        this.expectReturnTime = expectReturnTime;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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
        return "ReturnBooks{" +
        "id=" + id +
        ", bookId=" + bookId +
        ", returnName=" + returnName +
        ", overdue=" + overdue +
        ", overtimeMoney=" + overtimeMoney +
        ", overtimeDays=" + overtimeDays +
        ", readersId=" + readersId +
        ", borrowTime=" + borrowTime +
        ", expectReturnTime=" + expectReturnTime +
        ", returnTime=" + returnTime +
        ", createId=" + createId +
        ", createName=" + createName +
        ", createTime=" + createTime +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", updateTime=" + updateTime +
        "}";
    }
}
