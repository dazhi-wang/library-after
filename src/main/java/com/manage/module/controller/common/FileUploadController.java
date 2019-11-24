package com.manage.module.controller.common;

import com.manage.utils.FileUpload;
import com.manage.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  通用文件上传
 * </p>
 *
 * @author liujiajia
 * @since 2019-11-23
 */
@RestController
@RequestMapping("/fileUpload")
public class FileUploadController {
    @Autowired
    private FileUpload fileUpload;
    /**
     * 单文件上传
     */
    @PostMapping("/upload")
    public R uploadFile(@RequestParam(value = "file", required = false) MultipartFile multipartFile) {
        return new R(fileUpload.singleUpload(multipartFile));
    }
}
