# BE-java-ladder

# 과제 진행 방법
1. 본인 이름의 브랜치를 생성한다.
   <img width="952" alt="스크린샷 2024-04-17 오후 9 27 34" src="https://gist.github.com/assets/115435784/027ae948-65a4-45f7-90aa-3e8e4447fa71">


2. 본 레포지토리를 fork한다.
   <img width="1242" alt="스크린샷 2024-04-17 오후 9 26 13" src="https://gist.github.com/assets/115435784/7097eb9b-232f-4aa4-9f6d-20931b695b06">

<img width="969" alt="스크린샷 2024-04-17 오후 9 28 56" src="https://gist.github.com/assets/115435784/fe2980ed-2d3c-447f-acc6-885e271de150">

3. fork 한 레포지토리에서 주차별 브랜치를 생성한다.
   <img width="390" alt="스크린샷 2024-04-17 오후 9 29 50" src="https://gist.github.com/assets/115435784/47730537-fc05-4e6f-b28b-e94d46ea7514">

4. 포크한 레포지토리를 로컬로 클론한다. 
<img width="964" alt="스크린샷 2024-04-17 오후 9 30 25" src="https://gist.github.com/assets/115435784/f2813ded-8252-46ae-ab9f-125d3105d65b">

Project From VCS 선택 후 URL에 복사한 주소 입력.
<img width="794" alt="스크린샷 2024-04-17 오후 9 31 36" src="https://gist.github.com/assets/115435784/fe3f52f7-a332-4122-a9e4-2f89d1b14c66">

5. 업스트림 저장소를 터미널을 통해 등록한다.
```
git remote add -t birdiehyun upstream https://github.com/opencodegyeonggi/BE-java-ladder.git
git remote add -t [업스트림 브랜치명] upstream [업스트림 주소]
```
등록 후 upstream이 등록되었는지 확인한다.

```
git remote -v
```

<img width="833" alt="스크린샷 2024-04-17 오후 9 35 37" src="https://gist.github.com/assets/115435784/b786d6a2-a0fb-4581-9d35-c1ae5bb17bea">

6. 주차별 브랜치를 생성한다.
   <img width="521" alt="스크린샷 2024-04-17 오후 9 37 55" src="https://gist.github.com/assets/115435784/0c01c3f5-61e5-4c27-b94d-b1f95602a311">

7. 주차별 작업 후 커밋, 푸시를 진행한다.
   ![스크린샷 2024-04-18 오전 9 51 53](https://gist.github.com/assets/115435784/36d3f4c9-7036-474e-8114-671bf8199482)

8. 작업이 끝나면 업스트림의 본인 브랜치로 PR 을 생성한다.(origin 주차별 브랜치 -> 업스트림 본인 아이디 브랜치)
   <img width="1129" alt="스크린샷 2024-04-18 오전 9 55 21" src="https://gist.github.com/assets/115435784/666a9cf8-6fac-4469-858a-c30e5bc4879d">

Assignees 는 본인, Reviewers는 birdieHyun과 다른 한 명을 지정한다.

9. 코드 리뷰가 끝나면 merge한다.
   <img width="797" alt="스크린샷 2024-04-18 오전 9 57 51" src="https://gist.github.com/assets/115435784/a00bc687-7b76-4ee2-83cf-cf8771012f67">

10. upstream의 본인 브랜치를 로컬로 pull 받은 후 다음 주차의 브랜치를 생성한 후 과제를 진행한다.
    ![스크린샷 2024-04-18 오전 9 59 30](https://gist.github.com/assets/115435784/e8ffadcb-d45a-43f2-88b9-e242cf6a9237)
