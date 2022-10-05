package com.ms.instagram.common.like;

import com.ms.instagram.post.PostMapper;
import com.ms.instagram.profile.ProfileMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PostMapper.class, ProfileMapper.class})
public interface LikeMapper {
    Like toLike(LikeDTO likeDTO);
    LikeDTO toLikeDTO(Like like);
    List<Like> toLikeList(List<LikeDTO> likeDTOS);
    List<LikeDTO> toLikeDTOs(List<Like> likes);

}
