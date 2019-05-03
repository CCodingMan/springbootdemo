package com.ljj.springbootdemo.base;

import com.ljj.springbootdemo.base.comm.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljj
 * @Date: 2019/5/2 15:53
 * @Description: 测试获取配置文件数据
 */
@RestController
@RequestMapping("/base")
public class GetConfigFileDataController {
    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;

    @Autowired
    private AuthorSettings authorSettings;

    @GetMapping("/getConfigFileData")
    public String getConfigFileData(){
        return String.format("book author is : %s,book name is : %s", author, name);
    }

    @GetMapping("/getConfigFileData2")
    public String getConfigFileData2(){
        return String.format("author name is : %s,author age is : %d", authorSettings.getName(), authorSettings.getAge());
    }
}
