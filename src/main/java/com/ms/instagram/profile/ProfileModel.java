package com.ms.instagram.profile;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.common.like.Like;
import com.ms.instagram.follower.Follower;
import com.ms.instagram.post.Post;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Audited
@Table(name = "tbl_profile")
public class ProfileModel extends BaseEntity {

    @NotNull
    @Column(name = "tbl_name")
    private String name;

    @NotNull
    @Column(name = "user_name")
    private String userName;


    @Column(name = "tbl_bio")
    private String bio;


    @Column(name = "tbl_image")
    private String image;

 @OneToMany(fetch = FetchType.LAZY,mappedBy = "profile",cascade = CascadeType.ALL)
 private List<Post> posts;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "profile",cascade = CascadeType.ALL)
    private List<Like> like;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "profile",cascade = CascadeType.ALL)
    private List<Follower> follower;
}
