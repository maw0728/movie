package com.example.movie.dto.response;

import com.example.movie.dto.common.Pagination;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Schema(description = "추천 영화 응답 DTO")
@Getter
@Setter
public class RecommendedMovieListDtoRes extends Pagination {
    List<RecommendedMovieListDto> results;
}
