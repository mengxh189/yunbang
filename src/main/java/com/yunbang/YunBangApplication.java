package com.yunbang;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.yunbang.*.dao")
@SpringBootApplication
@EnableCaching
public class YunBangApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(YunBangApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(YunBangApplication.class, args);
        LOGGER.info("YunBang Service stard");
        float freeMemory = Runtime.getRuntime().freeMemory();
        float totalMemory = Runtime.getRuntime().totalMemory();
        float usedMemory = totalMemory - freeMemory;
        float usedMemPercent = Math.round(usedMemory / totalMemory * 100);
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        LOGGER.info("  OS Name    |   TotalMemory(M)   |   usedMemory(M)  |   freeMemory(M)  |   usedMemPercent   |  javaVersion");
        LOGGER.info(" {}          {}               {}            {}           {}%            {}", osName, totalMemory/1024/1024, usedMemory/1024/1024, freeMemory/1024/1024, usedMemPercent, javaVersion);
    }
}
