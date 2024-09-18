package com.example.movie.utils;

import java.util.Arrays;

public class LanguageUtil {

    // 이곳에서 지금 서비스중인 언어를 추가해주세요
    String[] languageType = {"en","ko"};

    /**
     * <h1>현재 서비스하는 언어확인</h1>
     * 언어코드를 매개변수로 받아서 값이틀리거나 없으면 기본값인 en을 반환
     *
     * @param language  ISO 639-1 2자리 언어코드
     * @return ISO 639-1 2자리 언어코드
     * */
    public String hasServiceLanguage(String language) {
        language = language.toLowerCase();
        boolean isList = Arrays.asList(languageType).contains(language);
        if (isList) {
            return language;
        } else {
            return "en";
        }
    }
}
