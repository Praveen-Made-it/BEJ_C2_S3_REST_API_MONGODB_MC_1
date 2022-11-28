/*
 *Author Name:Praveen Kumar
 *Date: 28-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.controller;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Artist;
import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Track;
import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.service.TrackServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
public class TrackControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private TrackServiceImpl trackService;

    @InjectMocks
    private TrackController trackController;
    private Track track;
    private Artist artist;

    @BeforeEach
    void setUp() {
        artist = new Artist(41, "Artist41");
        track = new Track(41, "Track41", 5, artist);
        mockMvc = MockMvcBuilders.standaloneSetup(trackController).build();
    }
}
