package services;

import model.entities.*;

import java.util.List;

public class OrderEditor {

    private List<ItemOrder> orders;

    public OrderEditor(List<ItemOrder> orders) {
        this.orders = orders;
    }

    public void setName(Integer index, String name) {
        orders.get(index).setName(name);
    }

    public void setCPF(Integer index, String cpf) {
        orders.get(index).setCpf(cpf);
    }

    public void setEmail(Integer index, String email) {
        orders.get(index).setEmail(email);
    }

    public void setUnitPrice(Integer index, Double unitPrice) {
        orders.get(index).setUnitPrice(unitPrice);
    }

    public void setQuantityItem(Integer index, Integer quantityItem) {
        orders.get(index).setQuantityItem(quantityItem);
    }

    public void setStatus(Integer index, OrderProcessing orderProcessing) {
        orders.get(index).setOrderProcessing(orderProcessing);
    }


}
