package com.example.demo;

import com.example.demo.post.Post;
import com.example.demo.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @GetMapping("/api/posts")
//    public List<Post> getAllPosts() {
//        return postService.getAll();
//    }
//
//    @GetMapping("/api/posts/{id}")
//    public Post get(@PathVariable int id) {
//        return postService.get(id);
//    }

}