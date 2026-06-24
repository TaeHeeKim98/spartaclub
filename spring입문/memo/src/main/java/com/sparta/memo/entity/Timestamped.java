package com.sparta.memo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // 자동으로 시간 널어주는 기능
public abstract class Timestamped {

    @CreatedDate //엔티티 객체가 최초로 생성되어서 저장이 될때 시간 저장
    @Column(updatable = false) // 업데이트가 되지않는 옵션
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @LastModifiedDate //변경된 시간 자동 저장
    @Column
    @Temporal(TemporalType.TIMESTAMP) //date type 날짜데이터를 저장할때 사용
    private LocalDateTime modifiedAt;
}