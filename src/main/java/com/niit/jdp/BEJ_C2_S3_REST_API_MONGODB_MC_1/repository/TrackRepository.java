package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.repository;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track, Integer> {

    @Query("{'trackRating':{$gt:4}}")
    List<Track> findAllTracksFromRating();

    @Query("{'trackArtist.artistName':{$in:[?0]}}")
    List<Track> findAllTracksFromArtistName(String artistName);
}
