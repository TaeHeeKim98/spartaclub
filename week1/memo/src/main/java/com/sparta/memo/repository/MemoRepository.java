package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findAllByOrderByModifiedAtDesc(); //수정된시간이 최근순서대로
    //List<Memo> findAllByUsername(String username); //user의 이름 조건걸어서 가져옴
    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}