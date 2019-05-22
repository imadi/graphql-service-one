package com.adi.graphqlserviceone.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String id;

    private String name;

    private String bookId;

}
