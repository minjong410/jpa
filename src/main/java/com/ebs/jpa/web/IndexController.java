package com.ebs.jpa.web;

import com.ebs.jpa.config.auth.dto.SessionUser;
import com.ebs.jpa.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final UserJpaRepo userJpaRepo;
    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if(user != null){
            model.addAttribute("userName", user.getName());
        }

        // 주석 색깔은 검정
        return "index";

    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

}
