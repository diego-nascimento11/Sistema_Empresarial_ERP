package model.entities;

import java.util.Date;

public class ItemOrder extends Client {

    private OrderProcessing orderProcessing;
    private Double unitPrice;
    private Integer quantityItem;

    public ItemOrder(String name, String cpf, String email, Date date, Double unitPrice, Integer quantityItem, OrderProcessing orderProcessing) {
        super(name, cpf, email, date);
        this.unitPrice = unitPrice;
        this.quantityItem = quantityItem;
        this.orderProcessing = orderProcessing;
    }

    public OrderProcessing getOrderProcessing() {
        return orderProcessing;
    }

    public void setOrderProcessing(OrderProcessing orderProcessing) {
        this.orderProcessing = orderProcessing;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(Integer quantityItem) {
        this.quantityItem = quantityItem;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n|Preço p/Unidade: %.2f\n|Quantidade: %d\n|Status do pedido: %s\n|Total: %.2f\n=====================", unitPrice, quantityItem, orderProcessing, total());
    }

    public Double total() {
        return unitPrice * quantityItem;
    }


}
