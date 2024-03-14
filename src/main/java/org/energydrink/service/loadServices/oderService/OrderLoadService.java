package org.energydrink.service.loadServices.oderService;

import org.models.Order;
import org.utils.common.BaseLoadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderLoadService extends BaseLoadFile<List<Order>> {

    private static final String FILE_NAME = "order";

    public void add(Order data) throws IOException {
        List<Order> orderList = getOrder();
        orderList.add(data);
        save(orderList, FILE_NAME);
    }

    public List<Order> get() throws IOException {
        return getOrder();
    }

    public void save(List<Order> data) throws IOException {
        save(data, FILE_NAME);
    }
    private List<Order> getOrder() throws IOException {
        try {
            return load(FILE_NAME);
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

}
