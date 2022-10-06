package com.ms.instagram.user;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.follower.Follower;
import com.ms.instagram.like.Like;
import com.ms.instagram.post.Post;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Audited
@Table(name = User.USER_TB_NAME)
public class User extends BaseEntity {
    public static final String USER_TB_NAME = "user_tb";

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private List<Like> like;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userFollower", cascade = CascadeType.ALL)
    private List<Follower> follower;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userFollowing", cascade = CascadeType.ALL)
    private List<Follower> following;
}
