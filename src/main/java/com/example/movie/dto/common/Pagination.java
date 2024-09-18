package com.example.movie.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "페이지네이션 DTO")
@Getter
@Setter
public class Pagination {

    @Schema(description = "한페이지에 보여줄 갯수")
    private int size;

    @Schema(description = "현재 페이지")
    private int page;

    @Schema(description = "총 페이지")
    private int totalPages;
}
