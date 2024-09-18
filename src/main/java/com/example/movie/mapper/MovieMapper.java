package com.example.movie.mapper;

import com.example.movie.dto.response.MovieDetailDtoRes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MovieMapper {

    MovieDetailDtoRes movieDetail( int id, String language);
}
