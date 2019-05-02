package com.ljj.springbootdemo.base;

import com.ljj.springbootdemo.base.comm.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljj
 * @Date: 2019/5/2 15:53
 * @Description:
 */
@RestController
@RequestMapping("/base")
public class GetConfigFileData {
    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/getConfigFileData")
    public String getConfigFileData(){
        return String.format("book author is : %s,book name is : %s", author, name);
    }

    @RequestMapping("/getConfigFileData2")
    public String getConfigFileData2(){
        return String.format("author name is : %s,author age is : %d", authorSettings.getName(), authorSettings.getAge());
    }
}