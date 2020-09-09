package com.itheima.test;

import com.itheima.config.SpringConfiguration;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhangycl
 * @date: 2020/8/31
 * @description: 测试queryrunner是否单例
 */
public class QueryRunnerTest {

    @Test
    public void testQueryRunner() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        QueryRunner runner = ac.getBean("runner",QueryRunner.class);
        QueryRunner runner1 = ac.getBean("runner",QueryRunner.class);
        System.out.println(runner == runner1);
    }

}
