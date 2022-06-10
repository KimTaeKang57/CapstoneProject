# 🔍 Cellification 🔎 (인공지능을 활용한 세포 계수 분석 서비스)
2022년 1학기 경기대학교 캡스톤 백엔드 개발 😎

# 주제 선정 및 개요
기업 솔이 제안한 인공지능을 활용한 세포 계수 분석 앱 혹은 애플리케이션을 제작해달라는 산합협력 주제를 캡스톤 팀 주제로 선정하여 개발을 진행하였습니다. 살아있는 세포와 죽어있는 세포가 이리저리 퍼져있는 사진을 업로드하면, Cellification이 살아있는 세포와 죽어있는 세포를 딥러닝 기반의 인공지능으로 구분하여 살아있는 세포와 죽어있는 세포의 계수와 비율을 결과로 알려줍니다.

# 팀원
| 팀원 | 역할 | 개발환경 
|-----|-----|--------
|조수빈(PM), 김태강| 백엔드 | Spring frameworks, AWS s3, Naver Cloud Platform, Flask
|김민종, 박준후| 안드로이드 | 안드로이드 애플리케이션 (Kotlin)
|한동현| Object Detection | YoLo, torch

# 애플리케이션 구성
01. Welcome, 로그인/회원가입
<img width="389" alt="스크린샷 2022-06-10 오후 12 56 24" src="https://user-images.githubusercontent.com/83891837/172987304-a9885c07-b101-45fa-bb5c-11e3e2a56cd9.png">

02. 이미지 업로드, 분석결과
<img width="132" alt="스크린샷 2022-06-10 오후 12 57 02" src="https://user-images.githubusercontent.com/83891837/172987368-b42e5d5a-f13b-4dd0-ba0b-7bb407990e72.png">
<img width="384" alt="스크린샷 2022-06-10 오후 12 57 13" src="https://user-images.githubusercontent.com/83891837/172987389-96dfb51b-0238-44c7-9aa5-450ecadc42ef.png">

03. DB, 내부 저장소에서 결과 관리
<img width="128" alt="스크린샷 2022-06-10 오후 12 57 43" src="https://user-images.githubusercontent.com/83891837/172987444-525eca7a-4018-4c99-a438-673ce36567a4.png">

# 기술 스택
<img width="669" alt="스크린샷 2022-06-10 오후 12 59 39" src="https://user-images.githubusercontent.com/83891837/172987671-2653a723-5da7-472e-8c38-8795e2124369.png">
