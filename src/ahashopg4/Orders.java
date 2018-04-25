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
public class Orders {
    private int order_id;
    private String status;

    public Orders(int order_id, String status) {
        this.order_id = order_id;
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" + "order_id=" + order_id + ", status=" + status + '}';
    }
    
    
}
