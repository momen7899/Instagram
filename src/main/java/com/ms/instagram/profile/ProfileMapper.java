package com.ms.instagram.profile;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfileMapper{

    ProfileModel toProfile(ProfileDTO profileDTO);
    ProfileDTO toProfileDTO(ProfileModel profile);
    List<ProfileDTO> toProfileDTOs(List<ProfileModel> profiles);
    List<ProfileModel> toProfile(List<ProfileDTO> profileDTOS);
}
