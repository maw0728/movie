package com.example.movie.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "추천 영화 리스트 DTO")
@Getter
@Setter
public class RecommendedMovieListDto {

    @Schema(description = "영화 키값")
    private Integer id;

    @Schema(description = "영화 제목")
    private String title;
}
