/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahashopg4;

import dbconnection.DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {
    private int product_id;
    private String product_name;
    private double price;

    Product(){
        
    }
    
    public Product(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + '}';
    }
    
    public static Product findByID(int id) throws ClassNotFoundException, SQLException{
        Product product = null;
        Connection conn = DbConnection.getConnection();
        PreparedStatement preparedStment = conn.prepareStatement("SELECT * FROM product WHERE product_id=?");
        preparedStment.setInt(1, id);
        ResultSet rslt = preparedStment.executeQuery();
        if(rslt.next())
            product = new Product();
            orm(rslt,product);
//        Statement stment = conn.createStatement();
//        ResultSet rslt = stment.executeQuery("SELECT * FROM product WHERE product_id = " + id);
//        if(rslt.next()){
//            product = new Product(rslt.getInt(1), rslt.getString(2), rslt.getDouble(3));
//        }
        conn.close();
//        ResultSet rslt = stment.executeQuery("SELECT * FROM produc");
//        while(rslt.next()){
//            if(rslt.getInt("product_id") == id){
//                product = new Product(rslt.getInt("product_id"), rslt.getString("product_name"), rslt.getDouble("price"));
//            }
//        }
        return product;
    }
    
    public int updateProduct() throws ClassNotFoundException, SQLException{
        int result = 0;
        Connection conn = DbConnection.getConnection();
        PreparedStatement ppStment = conn.prepareStatement("SELECT * FROM product WHERE product_id=?");
        ppStment.setInt(1, this.product_id);
        ResultSet rslt = ppStment.executeQuery(); 
        if(rslt.next()){
            ppStment = conn.prepareStatement("UPDATE product SET product_name = ?, price = ? WHERE product_id = ?");
            ppStment.setString(1, this.product_name);
            ppStment.setDouble(2, this.price);
            ppStment.setInt(3, this.product_id);
            result = ppStment.executeUpdate();
        }
        else{
            ppStment = conn.prepareStatement("INSERT INTO product(product_id, product_name, price) VALUES(?, ?, ?)");
            ppStment.setInt(1, this.product_id);
            ppStment.setString(2, this.product_name);
            ppStment.setDouble(3, this.price);
            
            result = ppStment.executeUpdate();
        }
//        Statement stment = conn.createStatement();
//        //Single Quote for characters (char, varchar)
//        if(rslt.next()){
//            result = stment.executeUpdate("UPDATE product SET product_name = '" + this.product_name + "', price = " + this.price + "WHERE product_id = " + this.product_id);
//        }
//        else{
//            result = stment.executeUpdate("INSERT INTO product VALUES(" + this.product_id + ",'" + this.product_name + "'," + this.price + ")");
//        }
        conn.close();
        return result;
    } 
    
    public static void orm(ResultSet rs, Product prd) throws SQLException{
        prd.setProduct_id(rs.getInt("product_id"));
        prd.setProduct_name(rs.getString("product_name"));
        prd.setPrice(rs.getDouble("price"));
    }
}
