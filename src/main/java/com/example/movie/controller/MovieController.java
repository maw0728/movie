package com.example.movie.controller;

import com.example.movie.dto.response.MovieDetailDtoRes;
import com.example.movie.service.MovieService;
import com.example.movie.utils.LanguageUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "영화", description = "영화 API를 제공합니다")
@RequiredArgsConstructor
@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @GetMapping(value = "/detail/{id}")
    @Operation(summary = "영화 상세 조회",description = "영화의 기본키를 기반으로 한다 언어의 기본값 en")
    public MovieDetailDtoRes getMovieDetail(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "en") String language) {
        LanguageUtil languageUtil = new LanguageUtil();
        return movieService.movieDetail(id, languageUtil.hasServiceLanguage(language));
    }
}
