/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tommib
 */
@Repository
public interface UserDAO extends JpaRepository<User, Long>{

    public void getAllUsers();

    public void addUser(String name);

}
