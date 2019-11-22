package com.manage.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 图书表
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@TableName("b_books")
public class Books extends Model<Books> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 书籍名称
     */
    private String bookName;

    /**
     * 书籍作者
     */
    private String bookAuthor;

    /**
     * 书籍出版社
     */
    private String bookPub;

    /**
     * 书籍是否在书架
     */
    private String bookNum;

    /**
     * 书籍分类
     */
    private String bookSort;

    /**
     * 所在书架编号
     */
    private String readerPrestige;

    /**
     * 图书正面封面
     */
    private String frontImageUrl;

    /**
     * 图书背面封面
     */
    private String afterImageUrl;

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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPub() {
        return bookPub;
    }

    public void setBookPub(String bookPub) {
        this.bookPub = bookPub;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookSort() {
        return bookSort;
    }

    public void setBookSort(String bookSort) {
        this.bookSort = bookSort;
    }

    public String getReaderPrestige() {
        return readerPrestige;
    }

    public void setReaderPrestige(String readerPrestige) {
        this.readerPrestige = readerPrestige;
    }

    public String getFrontImageUrl() {
        return frontImageUrl;
    }

    public void setFrontImageUrl(String frontImageUrl) {
        this.frontImageUrl = frontImageUrl;
    }

    public String getAfterImageUrl() {
        return afterImageUrl;
    }

    public void setAfterImageUrl(String afterImageUrl) {
        this.afterImageUrl = afterImageUrl;
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
        return "Books{" +
        "id=" + id +
        ", bookName=" + bookName +
        ", bookAuthor=" + bookAuthor +
        ", bookPub=" + bookPub +
        ", bookNum=" + bookNum +
        ", bookSort=" + bookSort +
        ", readerPrestige=" + readerPrestige +
        ", frontImageUrl=" + frontImageUrl +
        ", afterImageUrl=" + afterImageUrl +
        ", createId=" + createId +
        ", createName=" + createName +
        ", createTime=" + createTime +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", updateTime=" + updateTime +
        "}";
    }
}
