package fr.kevin.spotifish.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Album")
public class Album extends SongStorage {

    @ManyToOne
    private User user;

}