package com.sagar.secondspringapp.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
public class Skill {
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer skillId;
    @Column
    private String skillName;
    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    private User user;

    public Skill(String skillName) {
        this.skillName = skillName;
    }

    public Skill(String skillName, User user) {
        this.skillName = skillName;
        this.user = user;
    }

    public Skill() {
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
