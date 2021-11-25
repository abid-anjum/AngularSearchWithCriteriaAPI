package com.aisc.angular.search.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.aisc.angular.search.model.Post;
import com.aisc.angular.search.repository.*;

@Service
public class PostServiceImpl implements PostService{

	private final PostRepository postRepository;
	
	public PostServiceImpl(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	@Override
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	@Override
	public Post createPost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public Post updatePost(long id, Post postRequest) throws ResourceNotFoundException {
		Post post = postRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		
		post.setTitle(postRequest.getTitle());
		post.setDescription(postRequest.getDescription());
		post.setContent(postRequest.getContent());
		return postRepository.save(post);
	}

	@Override
	public void deletePost(long id) throws ResourceNotFoundException {
		Post post = postRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		
		postRepository.delete(post);
	}

	@Override
	public Post getPostById(long id) throws ResourceNotFoundException {
		Optional<Post> result = postRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}else {
			throw new ResourceNotFoundException("Post", "id", id);
		}
	}
}