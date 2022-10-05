package com.ms.instagram.post;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post/")
@AllArgsConstructor
public class PostController {
private final PostServicePl servicePl;
private final PostMapper mapper;


    @PostMapping("/save")
    public ResponseEntity save(@RequestBody PostDTO postDTO) {
        Post post = mapper.toPost(postDTO);
        servicePl.save(post);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
