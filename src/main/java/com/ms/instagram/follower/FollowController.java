package com.ms.instagram.follower;

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
@RequestMapping(value = "/api/follower/v1")
@AllArgsConstructor
public class FollowController {

    private final FollowerMapper mapper;
    private final FollowService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody FollowerDTO followerDTO) {
        Follower follower = mapper.toFollow(followerDTO);
        service.save(follower);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/following/{userId}")
    public ResponseEntity<PagingData<FollowerDTO>> findAllFollowing(@PathVariable Long userId, @Parameter PagingDTO pagingDTO) {
        Page<Follower> following = service.findAllFollowing(userId, pagingDTO.getPage(), pagingDTO.getSize());
        int totalPage = following.getTotalPages();
        List<FollowerDTO> data = mapper.toFollowDTOs(following.getContent());
        return ResponseEntity.ok(new PagingData<>(totalPage, pagingDTO.getPage(), data));
    }

    @DeleteMapping("/follower/{userId}")
    public ResponseEntity<PagingData<FollowerDTO>> findAllFollower(@PathVariable Long userId, @Parameter PagingDTO pagingDTO) {
        Page<Follower> following = service.findAllFollowers(userId, pagingDTO.getPage(), pagingDTO.getSize());
        int totalPage = following.getTotalPages();
        List<FollowerDTO> data = mapper.toFollowDTOs(following.getContent());
        return ResponseEntity.ok(new PagingData<>(totalPage, pagingDTO.getPage(), data));
    }
}
