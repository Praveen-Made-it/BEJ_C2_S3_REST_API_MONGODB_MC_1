/*
 *Author Name:Praveen Kumar
 *Date: 24-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Track {
    @Id
    private int trackId;
    private String trackName;
    private double trackRating;
    private Artist trackArtist;

}
