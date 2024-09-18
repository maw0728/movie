package com.example.movie.service;

import com.example.movie.dto.response.MovieDetailDtoRes;
import com.example.movie.dto.response.RecommendedMovieListDto;
import com.example.movie.dto.response.RecommendedMovieListDtoRes;
import com.example.movie.mapper.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieMapper movieMapper;

    public MovieDetailDtoRes movieDetail(int movieId, String language) {
        return movieMapper.movieDetail(movieId, language);
    }

    /*
    *
    * */
    public RecommendedMovieListDtoRes recommendedMovieList(int id, String language, int page, int size) {

        List<RecommendedMovieListDto> recommendedMovieListDto = movieMapper.recommendedMovieList(id, language, size, (page-1)*size);

        // 총 페이지 갯수를 기준으로 페이지를 계산
        Integer total = movieMapper.recommendedMovieListTotal(id, language);
        if (total % size == 0) {
            total = total / size; //정확이 떨어지는 경우 그냥 나눈다
        } else {
            total = total / size + 1;
        }

        RecommendedMovieListDtoRes recommendedMovieListDtoRes = new RecommendedMovieListDtoRes();
        recommendedMovieListDtoRes.setResults(recommendedMovieListDto);
        recommendedMovieListDtoRes.setPage(page);
        recommendedMovieListDtoRes.setSize(size);
        recommendedMovieListDtoRes.setTotalPages(total);

        return recommendedMovieListDtoRes;
    }
}
