#  방탈출 예약 대기

## 3단계 기능 구현 목록
- [ ] 예약 대기 요청 기능
  - [ ] 예약이 존재할 경우 예약 대기로 요청된다.
  - [ ] 예약 대기는 중복이 가능하다.
  - [ ] 예약이 없으면 예약 대기는 예약이 된다.
- [ ] 예약 대기 취소 기능
- [ ] 내 예약 목록 조회 시 예약 대기 목록도 함께 포함
- [ ] 중복 예약 불가능
- [ ] 내 예약 목록의 예약 대기 상태에 몇 번째 대기인지 표시


## 1-2단계 기능 구현 목록

- [x] 내 예약 목록을 조회하는 API
  - [x] 예약의 상태를 조회할 수 있다 ex) `예약`
  - [x] 현재 날짜를 포함하여 이후의 예약을 조회한다. 
  - [x] 내 예약은 최신순으로 조회한다.

## API
- 내 예약 목록 조회 : GET `/reservations-mine`
- 예약 대기 요청 : POST `/reservations?status=WAIT`
  - body = {date : '2024-05-20' themeId : 1 timeId : 1}
