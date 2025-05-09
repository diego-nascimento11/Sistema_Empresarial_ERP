package model.entities;

import java.util.Date;

public class ItemOrder extends Client {

    private Double unitPrice;
    private Integer quantityItem;

    public ItemOrder(String name, String cpf, String email, Date date, Double unitPrice, Integer quantityItem) {
        super(name, cpf, email, date);
        this.unitPrice = unitPrice;
        this.quantityItem = quantityItem;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n|Preço p/Unidade: " + unitPrice +
                "\nQuantidade: " + quantityItem +
                "\nTotal: " + total();
    }

    public Double total() {
        return unitPrice * quantityItem;
    }

    


}
