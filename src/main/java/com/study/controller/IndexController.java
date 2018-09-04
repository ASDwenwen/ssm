package com.study.controller;

import com.study.admin.pojo.User;
import com.study.service.UserService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Properties;

/**
 * Administrator
 */
@Controller
//@RestController//组合注解@Controller @ResponseBody
public class IndexController {

    @Autowired
    private UserService userService;
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @GetMapping(value="/"/*,produces = "text/html;charset=utf-8"*/)
    //@ResponseBody
    public String index(Model model, HttpServletRequest request){
        /*User user=new User();
        user.setUsername("tan");
        user.setPassword("123");
        user.setEmail("138");
        user.setPhone("111");
        userService.add(user);*/
        return "index";
/*//        response.setContentType("text/html;charset=utf-8");
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        Template template = null;
        String string = null;
        try {
             template = configuration.getTemplate("index.ftl");
            try {
                 string = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String path = this.getClass().getClassLoader().getResource("/properties/a.properties").getPath();
        InputStream  in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(path);
            out = new FileOutputStream(path,true);
            Properties pro=new Properties();
            try {
               // pro.load(in);
                pro.load(in);
                pro.setProperty("bbb","tan");
                pro.setProperty("bb1b","tan");
                pro.store(out,"hahah1");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStream  in1 = null;
        try {
            in1=new FileInputStream(new File(path));
            Properties pro1=new Properties();
            pro1.load(in1);
            System.out.println(pro1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return string;*/
    }
}
