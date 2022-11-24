package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.service;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_MC_1.domain.Track;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);

    List<Track> getAllTracks();

    boolean deleteTrack(int trackId);

    List<Track> getAllTracksByRatingGreaterThan4();

    List<Track> getAllTracksByArtistName(String artistName);
}
