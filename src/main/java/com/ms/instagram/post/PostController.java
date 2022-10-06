package com.ms.instagram.post;


import com.ms.instagram.common.PagingDTO;
import com.ms.instagram.common.PagingData;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/post/v1")
@AllArgsConstructor
public class PostController {
    private final PostService service;
    private final PostMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody PostDTO postDTO) {
        Post post = mapper.toPost(postDTO);
        service.save(post);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<PostDTO> update(@RequestBody PostDTO postDTO) {
        Post post = mapper.toPost(postDTO);
        return ResponseEntity.ok(mapper.toPostDTO(service.save(post)));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<PostDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.toPostDTO(service.getById(id)));
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity<PagingData<PostDTO>> getPostById(@PathVariable Long userId, @Parameter PagingDTO pagingDTO) {
        Page<Post> posts = service.getPostsByUserId(userId, pagingDTO.getPage(), pagingDTO.getSize());
        int totalPage = posts.getTotalPages();
        List<PostDTO> data = mapper.toPostDTOs(posts.getContent());

        return ResponseEntity.ok(new PagingData<>(totalPage, pagingDTO.getPage(), data));
    }
}
