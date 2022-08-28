# 0827

JPA의 모든 데이터 변경은 트랜잭션 안에서 실행<br>

도메인 설정시<br>
DB에 테이블 이름과 domain이 다르면 @Table 어노테이션에 명시<br>
Table 컬럼명이 다르면 @Column(name = "test")으로 명시

영속성 컨텍스트 : 엔티티를 영구 저장하는 환경<br>
1차 캐시 : 동일한 트랜잭션 안에서 같은 쿼리를 사용했을때 DB에 쿼리가 안날라감 (성능상 중요하진 않음)
플러시 : 영속성 컨텍스트의 변경내용을 즉시 DB에 반영<br>

# 0828
엔티티 매핑<br>
객체와 테이블 매핑 : @Entity, @Table<br>
필드와 컬럼 매핑 : @Column<br>
기본키 매핑 : @Id<br>
연관관계 매핑 : @ManyToOne, @JoinColumn<br>
