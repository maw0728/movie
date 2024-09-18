package com.example.movie.mapper;

import com.example.movie.dto.response.MovieDetailDtoRes;
import com.example.movie.dto.response.RecommendedMovieListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {

    MovieDetailDtoRes movieDetail( int id, String language);

    List<RecommendedMovieListDto> recommendedMovieList(int id, String language, int page, int size);

    Integer recommendedMovieListTotal(int id, String language);
}
