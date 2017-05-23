/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import webtest.entity.Hotel;

/**
 *
 * @author Administrateur
 */
public class HotelService {
    public List<Hotel> lister(){
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT h FROM Hotel h ORDER BY h").getResultList();
    }

    public void ajouter(Hotel h) {
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        EntityTransaction et= em.getTransaction();
        et.begin();
        em.persist(h);
        et.commit();
               
    }
}
