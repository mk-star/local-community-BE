# local community

## Git Commit Message Convention

### Commit Message 구조

- 헤더는 필수이며, 범위(scope), 본문(body), 바닥글(footer)은 선택 사항입니다.

```
<type>(<scope>): <subject>          -- 헤더
<BLANK LINE>
<body>                              -- 본문
<BLANK LINE>
<footer>                            -- 바닥글
```

#### 헤더

- type, subject로 구성되어 있습니다.

##### Commit Type

- `type`은 해당 커밋의 성격을 나타내며 아래 중 하나여야 한다.
  | 커밋 유형 | 의미 |
  | --------- | ------------------------------------------------------------ |
  | feat | 새로운 기능 추가 |
  | fix | 버그 수정 |
  | docs | 문서 수정 |
  | style | 코드 formatting, 세미콜론 누락, 코드 자체의 변경이 없는 경우 |
  | refactor | 코드 리팩토링 |
  | test | 테스트 코드, 리팩토링 테스트 코드 추가 |
  | chore | 그 외 기타 수정 ex) .gitignore |
  | comment | 필요한 주석 추가 및 변경 |

#### Subject 규칙

- 제목은 영문 기준 **50자 이내**로 제한
- **첫 글자는 대문자**로 작성, **끝에는 `.`(마침표) 금지**
- **명령문으로 작성, 과거형 금지**
- 이슈 넘버가 있을 경우 기입

#### 본문(body) 규칙

- 본문은 선택사항이며, 최대한 상세히 작성
- **각 행은 72자 이내**로 작성
- 길어질 경우 개행을 통해 입력
- 어떻게 보다는 **무엇과 왜를 설명**
- 글머리 기호도 사용 가능. 하이픈(-), 별표(\*)

#### 꼬리말(footer) 규칙

- 꼬리말은 선택사항이며, 이슈 트래킹을 위해서 사용된다.(commit 후 이슈 종료 가능)
- "유형: #이슈 번호" 형식으로 작성
- 여러 개의 이슈 번호는 쉼표(,)로 구분

관련 내용 - [Github 이슈와 커밋 메시지 연결](https://devport.tistory.com/12)

#### Commit message 예시

```
feat: 카카오 로그인 기능 추가(#1)

소셜 로그인 기능 추가를 위해 카카오 로그인 기능을 추가함

close: #1, #12
```