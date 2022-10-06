package com.ms.instagram.follower;

import com.ms.instagram.user.UserMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface FollowerMapper {
    Follower toFollow(FollowerDTO followerDTO);

    FollowerDTO toFollowDTO(Follower follower);

    List<FollowerDTO> toFollowDTOs(List<Follower> followers);

    List<Follower> toFollow(List<FollowerDTO> followerDTOS);
}
