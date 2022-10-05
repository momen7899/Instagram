package com.ms.instagram.post;

import com.ms.instagram.common.BaseDTO;
import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.profile.ProfileModel;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;

@Data
@Entity
@Audited
@Table(name = "tbl_post")
public class Post extends BaseEntity {

    @Column(name = "tbl_caption")
    private String caption;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileModel profile;
}
