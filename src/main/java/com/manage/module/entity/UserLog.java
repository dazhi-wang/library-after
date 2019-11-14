package com.manage.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户登录日志表
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-14
 */
@TableName("sys_user_log")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLog {
    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 登录IP
     */
    private String ip;
    /**
     * 登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private LocalDateTime loginTime;
}
