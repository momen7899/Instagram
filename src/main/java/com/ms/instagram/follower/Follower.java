package com.ms.instagram.follower;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.user.User;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Audited
@Table(name = Follower.FOLLOWER_TB_NAME)
public class Follower extends BaseEntity {

    public static final String FOLLOWER_TB_NAME = "follower_tb";

    @ManyToOne
    @JoinColumn(name = "follower_id")
    private User userFollower;

    @ManyToOne
    @JoinColumn(name = "following_id")
    private User userFollowing;
}
