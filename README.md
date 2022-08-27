# 0827

JPA 주의<br>
JPA의 모든 데이터 변경은 트랜잭션 안에서 실행<br>

도메인 설정시<br>
DB에 테이블 이름과 domain이 다르면 @Table 어노테이션에 명시<br>
Table 컬럼명이 다르면 @Column(name = "test")으로 명시
