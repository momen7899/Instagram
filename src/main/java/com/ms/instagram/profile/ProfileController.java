package com.ms.instagram.profile;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile/")
@AllArgsConstructor
public class ProfileController {
    private final ProfileServicePl servicePl;
    private final ProfileMapper mapper;

    @PostMapping("save/")
    public ResponseEntity save(@RequestBody ProfileDTO profileDTO){
        ProfileModel profile = mapper.toProfile(profileDTO);
        servicePl.save(profile);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
