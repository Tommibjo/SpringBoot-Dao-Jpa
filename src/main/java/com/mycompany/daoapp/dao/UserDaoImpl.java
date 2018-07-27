/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoapp.dao;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tommib
 */
@Repository
public class UserDaoImpl extends AbstractPersistable<Long> implements UserDAO {

    @Override
    public void getAllUsers() {
        
    }

    @Override
    public void addUser(String name) {
        
    }
    
}
