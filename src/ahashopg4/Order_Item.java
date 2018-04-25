/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahashopg4;

/**
 *
 * @author INT105
 */
public class Order_Item {
    private int order_id;
    private int product_id;
    private int quantity;
    private double product_price;

    public Order_Item(Orders order_id, Product product_id, int quantity, double product_price) {
        this.order_id = order_id.getOrder_id();
        this.product_id = product_id.getProduct_id();
        this.quantity = quantity;
        this.product_price = product_price;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Order_Item{" + "order_id=" + order_id + ", product_id=" + product_id + ", quantity=" + quantity + ", product_price=" + product_price + '}';
    }
    
    
}
