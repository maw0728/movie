# movies api

## 폴더 구조
```sh
└─movie
    ├─config
    ├─controller
    ├─dto
    │  ├─request
    │  └─response
    ├─mapper
    ├─service
    └─utils
```

## 코딩 컨벤션

### 공통
- 왠만하면 도메인으로 분리하여 사용
- 간단한 로직은 주석을 생략한다

### config
- 접미사로 Config

### controller
- 접미사로 Controller
- Swagger 관련 어노테이션은 항상 최상위에 작성

### service
- 접미사로 Service

### mapper
- 접미사로 Mapper
- 인터페이스로만 생성한다

### dto
- 기능 + Dto + 접미사
- 접미사 리스트
  - Res: response
  - Req: request

### utils
- 접미사로 Util


## 추가 하고 싶은 기능
- 공통 request, response
- 공통 status
- 로그인, 회원가입