package com.example.movie.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Schema(description = "영화 상세 응답 DTO")
@Getter
@Setter
public class MovieDetailDtoRes {

    @Schema(description = "영화 키값")
    private Integer id;

    @Schema(description = "성인인가 true면 성인")
    private Boolean adult;

    @Schema(description = "성인여부")
    private Long budget;

    @Schema(description = "장르 리스트")
    private List<GenresDtoRes> genres;

    @Schema(description = "공식 홈페이지 주소")
    private String homepage;

    @Schema(description = "원래 제목")
    private String originalTitle;

    @Schema(description = "제작 언어")
    private String originalLanguage;

    @Schema(description = "제작 국가")
    private String originCountry;

    @Schema(description = "설명")
    private String overview;

    @Schema(description = "개봉일")
    private LocalDate releaseDate;

    @Schema(description = "영화의 총수익")
    private Long revenue;

    @Schema(description = "상영시간 (분)")
    private Integer runtime;

    @Schema(description = "영화제목")
    private String title;

    @Schema(description = "영화개봉여부 0:미개봉 1:개봉")
    private Integer status;

}