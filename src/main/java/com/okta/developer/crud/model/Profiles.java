package com.okta.developer.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "Profiles")
public class Profiles {

    @Id
    @GeneratedValue
    private Long profile_id;
    private String headline;
    private  String summary;
    private String industry;
    private String website;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Profiles(String headline, String summary, String industry, String website, Users users) {
        this.headline = headline;
        this.summary = summary;
        this.industry = industry;
        this.website = website;
        this.users = users;
    }

    public Long getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(Long profile_id) {
        this.profile_id = profile_id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Profiles{" +
                "profile_id=" + profile_id +
                ", headline='" + headline + '\'' +
                ", summary='" + summary + '\'' +
                ", industry='" + industry + '\'' +
                ", website='" + website + '\'' +
                ", users=" + users +
                '}';
    }
}
