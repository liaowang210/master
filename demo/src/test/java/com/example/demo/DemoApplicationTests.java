package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://10.5.23.184:3306/lld_search?useSSL=false";  //数据库地址
        String userName="smart";   //数据库名
        String password="smart_@_2019";   //数据库密码

        Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动器

        Connection conn=null;
        conn= DriverManager.getConnection(url,userName,password);  //创建连接对象
    }

}
