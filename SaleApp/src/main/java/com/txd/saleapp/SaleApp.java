/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.txd.saleapp;

import com.txd.repositories.impl.CategoryRepositoryImpl;
import com.txd.repositories.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class SaleApp {

    public static void main(String[] args) {
        CategoryRepositoryImpl c= new CategoryRepositoryImpl();
        c.getCates().forEach(ca-> System.err.println(ca.getName()));
        
        ProductRepositoryImpl pro= new ProductRepositoryImpl();
        
        Map<String,String> params=new HashMap<>();
//        params.put("kw","galaxy");
//        params.put("categoryId", "2");
params.put("page", "1");
        pro.getProducts(params).forEach(p-> System.err.println(p.getName()));
    }
}
