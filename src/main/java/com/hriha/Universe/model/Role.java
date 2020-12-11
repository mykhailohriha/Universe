package com.hriha.Universe.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<User> users;
}
