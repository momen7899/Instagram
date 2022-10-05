package com.ms.instagram.follower;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.profile.ProfileModel;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Audited
@Table(name = "tbl_follower")
public class Follower extends BaseEntity {

    @NotNull
    @Column(name = "tbl_follower")
    private Boolean Follow;


    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileModel profile;

}
