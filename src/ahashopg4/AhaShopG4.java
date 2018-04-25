/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahashopg4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author INT105
 */
public class AhaShopG4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        //1. Load Drivers
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        //2. Create Connections
        Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");
        
        //3. Create and Execute Statements
        Statement statement = connect.createStatement();
        //statement.executeUpdate("INSERT INTO product VALUES (24, 'Watch', 200)");
        //statement.executeUpdate("UPDATE product SET price = 50 WHERE product_id = 24");
        
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM order_item");
//        
//        System.out.println("Order Id \tProduct Id \tQuantity \tPrice");
//        
//        while(resultSet.next()){
//            System.out.println(resultSet.getInt(1) + "\t\t" + resultSet.getInt(2) + "\t\t" + resultSet.getInt(3) + "\t\t" + resultSet.getDouble(4));
//        }

        ResultSet resultS = statement.executeQuery("SELECT order_item.ORDER_ID,product.PRODUCT_NAME,order_item.QUANTITY,order_item.PRODUCT_PRICE, (order_item.QUANTITY * order_item.PRODUCT_PRICE) AS TOTAL FROM order_item JOIN product ON order_item.PRODUCT_ID = product.PRODUCT_ID WHERE order_id = 51");

        
        while(resultS.next()){
            System.out.println("Order ID: " + resultS.getInt("ORDER_ID") + "\t\tProduct Name: " + resultS.getString("PRODUCT_NAME") + "\nQuantity: " + resultS.getInt("QUANTITY")+ "\t\tPrice: " + resultS.getDouble("PRODUCT_PRICE") + "\nTotal: " + resultS.getDouble("TOTAL") + "\n");
        }
        
        connect.close();
        */
        /*
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");
        Statement stment = conn.createStatement();
        ResultSet rslt = stment.executeQuery("SELECT * FROM product");
        Product prodct;
        while(rslt.next()){
            prodct = new Product(rslt.getInt("product_id"), rslt.getString("product_name"), rslt.getDouble("price"));
            System.out.println(prodct);
        }
        conn.close();
        */
//        Product prodct1= Product.findByID(1);
//        System.out.println(prodct1.toString());
//        Product prodct2 = new Product(300, "Sofa", 200);
//        prodct2.updateProduct();
//        System.out.println(Product.findByID(300));
//        prodct2.setPrice(250);
//        prodct2.updateProduct();
//        System.out.println(Product.findByID(300));
//        Product pd1 = new Product(5, "SHU", 50);
//        System.out.println(pd1.updateProduct());
//        Product pd2 = new Product(150, "Eighteen", 50);
//        System.out.println(pd2.updateProduct());
//    Product prod01=Product.findById(30);
//    System.out.println(prod01);

//#compare Array ธรรมดา กับ ArrayList ของ String
//    String[] str_arr=new String[2];
//    str_arr[0]="Hello world!";
//    str_arr[1]="Java Programming";
//    System.out.println("Size of str_arr="+str_arr.length);
//    
//    for(int i=0;i<str_arr.length;i++){
//        System.out.println(str_arr[i]);
//    }
//    System.out.println("----------------------");
    
//    ArrayList<String> str_arr_list=new ArrayList<>();
//    str_arr_list.add("Hello world!");
//    str_arr_list.add("Java Programming");
//    str_arr_list.add("Other string");
//    str_arr_list.remove(1);
//    System.out.println("Size of str_arr_list="+str_arr_list.size());
//    
//    for(int i=0;i<str_arr_list.size();i++){
//        System.out.println(str_arr_list.get(i));
//    }
    
    Product pro01=new Product(200,"Mouse",50);
    Product pro02=new Product(201,"Pen",5);
    ArrayList<Product> prodArrList=new ArrayList<Product>();
    prodArrList.add(pro01);
    prodArrList.add(pro02);
    prodArrList.add(new Product(202,"Keyboard",3));
    prodArrList.add(new Product(203,"Moniter",200));
    
    System.out.println("----------------------");
    for(int i=0;i<prodArrList.size();i++){
        System.out.println(prodArrList.get(i).toString());
        Product updateProduct=prodArrList.get(i);
        prodArrList.get(i).updateProduct();
    }
    
    
    
    

    }
    
}
