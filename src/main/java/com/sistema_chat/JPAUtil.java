package com.sistema_chat;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
private static final EntityManagerFactory emf;
static{
    emf= Persistence.createEntityManagerFactory("sistema_chat");
}
public static EntityManagerFactory getEntityManagerFactory(){
    return emf;
}
public static void close(){
    if(emf!= null && emf.isOpen()){
        emf.close();
    }
}
}
