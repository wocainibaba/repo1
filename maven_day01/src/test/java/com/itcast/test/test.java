package com.itcast.test;

import com.itcast.domain.items;
import com.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext as=new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsService bean = as.getBean(ItemsService.class);

        items byId = bean.findById(8);
        System.out.println(byId.getName());
    }

}
