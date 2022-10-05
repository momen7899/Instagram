package com.ms.instagram.comment;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.post.Post;
import com.ms.instagram.profile.ProfileModel;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_comment")
@Data
@Audited
public class Comment extends BaseEntity {


    @NotNull
    @Column(name = "comment")
    private String comment;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private ProfileModel profile;


    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
