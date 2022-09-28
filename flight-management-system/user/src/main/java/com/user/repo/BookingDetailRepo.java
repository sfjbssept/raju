package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.BookingDetail;

@Repository
public interface BookingDetailRepo extends JpaRepository<BookingDetail, Integer> {

}
