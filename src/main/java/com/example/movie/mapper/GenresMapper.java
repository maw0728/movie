package com.example.movie.mapper;

import com.example.movie.dto.response.GenresDtoRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GenresMapper {

    /**
     * 장르 리스트를 반환합니다.
     *
     * @param language  사용언어 default - en 반환
     *
     * @return 장르모음
     *
     * */
    List<GenresDtoRes> genresList(String language);
}
