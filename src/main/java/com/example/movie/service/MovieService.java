package com.example.movie.service;

import com.example.movie.dto.response.MovieDetailDtoRes;
import com.example.movie.mapper.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieMapper movieMapper;

    public MovieDetailDtoRes movieDetail(int movieId, String language) {
        return movieMapper.movieDetail(movieId, language);
    }
}
