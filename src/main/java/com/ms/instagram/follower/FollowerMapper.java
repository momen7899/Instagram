package com.ms.instagram.follower;

import com.ms.instagram.post.Post;
import com.ms.instagram.post.PostDTO;
import com.ms.instagram.profile.ProfileMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProfileMapper.class})
public interface FollowerMapper {
    Follower toFollow(FollowerDTO followerDTO);

    FollowerDTO toFollowDTO(Follower follower);

    List<FollowerDTO> toFollowDTOs(List<Follower> followers);

    List<Follower> toFollow(List<FollowerDTO> followerDTOS);
}
