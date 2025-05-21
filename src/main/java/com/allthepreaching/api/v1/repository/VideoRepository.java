package com.allthepreaching.api.v1.repository;


import com.allthepreaching.api.v1.model.VideoCategoryResultModel;
import com.allthepreaching.api.v1.model.VideoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel, Long> {

    @Query("SELECT v FROM VideoModel v ORDER BY v.date DESC")
    Page<VideoModel> findAllOrderByDateDesc(Pageable pageable);

    @Query(value = "SELECT DISTINCT v.vid_category, v.search_category FROM videos v ORDER BY v.vid_category ASC", nativeQuery = true)
    Page<VideoCategoryResultModel> findAllCategories(Pageable pageable);

    @Query(value = "SELECT * FROM videos v WHERE v.vid_category = :vidCategory ORDER BY v.date DESC", nativeQuery = true)
    Page<VideoModel> findAllByVidCategoryContainingOrderByDateDesc(@Param("vidCategory") String vidCategory, Pageable pageable);
}
