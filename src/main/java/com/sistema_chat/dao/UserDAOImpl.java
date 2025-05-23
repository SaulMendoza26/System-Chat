package com.sistema_chat.dao;

import java.util.List;
import java.util.Optional;

import com.sistema_chat.JPAUtil;
import com.sistema_chat.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UserDAOImpl implements UserDAO {

    private EntityManager em;

    public UserDAOImpl() {
        em = JPAUtil.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public User create(User user) {

        if (user == null) {
            throw new IllegalArgumentException("User object cannot be null");
        }

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
        return user;
    }

    @Override
    public boolean update(User user) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Optional<User> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<User> findByUsername(String username) {

        Optional<User> user = null;
        try {
            TypedQuery<User> query = em.createQuery("From user u where u.username= :username AND u.password= :password",
                    User.class);
            query.setParameter("username", username);
            List<User> resultado = query.getResultList();
            if (!resultado.isEmpty())
                user = Optional.ofNullable(resultado.get(0));

        } catch (Exception e) {

        } finally {
            em.close();
        }
        return user;
    }

    @Override
    public Optional<User> findByUsernameAndPassword(String username, String password) {

        Optional<User> user = null;
        try {
            TypedQuery<User> query = em.createQuery("From user u where u.username= :username AND u.password= :password",
                    User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            List<User> resultado = query.getResultList();
            if (!resultado.isEmpty())
                user = Optional.ofNullable(resultado.get(0));

        } catch (Exception e) {

        } finally {
            em.close();
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
