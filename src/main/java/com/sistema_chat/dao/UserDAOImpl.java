package com.sistema_chat.dao;

import java.util.List;
import java.util.Optional;

import com.sistema_chat.JPAUtil;
import com.sistema_chat.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UserDAOImpl implements UserDAO {

    private final  EntityManager em;

    public UserDAOImpl() {
        em = JPAUtil.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public void create(User user) {

        if (user == null) {
            throw new IllegalArgumentException("User object cannot be null");
        }

        try (em) {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
        
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
    public Optional<User> findByNick(String nickname) {

        Optional<User> user = Optional.ofNullable(null);
        try (em) {
            TypedQuery<User> query = em.createQuery("From user u where u.nickname= :nickname",
                    User.class);
            query.setParameter("nickname", nickname);
            List<User> resultado = query.getResultList();
            if (!resultado.isEmpty())
                user = Optional.ofNullable(resultado.get(0));

        } catch (Exception e) {

        }
        return user;
    }

    @Override
    public Optional<User> findByNickAndPassword(String nickName, String password) {

        Optional<User> user = null;
        try (em){
            TypedQuery<User> query = em.createQuery("From user u where u.nickName= :nickName AND u.password= :password",
                    User.class);
            query.setParameter("nickName", nickName);
            query.setParameter("password", password);
            List<User> resultado = query.getResultList();
            if (!resultado.isEmpty())
                user = Optional.ofNullable(resultado.get(0));

        } catch (Exception e) {

        }
        return user;
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
