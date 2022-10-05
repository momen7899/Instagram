package com.ms.instagram.follower;

import com.ms.instagram.profile.ProfileMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T10:52:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class FollowerMapperImpl implements FollowerMapper {

    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public Follower toFollow(FollowerDTO followerDTO) {
        if ( followerDTO == null ) {
            return null;
        }

        Follower follower = new Follower();

        follower.setId( followerDTO.getId() );
        follower.setVersion( followerDTO.getVersion() );
        follower.setCreatedDate( followerDTO.getCreatedDate() );
        follower.setCreatedBy( followerDTO.getCreatedBy() );
        follower.setLastModifiedDate( followerDTO.getLastModifiedDate() );
        follower.setLastModifiedBy( followerDTO.getLastModifiedBy() );
        follower.setProfile( profileMapper.toProfile( followerDTO.getProfile() ) );

        return follower;
    }

    @Override
    public FollowerDTO toFollowDTO(Follower follower) {
        if ( follower == null ) {
            return null;
        }

        FollowerDTO followerDTO = new FollowerDTO();

        followerDTO.setId( follower.getId() );
        followerDTO.setVersion( follower.getVersion() );
        followerDTO.setCreatedDate( follower.getCreatedDate() );
        followerDTO.setCreatedBy( follower.getCreatedBy() );
        followerDTO.setLastModifiedDate( follower.getLastModifiedDate() );
        followerDTO.setLastModifiedBy( follower.getLastModifiedBy() );
        followerDTO.setProfile( profileMapper.toProfileDTO( follower.getProfile() ) );

        return followerDTO;
    }

    @Override
    public List<FollowerDTO> toFollowDTOs(List<Follower> followers) {
        if ( followers == null ) {
            return null;
        }

        List<FollowerDTO> list = new ArrayList<FollowerDTO>( followers.size() );
        for ( Follower follower : followers ) {
            list.add( toFollowDTO( follower ) );
        }

        return list;
    }

    @Override
    public List<Follower> toFollow(List<FollowerDTO> followerDTOS) {
        if ( followerDTOS == null ) {
            return null;
        }

        List<Follower> list = new ArrayList<Follower>( followerDTOS.size() );
        for ( FollowerDTO followerDTO : followerDTOS ) {
            list.add( toFollow( followerDTO ) );
        }

        return list;
    }
}
