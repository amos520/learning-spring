package org.amos.ioc.overview.dependency.injection;

import org.amos.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        UserRepository userRepository = beanFactory.getBean("userRepository", UserRepository.class);
        System.out.println(userRepository.getUsers());

    }

}
