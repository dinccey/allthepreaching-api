package com.allthepreaching.api.v1.repository;


import com.allthepreaching.api.v1.model.VideoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel, Long> {

    @Query("SELECT v FROM VideoModel v ORDER BY v.date DESC")
    Page<VideoModel> findAllOrderByDateDesc(Pageable pageable);

    @Query("SELECT DISTINCT v.vidCategory FROM VideoModel v ORDER BY v.vidCategory ASC")
    Page<String> findAllCategories(Pageable pageable);

    @Query("SELECT DISTINCT v.vidPreacher FROM VideoModel v ORDER BY v.vidPreacher ASC")
    Page<String> findAllPreachers(Pageable pageable);

    @Query("SELECT v FROM VideoModel v WHERE v.vidPreacher LIKE :vidPreacher ORDER BY v.date DESC")
    Page<VideoModel> findAllByVidPreacherContainingOrderByDateDesc(@Param("vidPreacher") String vidPreacher, Pageable pageable);
}
