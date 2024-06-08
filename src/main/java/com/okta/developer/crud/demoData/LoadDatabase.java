/*
package com.okta.developer.crud.demoData;

import com.okta.developer.crud.model.*;
import com.okta.developer.crud.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Date;
import java.util.List;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository,
                                   EducationRepository educationRepository,
                                   ExperienceRepository experienceRepository,
                                   SkillRepository skillRepository,
                                   ProfileRepository profileRepository,
                                   ConnectionRepository connectionRepository,
                                   PostRepository postRepository,
                                   CommentRepository commentRepository,
                                   LikeRepository likeRepository,
                                   ShareRepository shareRepository,
                                   GroupRepository groupRepository,
                                   GroupMemberRepository groupMemberRepository) {
        return args -> {
            // Create Users
            User user1 = new User();
            user1.setName("John Doe");
            user1.setEmail("john.doe@example.com");
            user1.setPassword("password");
            user1.setLocation("New York");
            user1.setJoinDate(new Date());

            User user2 = new User();
            user2.setName("Jane Smith");
            user2.setEmail("jane.smith@example.com");
            user2.setPassword("password");
            user2.setLocation("Los Angeles");
            user2.setJoinDate(new Date());

            userRepository.saveAll(List.of(user1, user2));

            // Create Education
            Education education1 = new Education();
            education1.setUser(user1);
            education1.setSchool("Harvard University");
            education1.setDegree("B.Sc.");
            education1.setFieldOfStudy("Computer Science");
            education1.setStartDate(new Date());
            education1.setEndDate(new Date());

            educationRepository.save(education1);

            // Create Experience
            Experience experience1 = new Experience();
            experience1.setUser(user1);
            experience1.setCompanyName("Tech Corp");
            experience1.setTitle("Software Engineer");
            experience1.setLocation("San Francisco");
            experience1.setStartDate(new Date());
            experience1.setEndDate(new Date());

            experienceRepository.save(experience1);

            // Create Skill
            Skill skill1 = new Skill();
            skill1.setUser(user1);
            skill1.setSkillName("Java");

            skillRepository.save(skill1);

            // Create Profile
            Profile profile1 = new Profile();
            profile1.setUser(user1);
            profile1.setHeadline("Software Developer");
            profile1.setSummary("Experienced software developer specializing in Java and Spring Boot.");
            profile1.setIndustry("Technology");
            profile1.setLocation("New York");
            profile1.setConnections(500);

            profileRepository.save(profile1);

            // Create Connection
            Connection connection1 = new Connection();
            connection1.setUser(user1);
            connection1.setConnectedUser(user2);
            connection1.setConnectionStatus("Connected");

            connectionRepository.save(connection1);

            // Create Post
            Post post1 = new Post();
            post1.setUser(user1);
            post1.setContent("Hello World!");
            post1.setPostDate(new Date());

            postRepository.save(post1);

            // Create Comment
            Comment comment1 = new Comment();
            comment1.setPost(post1);
            comment1.setUser(user2);
            comment1.setContent("Welcome to the platform!");
            comment1.setCommentDate(new Date());

            commentRepository.save(comment1);

            // Create Like
            UserLike like1 = new UserLike();
            like1.setPost(post1);
            like1.setUser(user2);

            likeRepository.save(like1);

            // Create Share
            Share share1 = new Share();
            share1.setPost(post1);
            share1.setUser(user2);
            share1.setShareDate(new Date());

            shareRepository.save(share1);

            // Create Group
            UserGroup group1 = new UserGroup();
            group1.setGroupName("Developers Group");
            group1.setDescription("A group for software developers");
            group1.setCreatedDate(new Date());

            groupRepository.save(group1);

            // Create Group Member
            GroupMember groupMember1 = new GroupMember();
            groupMember1.setGroup(group1);
            groupMember1.setUser(user1);

            groupMemberRepository.save(groupMember1);
        };
    }
}
*/
