package com.zhang.springboot2.common;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
public class CreateWordUtil {

    public static  void createWord(Map dataMap){
        try {
            //Configuration 用于读取ftl文件
            Configuration configuration = new Configuration();
            configuration.setDefaultEncoding("utf-8");
            //获取根目录
            File path = new File(ResourceUtils.getURL("classpath:").getPath());
            if(!path.exists()) path = new File("");
            System.out.println("path:"+path.getAbsolutePath());
            //如果上传目录为/templates/，则可以如下获取：
            File upload = new File(path.getAbsolutePath(),"templates/");
            if(!upload.exists()) upload.mkdirs();
            System.out.println("upload url:"+upload.getAbsolutePath());
            //指定路径的第一种方式，
            //configuration.setClassForTemplateLoading();
            //指定路径的第二种方式，具体路径
            configuration.setDirectoryForTemplateLoading(upload);
            //输出文档路径及名称
            File outFile = new File("D:/测试报告.doc");
            //以utf-8的编码读取ftl文件
            Template template = configuration.getTemplate("test.ftl", "utf-8");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
