package com.example.movie.controller;

import com.example.movie.dto.response.GenresDtoRes;
import com.example.movie.service.GenresService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "장르", description = "장르관련 API를 제공합니다")
@RequiredArgsConstructor
@RestController
@RequestMapping("/genre")
public class GenresController {

    private final GenresService genresService;

    @Operation(summary = "장르리스트 조회",description = "아무값도 없으면 기본으로 영어로 조회함")
    @GetMapping("/list")
    public List<GenresDtoRes> getGenres(@RequestParam(required = false, defaultValue = "en") String language) {
        return genresService.genresList(language);
    }
}
