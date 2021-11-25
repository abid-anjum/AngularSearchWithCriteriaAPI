package com.aisc.angular.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aisc.angular.search.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}