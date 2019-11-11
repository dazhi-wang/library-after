package com.manage.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 借书表
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-11
 */
@TableName("b_boorow_books")
public class BoorowBooks extends Model<BoorowBooks> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 借书人id
     */
    private String readersId;

    /**
     * 书籍id
     */
    private String bookId;

    /**
     * 借书日期
     */
    private LocalDateTime borrowTime;

    /**
     * 预计归还日期
     */
    private LocalDateTime expectReturnTime;

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
    private LocalDateTime updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReadersId() {
        return readersId;
    }

    public void setReadersId(String readersId) {
        this.readersId = readersId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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
        return "BoorowBooks{" +
        "id=" + id +
        ", readersId=" + readersId +
        ", bookId=" + bookId +
        ", borrowTime=" + borrowTime +
        ", expectReturnTime=" + expectReturnTime +
        ", createId=" + createId +
        ", createName=" + createName +
        ", createTime=" + createTime +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", updateTime=" + updateTime +
        "}";
    }
}
