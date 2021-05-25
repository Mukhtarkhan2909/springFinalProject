package com.example.springfinalproject.entity;

import com.example.springfinalproject.service.UserService;
import lombok.*;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Users users;

    public void setUsers(Long id) {
        UserService userService = new UserService();
        this.users = userService.getUserById(id).get();
    }
}
