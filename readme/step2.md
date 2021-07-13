# 2주차
<a id="githubGuide"></a>## 깃허브 사용 법

### 1. code-with-me 프로젝트를 내 깃허브 저장소로 Fork 한다.
![fork](https://user-images.githubusercontent.com/33652399/125388992-79753700-e3db-11eb-8c77-0a8b3bd97b59.jpg)

![스크린샷 2021-07-13 오후 12 47 52](https://user-images.githubusercontent.com/33652399/125387361-b8ee5400-e3d8-11eb-99a6-c10e760869d7.png)

https://github.com/gbeea1004/code-with-me

### 2. 내 저장소에 만들어진 code-with-me 프로젝트를 내 PC로 가져온다.
![스크린샷 2021-07-13 오후 12 51 06](https://user-images.githubusercontent.com/33652399/125387532-0bc80b80-e3d9-11eb-851c-d015d73ddd8f.png)

GitBash 에 접속해서 복사할 곳으로 이동한 후
```
cd D:
cd study
```
위 프로젝트 경로를 복사해서 입력한다.
```
git clone '복사한 URL'
ex) git clone https://github.com/SUNGJUNGHOON/code-with-me.git
```

### 3. PC로 가져온 프로젝트를 인텔리제이로 열어준다.

### 4. 인텔리제이로 수정한 코드를 내 깃허브 저장소로 반영한다.
![push](https://user-images.githubusercontent.com/33652399/125389800-bdb50700-e3dc-11eb-8d96-bde874d796a5.jpg)

```
git add . (변화가 있는 모든 파일 반영)
git commit -m "first commit" (커밋)
git push origin master (origin 저장소의 master 브랜치에 반영)
```

### 5. 내 깃허브 저장소 코드를 원격 저장소 (upstream) 로 반영한다.
![upstream](https://user-images.githubusercontent.com/33652399/125390875-80ea0f80-e3de-11eb-8541-f5c27652adb2.jpg)

### 6. upstream 저장소 리뷰어가 코드 확인 후 merge (내가 하는 작업 아님)
upstream 저장소는 origin 저장소와는 다르게 리뷰어가 코드를 확인하고 merge 해야 upstream 에 코드가 반영된다.

### 참고
[코드스쿼드 깃허브 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md)
