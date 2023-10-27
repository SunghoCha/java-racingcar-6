1. Car VO 객체 ( CarName VO, Position VO 포함)
2. Cars 일급 컬렉션, move() 메서드 구현
3. CarFactory 구현
3. RacingGame 객체 구현, race() 메서드 구현
4. InputView 구현, 입력값 받는 메서드 구현

*race 결과 출력부분에 CarName과 Position 정보 필요한데 값을 얻어오는 방식이 애매할 수 있음
RacingGame에서 요청보내면 Cars가 자신의 CarList의 Car들에게 정보요청하면 Car가 자신의 CarName과 Position에서 getter로 값 가져오는 방식?
요청을 보내는 내용이 상태를 이용한 계산이 아니고 단순히 상태를 요구하는거라 getter와 차이가 없는데 이름만 다르게 한다고 그게 무슨 의미가 있는지 모르겠음...