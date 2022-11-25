/*
 *Author Name:Praveen Kumar
 *Date: 25-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.repository;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Artist;
import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Track;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataMongoTest
public class TrackRepositoryTest {

    @Autowired
    private TrackRepository trackRepository;
    private Artist artist;
    private Track track;

    @BeforeEach
    void setUp() {
        artist = new Artist(1, "Arun");
        track = new Track(1, "donu", 7, artist);
    }

    @AfterEach
    void tearDown() {
        artist = null;
        track = null;

    }

    @Test
    // Test case for retrieving all the track by Artist Name success
    public void getTrackByArtistNameSuccess() {
        artist = new Artist(2, "Neha");
        track = new Track(2, "Kala Chashma", 8, artist);
        trackRepository.insert(track);
        List<Track> tracks = trackRepository.findAllTracksFromArtistName(track.getTrackArtist().getArtistName());
        assertEquals(1, tracks.size());
        assertEquals(track.getTrackArtist().getArtistName(), tracks.get(0).getTrackArtist().getArtistName());
    }
}


