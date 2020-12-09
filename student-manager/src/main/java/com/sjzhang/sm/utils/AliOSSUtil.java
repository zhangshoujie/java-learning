package com.sjzhang.sm.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.File;
import java.util.UUID;

/**
 * @ClassName AliOSSUtil
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/20
 **/
public class AliOSSUtil {
    /**
     * 将本能地file上传到阿里云指定域名目录下，并用UUID重命名
     *
     * @param  file 待传文件
     * @return String 上传成功返回true
     */
    public static String ossUpload(File file) {
        String bucketDomain = "https://zsj-bucket.oss-cn-beijing.aliyuncs.com/";
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI4G5VqtyPxuzZQxhtm1vx";
        String accessKeySecret = "bM0ppzRyrYeBD2GJbb5khQnyip4Pi6";
        String bucketName = "zsj-bucket";
        String fileDir = "picture/";
        String fileName = file.getName();
        String fileKey = UUID.randomUUID().toString() + fileName.substring(fileName.indexOf("."));
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, fileDir + fileKey, file);
        ossClient.shutdown();
        return bucketDomain + fileDir + fileKey;
    }

    public static void main(String[] args) {
        File file = new File("D:\\road.jpg");
        String url = ossUpload(file);
        System.out.println(url);
    }
}

