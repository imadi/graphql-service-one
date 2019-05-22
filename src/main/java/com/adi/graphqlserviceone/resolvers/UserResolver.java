package com.adi.graphqlserviceone.resolvers;

import com.adi.graphqlserviceone.models.User;
import com.adi.graphqlserviceone.repository.UserRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResolver implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;


    public List<User> users() {
        return userRepository.getUserList();
    }

    public User userById(String id) {
        return userRepository.getUser(id);
    }

}
