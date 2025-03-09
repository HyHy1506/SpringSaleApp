package com.txd.repositories.impl;


import com.txd.pojo.Category;
import com.txd.saleapp.HibernateUtils;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    public List<Category> getCates(){
        try(Session s = HibernateUtils.getFACTORY().openSession()){
            Query q= s.createQuery("from Category",Category.class);
            return q.getResultList();
        }
    }
}
