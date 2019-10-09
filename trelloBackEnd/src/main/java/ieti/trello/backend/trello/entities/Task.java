package ieti.trello.backend.trello.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task{
    private List<User> members = new ArrayList<>();
    private List<Comment> comments  = new ArrayList<>();
    private State state; 
    private Label label;
    private Date expirationDate;
    private String name;
    private String description;
    private String id;
}