package org.energydrink.service;

import org.energydrink.service.loadServices.oderService.NormalOrderLoadService;
import org.energydrink.service.loadServices.oderService.OrderLoadService;
import org.energydrink.service.loadServices.oderService.SpecialOrderLoadService;
import org.models.OrderType;

public class OrderService {

    private final OrderLoadService loadService;

    public OrderService(OrderLoadService loadService) {
        this.loadService = loadService;
    }

    public static OrderService of(OrderType orderType) {
        OrderLoadService loadService;
        switch (orderType) {
            case NORMAL -> loadService = new NormalOrderLoadService();
            case SPECIAL -> loadService = new SpecialOrderLoadService();
            default -> throw new IllegalArgumentException("Unknown order type: " + orderType);
        }
        return new OrderService(loadService);
    }

    private void init() {
        System.out.println("пока не придумал, практикуемся инициализировать данные перед созданием бина)");
    }

    private void destroy() {
        System.out.println("пока не придумал, практикуемся очищать бины перед удалением)");
    }

}
