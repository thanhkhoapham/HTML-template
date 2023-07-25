package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import server.entity.DonHang;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang, Integer>{

}
