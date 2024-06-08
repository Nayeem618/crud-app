package com.okta.developer.crud.controller;

import com.okta.developer.crud.model.Post;
import com.okta.developer.crud.services.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest")
public class PostController {
    private final Logger log = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return postService.findAll();
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<?> getPostById(@PathVariable Integer postId){
        Post postExist =postService.findById(postId);
        if(postExist == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Post with id "+postId +" not found");
        }else{
            return ResponseEntity.status(HttpStatus.CREATED).body(postExist);
        }
    }

    @PostMapping("/create/post")
    public ResponseEntity<?> createPost(@RequestBody Post post){
        Post result = postService.createPost(post);
        if(result == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User with id " + post.getUser().getUserId() + " not found");
        }else {
            return  ResponseEntity.status(HttpStatus.CREATED).body(result) ;
        }
    }

    @DeleteMapping("/delete/post/{postId}")
    public ResponseEntity<?> deletePostById(@PathVariable Integer postId ){
        String result = postService.deletePostById(postId);
        if(result.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Post with id " + postId + " not found");
        }else {
            return  ResponseEntity.status(HttpStatus.CREATED).body(result) ;
        }
    }



}
