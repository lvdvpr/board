package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {  // Generic으로 어떤 엔터티를 넣을건지, pk 컬럼의 타입을 넣어준다.

    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
}
