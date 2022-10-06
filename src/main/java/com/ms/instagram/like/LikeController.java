package com.ms.instagram.like;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/like/v1")
@AllArgsConstructor
public class LikeController {

    private final LikeService service;
    private LikeMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody LikeDTO likeDTO) {
        Like like = mapper.toLike(likeDTO);
        service.save(like);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{likeId}")
    public ResponseEntity<Void> delete(@PathVariable Long likeId) {
        service.delete(likeId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
