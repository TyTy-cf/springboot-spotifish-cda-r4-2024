package fr.kevin.spotifish.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Playlist")
public class Playlist extends SongStorage {

    @ManyToOne
    private User user;

}