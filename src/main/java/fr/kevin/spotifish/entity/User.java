package fr.kevin.spotifish.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;

    private String password;

    private String username;

    private String birthedAt;

    @ManyToMany
    private List<Role> roles = new ArrayList<>();

}