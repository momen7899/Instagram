package com.ms.instagram.common.like;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.post.Post;
import com.ms.instagram.profile.ProfileModel;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_like")
@Data
@Audited
public class Like extends BaseEntity {

    @NotNull
    @Column(name = "is_like")
    private Boolean isLike;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private ProfileModel profile;

}
