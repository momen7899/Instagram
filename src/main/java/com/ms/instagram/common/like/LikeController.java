package com.ms.instagram.common.like;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/like/")
@AllArgsConstructor
public class LikeController {

    private final LikeServicePl service;
    private LikeMapper mapper;

    @PostMapping("/like")
    public ResponseEntity save(@RequestBody LikeDTO likeDTO){
        Like like =mapper.toLike(likeDTO);
        service.save(like);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/unlike")
    public ResponseEntity update(@RequestBody LikeDTO likeDTO){
        Like like =mapper.toLike(likeDTO);
        service.update(like);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get_like/{id}")
    public ResponseEntity<LikeDTO> getById(@PathVariable Long id ){

        Like like = service.getById(id);
        LikeDTO likeDTO=mapper.toLikeDTO(like);
        return ResponseEntity.ok(likeDTO);
    }
    @GetMapping("/all_like")
    public ResponseEntity<List<LikeDTO>> getAll(){

        List<Like> likes=    service.getAll();
        List<LikeDTO> likeDTOS=    mapper.toLikeDTOs(likes);
        return ResponseEntity.ok(likeDTOS);
    }
}
