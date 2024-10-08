package com.example.movie.service;

import com.example.movie.dto.response.GenresDtoRes;
import com.example.movie.mapper.GenresMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenresService {

    private final GenresMapper genresMapper;

    public List<GenresDtoRes> genresList(String language) {
        return genresMapper.genresList(language);
    }
}
