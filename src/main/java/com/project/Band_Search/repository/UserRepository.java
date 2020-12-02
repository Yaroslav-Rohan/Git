package com.project.Band_Search.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.project.Band_Search.models.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    //User findByEmail(String email);
    //Page<User> findByEmail(Pageable pageable);
    //User findByEmail(String email);
}

