package cn.wzvtcsoft.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BaseRepository<T> extends JpaRepository<T, Long>, PagingAndSortingRepository<T,Long> {
}
