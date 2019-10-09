package ieti.trello.backend.trello.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
    private String name;
    private String email;
    private String userName;
    private String initials;
    private String password;
    private List<Dashboard> dashboards = new ArrayList<>();
    private List<Team> teams = new ArrayList<>();
}