package com.example.demo2.controllers;

import com.example.demo2.models.Post;
import com.example.demo2.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/department-main")
    public String department(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "departmentMain";
    }

}
