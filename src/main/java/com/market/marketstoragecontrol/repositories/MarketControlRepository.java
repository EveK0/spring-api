package com.market.marketstoragecontrol.repositories;

import java.util.UUID;

import com.market.marketstoragecontrol.models.MarketControlModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketControlRepository extends JpaRepository<MarketControlModel, UUID> {

}
