package com.manage.utils;

import java.util.UUID;
/**
 * <p>
 *  通用UUID生成
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-23
 */
public class UUIDUtils {
    /**
     * 生成32位UUID
     */
    public static String getUUID32() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
