package org.applicaiton;

import org.energydrink.service.DrinkService;
import org.energydrink.service.LoadServices.DrinkLoadServices;
import org.energydrink.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicaiton.xml");

        System.out.println(context.getBean("drinkService", DrinkService.class));
        System.out.println(context.getBean("drinkLoadService", DrinkLoadServices.class));
        System.out.println(context.getBean("orderService", OrderService.class));
    }
}