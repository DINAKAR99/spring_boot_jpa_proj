package cgg.spring_boot_jpa.spring_boot_jpa_proj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cgg.spring_boot_jpa.spring_boot_jpa_proj.entities.User;

public interface userRepository extends CrudRepository<User, Integer> {

    public List<User> findByName(String name);

    public List<User> findByNameAndCity(String name, String city);

    @Query("select u from User u ")
    public List<User> getAllUsers();

    @Query("select u from User u where u.name=:n")
    public List<User> getUserByName(@Param("n") String nam);

    @Query(value = "select * from user_table ", nativeQuery = true)
    public List<User> getUsers();

}
