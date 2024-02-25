package com.okta.developer.crud.demoData;

import com.okta.developer.crud.model.*;
import com.okta.developer.crud.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Date;

@Configuration
public class DemoDataInitializer {

    @Bean
    public CommandLineRunner initializeDemoData(UserRepository userRepository,
                                                ProfilesRepository profilesRepository,
                                                ConnectionsRepository connectionsRepository,
                                                EducationRepository educationRepository,
                                                ExperienceRepository experienceRepository,
                                                SkillsRepository skillsRepository,
                                                PostsRepository postsRepository,
                                                CommentsRepository commentsRepository,
                                                LikesRepository likesRepository,
                                                SharesRepository sharesRepository,
                                                GroupsRepository groupsRepository,
                                                GroupMembersRepository groupMembersRepository) {
        return args -> {
            // Create and save a user with associated data
            Users user1 = createUser("user1@example.com", "password1", "John Doe", "City1", new Date());
            Profiles profile1 = createProfile("Headline for John Doe", "Summary for John Doe", "Industry for John Doe", "www.johndoe.com");
            Connections connection1 = createConnection(user1, createUser("user2@example.com", "password2", "Jane Doe", "City2", new Date()), "Pending");
            Education education1 = createEducation(user1, "School1", "Degree1", "Field1", new Date(), new Date());
            Experience experience1 = createExperience(user1, "Company1", "Title1", "Location1", new Date(), new Date());
            Skills skill1 = createSkill(user1, "Skill1");
            Posts post1 = createPost(user1, "Post content for John Doe");
            Users commentedUser = createUser("user3@example.com", "password3", "Bob Smith", "City3", new Date());
            Comments comment1 = createComment(post1, commentedUser, "Comment content for Post1");
            Likes like1 = createLike(post1, commentedUser);
            Shares share1 = createShare(post1, commentedUser);
            Groups group1 = createGroup(user1, "Group1", "Description1", new Date());
            GroupMembers groupMember1 = createGroupMember(user1, group1);

            userRepository.saveAll(Arrays.asList(user1, connection1.getUsers()));
            profilesRepository.save(profile1);
            connectionsRepository.save(connection1);
            educationRepository.save(education1);
            experienceRepository.save(experience1);
            skillsRepository.save(skill1);
            postsRepository.save(post1);
            commentsRepository.save(comment1);
            likesRepository.save(like1);
            sharesRepository.save(share1);
            groupsRepository.save(group1);
            groupMembersRepository.save(groupMember1);
        };
    }

    private Users createUser(String email, String password, String name, String location, Date joinDate) {
        Users user = new Users();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);
        user.setLocation(location);
        user.setJoin_date(joinDate);
        return user;
    }

    private Profiles createProfile(String headline, String summary, String industry, String website) {
        Profiles profile = new Profiles();
        profile.setHeadline(headline);
        profile.setSummary(summary);
        profile.setIndustry(industry);
        profile.setWebsite(website);
        return profile;
    }

    private Connections createConnection(Users user, Users connectionUser, String connectionStatus) {
        Connections connection = new Connections();
        connection.setUsers(user);
        connection.setConnection_user_id(connectionUser.getUser_id());
        connection.setConnection_status(connectionStatus);
        return connection;
    }

    private Education createEducation(Users user, String schoolName, String degree, String fieldOfStudy, Date startDate, Date endDate) {
        Education education = new Education();
        education.setUsers(user);
        education.setSchool_name(schoolName);
        education.setDegree(degree);
        education.setField_of_study(fieldOfStudy);
        education.setStart_date(startDate);
        education.setEnd_date(endDate);
        return education;
    }

    private Experience createExperience(Users user, String companyName, String title, String location, Date startDate, Date endDate) {
        Experience experience = new Experience();
        experience.setUsers(user);
        experience.setCompany_name(companyName);
        experience.setTitle(title);
        experience.setLocation(location);
        experience.setStart_date(startDate);
        experience.setEnd_date(endDate);
        return experience;
    }

    private Skills createSkill(Users user, String skillName) {
        Skills skill = new Skills();
        skill.setUsers(user);
        skill.setSkill_name(skillName);
        return skill;
    }

    private Posts createPost(Users user, String content) {
        Posts post = new Posts();
        post.setUsers(user);
        post.setContent(content);
        post.setPost_date(new Date());
        return post;
    }

    private Comments createComment(Posts post, Users user, String content) {
        Comments comment = new Comments();
        comment.setPosts(post);
        comment.setUser_id(user.getUser_id());
        comment.setContent(content);
        comment.setComment_date(new Date());
        return comment;
    }

    private Likes createLike(Posts post, Users user) {
        Likes like = new Likes();
        like.setPosts(post);
        like.setUser_id(user.getUser_id());
        return like;
    }

    private Shares createShare(Posts post, Users user) {
        Shares share = new Shares();
        share.setPosts(post);
        share.setUser_id(user.getUser_id());
        return share;
    }

    private Groups createGroup(Users user, String groupName, String description, Date createdDate) {
        Groups group = new Groups();
        group.setUsers(user);
        group.setGroup_name(groupName);
        group.setDescription(description);
        group.setCreated_date(createdDate);
        return group;
    }

    private GroupMembers createGroupMember(Users user, Groups group) {
        GroupMembers groupMember = new GroupMembers();
        groupMember.setUsers(user);
        groupMember.setGroups(group);
        return groupMember;
    }
}
