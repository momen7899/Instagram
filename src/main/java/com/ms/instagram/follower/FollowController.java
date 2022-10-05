package com.ms.instagram.follower;

import com.ms.instagram.common.like.Like;
import com.ms.instagram.common.like.LikeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/follower/")
@AllArgsConstructor
public class FollowController {

    private final FollowerMapper mapper;
    private  final  FollowServicePl servicePl;

    @PostMapping("/follow")
    public ResponseEntity save(@RequestBody FollowerDTO followerDTO){
        Follower follower =mapper.toFollow(followerDTO);
        servicePl.save(follower);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
