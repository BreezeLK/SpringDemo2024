package com.breeze.spring;

import com.breeze.spring.bean.Emp;
import com.breeze.spring.bean.MyBeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:demo.xml")
public class SpringTest {

    @Test
    public void getCarTest() {
        // 创建spring容器对象 applicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Car myCar = (Car) context.getBean("myCar");
        System.out.println(myCar);

        System.out.println("容器中的对象数量有：" + context.getBeanDefinitionCount());
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void getEmpTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp);
    }

}
