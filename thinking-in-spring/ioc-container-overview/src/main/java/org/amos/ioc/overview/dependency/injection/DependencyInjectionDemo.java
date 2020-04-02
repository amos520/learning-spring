package org.amos.ioc.overview.dependency.injection;

import org.amos.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 依赖查注入示例
 * <p>
 * Date: 2020/3/11 18:12
 *
 * @author: amos
 * Description:
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) {
        //配置xml 配置文件
        //启动 Spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        //自定义 Bean
        UserRepository userRepository = beanFactory.getBean("userRepository", UserRepository.class);
        System.out.println(userRepository.getUsers());
        //依赖注入-内建依赖
        System.out.println(userRepository.getBeanFactory());

        //依赖查找(错误)
//        System.out.println(beanFactory.getBean(BeanFactory.class));

        //容器内建 Bean 容器初始化内部的Bean
        Environment environment = beanFactory.getBean(Environment.class);
    }

}
