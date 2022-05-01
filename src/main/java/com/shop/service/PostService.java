package com.shop.service;

import com.shop.entity.Post;
import com.shop.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;


    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void savePost(Post post){
        getPostRepository().save(post);
    }

    public List<Post> getAllPosts(){
        return getPostRepository().findAll();
    }

    public void deletePost(Post post){
        getPostRepository().delete(post);
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }
}
