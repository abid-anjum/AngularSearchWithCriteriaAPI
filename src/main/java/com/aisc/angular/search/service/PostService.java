package com.aisc.angular.search.service;

import java.util.List;

import com.aisc.angular.search.model.Post;

public interface PostService {
	List<Post> getAllPosts();

	Post createPost(Post post);

	Post updatePost(long id, Post post) throws ResourceNotFoundException;

	void deletePost(long id) throws ResourceNotFoundException;

	Post getPostById(long id) throws ResourceNotFoundException;
}