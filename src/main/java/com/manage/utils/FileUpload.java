package com.manage.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 文件上传
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-23
 */
@Component
public class FileUpload {
    // 文件上传路径
    @Value("${my-file.upload.url}")
    private String uploadUrl;

    @Value("${my-file.upload.prefix}")
    private String prefix;
    /**
     * 单文件上传
     * @param file
     * @return
     */
    public Map<String, Object> singleUpload(MultipartFile file) {
        // 返回结果
        Map<String, Object> resultMap = new HashMap<>();
        // 定义处理流对象
        BufferedOutputStream bufferedOutputStream = null;
        // 创建上传路径
        File uploadFile = new File(uploadUrl);
        // 判断服务器上传文件夹是否存在，如果不存在则创建
        if(!uploadFile.exists()) {
            uploadFile.mkdirs();
        }
        // 判断上传的文件是否为空
        if(file != null){
            // 获取文件后缀名
            String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."), file.getOriginalFilename().length());
            String filePath = "/"+ UUIDUtils.getUUID32()+suffix;
            // 拼接上传路径（上传地址+时间戳+uuid+后缀）
            File spliceFile = new File(uploadFile+filePath);
            // 将客户端上传的文件保存到上传路径下
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(spliceFile));
                // 上传文件长度（可用于限制上传文件大小）
                bufferedOutputStream.write(file.getBytes());
                // 上传
                bufferedOutputStream.flush();
                resultMap.put("status", true);
                resultMap.put("message", "上传成功");
                resultMap.put("data", new HashMap<String, Object>(){{
                    put("filePath", prefix+filePath);
                }});
            } catch (FileNotFoundException e ) {
                e.printStackTrace();
                // 上传文件失败
                resultMap.put("status", false);
                resultMap.put("message", "上传失败");
            } catch (IOException e) {
                e.printStackTrace();
                // 上传文件失败
                resultMap.put("status", false);
                resultMap.put("message", "上传失败");
            } finally {
                // 关闭处理流
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            // 文件不存在
            resultMap.put("status", false);
            resultMap.put("message", "上传文件不存在");
        }
        return resultMap;
    }
}
