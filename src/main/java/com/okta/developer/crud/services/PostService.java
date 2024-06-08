package com.okta.developer.crud.services;

import com.okta.developer.crud.model.Post;
import com.okta.developer.crud.model.User;
import com.okta.developer.crud.repository.PostRepository;
import com.okta.developer.crud.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final Logger log = LoggerFactory.getLogger(PostService.class);

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    public Post createPost(Post post){
        Optional<User> userExist =userRepository.findById(post.getUser().getUserId());
        if(userExist.isPresent()){
            return postRepository.save(post);
        }else {
            return null;
        }
    }

    public List<Post> findAll(){
        log.info("===inside the postServices=====" +postRepository.findAll());
        return postRepository.findAll();
    }

    public Post findById(Integer postId){
        Optional<Post> postExist = postRepository.findById(postId);
        if (postExist.isPresent()) {
            Post post = postExist.get();
            return post;
        } else {
            log.warn("Post with id " + postId + " not found");
            return null;
        }
    }

    public String deletePostById(Integer postId){
        Optional<Post> postExist = postRepository.findById(postId);
        if (postExist.isPresent()) {
            postRepository.deleteById(postId);
            return "Post with ID " + postId + " deleted successfully";
        } else {
            return "Post with id " + postId + " not found";
        }
    }

}
