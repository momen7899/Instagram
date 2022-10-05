package com.ms.instagram.profile;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T10:52:31+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class ProfileMapperImpl implements ProfileMapper {

    @Override
    public ProfileModel toProfile(ProfileDTO profileDTO) {
        if ( profileDTO == null ) {
            return null;
        }

        ProfileModel profileModel = new ProfileModel();

        profileModel.setId( profileDTO.getId() );
        profileModel.setVersion( profileDTO.getVersion() );
        profileModel.setCreatedDate( profileDTO.getCreatedDate() );
        profileModel.setCreatedBy( profileDTO.getCreatedBy() );
        profileModel.setLastModifiedDate( profileDTO.getLastModifiedDate() );
        profileModel.setLastModifiedBy( profileDTO.getLastModifiedBy() );
        profileModel.setName( profileDTO.getName() );
        profileModel.setUserName( profileDTO.getUserName() );
        profileModel.setBio( profileDTO.getBio() );
        profileModel.setImage( profileDTO.getImage() );

        return profileModel;
    }

    @Override
    public ProfileDTO toProfileDTO(ProfileModel profile) {
        if ( profile == null ) {
            return null;
        }

        ProfileDTO profileDTO = new ProfileDTO();

        profileDTO.setId( profile.getId() );
        profileDTO.setVersion( profile.getVersion() );
        profileDTO.setCreatedDate( profile.getCreatedDate() );
        profileDTO.setCreatedBy( profile.getCreatedBy() );
        profileDTO.setLastModifiedDate( profile.getLastModifiedDate() );
        profileDTO.setLastModifiedBy( profile.getLastModifiedBy() );
        profileDTO.setName( profile.getName() );
        profileDTO.setUserName( profile.getUserName() );
        profileDTO.setBio( profile.getBio() );
        profileDTO.setImage( profile.getImage() );

        return profileDTO;
    }

    @Override
    public List<ProfileDTO> toProfileDTOs(List<ProfileModel> profiles) {
        if ( profiles == null ) {
            return null;
        }

        List<ProfileDTO> list = new ArrayList<ProfileDTO>( profiles.size() );
        for ( ProfileModel profileModel : profiles ) {
            list.add( toProfileDTO( profileModel ) );
        }

        return list;
    }

    @Override
    public List<ProfileModel> toProfile(List<ProfileDTO> profileDTOS) {
        if ( profileDTOS == null ) {
            return null;
        }

        List<ProfileModel> list = new ArrayList<ProfileModel>( profileDTOS.size() );
        for ( ProfileDTO profileDTO : profileDTOS ) {
            list.add( toProfile( profileDTO ) );
        }

        return list;
    }
}
