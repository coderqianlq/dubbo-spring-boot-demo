package com.qianlq.dubboprovider.config.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author CoderQian
 * @date 2019-01-18 6:37 PM
 * mail: qianlq0824@gmail.com
 * <p>
 * 配置druid监控统计功能
 */

@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = "192.168.16.110,127.0.0.1"), // IP白名单 (没有配置或者为空，则允许所有访问)
                @WebInitParam(name = "deny", value = "192.168.16.111"), // IP黑名单 (存在共同时，deny优先于allow)
                @WebInitParam(name = "loginUsername", value = "kBEuJPHmTgcVvKlt"),// 用户名
                @WebInitParam(name = "loginPassword", value = "zPhIJTa0jvsZ7sLj"),// 密码
                @WebInitParam(name = "resetEnable", value = "false")// 禁用HTML页面上的“Reset All”功能
        }
)
public class DruidStatViewServlet extends StatViewServlet {
}