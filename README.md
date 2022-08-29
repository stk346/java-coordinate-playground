## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
----
- [ ] 선 길이 구하는 기능 구현  
  - Point 만들기 (좌표 24이하 밸리대이션)
  - Points 일급 컬렉션 만들기 (List\<Points>\, x, y 순으로 정렬하는 생성자 구현해야함)
  - Points를 생성자로 갖는 Line 만들기
- [ ] 사각형 면적 구하는 기능 구현
  - 생성자에서 사다리꼴, 마름모 제외한 직사각형만 허용하는 기능 구현
  - AB, AC 라인 길이 구한 후 넓이 구하는 기능 구현
- [ ] 삼각형 면적 구하는 기능 구현
  - AB AC CA 라인 길이 구해서 면적 구하는 기능 구현
- [ ] 밸리데이션
  - 좌표는 두개 이상, 4개 이하이어야 함
  - 좌표는 숫자로 이루어져 있어야함
- [ ] 각 도형을 묶는 상위 인터페이스(Figure) 만들기
  - Figure를 활용해 FigureFactory 기능 구현 (if문 사용x)
  - Figure를 생성해주는 FigureCreator 기능 구현

---
feat (feature)  
fix (bug fix)  
docs (documentation)  
style (formatting, missing semi colons, …)  
refactor  
test (when adding missing tests)  
chore (maintain)  