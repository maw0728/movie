package com.example.movie.service;

import com.example.movie.dto.response.GenresDtoRes;
import com.example.movie.mapper.GenresMapper;
import com.example.movie.utils.LanguageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenresService {

    private final GenresMapper genresMapper;

    public List<GenresDtoRes> genresList(String language) {
        LanguageUtil languageUtil1 = new LanguageUtil();
        return genresMapper.genresList(languageUtil1.hasServiceLanguage(language));
    }
}
