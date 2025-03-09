/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.txd.repositories.impl;

import com.txd.pojo.OrderDetail;
import com.txd.pojo.Product;
import com.txd.saleapp.HibernateUtils;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class StatsRepositoryImpl  {
    public List<Object[]> statsRevenueByProduct(){
         try(Session s = HibernateUtils.getFACTORY().openSession()){
            CriteriaBuilder b = s.getCriteriaBuilder();
            CriteriaQuery<Product> q= b.createQuery(Product.class);
            Root root = q.from(Product.class);
             Join<OrderDetail,Product> join = root.join("productId",JoinType.RIGHT);
             
             
             
             
//             q.multiselect(join.get("id"),join.get("name"),root)
         
         
         
         }
    }
}
