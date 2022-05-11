package com.market.marketstoragecontrol.controllers;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import com.market.marketstoragecontrol.dtos.MarketControlDto;
import com.market.marketstoragecontrol.models.MarketControlModel;
import com.market.marketstoragecontrol.services.MarketControlService;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3000)
@RequestMapping("/market-storage-control")

public class MarketControlController {
    final MarketControlService marketControlService;

    public MarketControlController(MarketControlService marketControlService) {
        this.marketControlService = marketControlService;
    }

    @PostMapping
    public ResponseEntity<Object> saveMarketControl(@RequestBody @Valid MarketControlDto marketControlDto) {
        var marketControlModel = new MarketControlModel();
        BeanUtils.copyProperties(marketControlDto, marketControlModel);
        marketControlModel.setRegisterDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(MarketControlService.save(marketControlModel));
    }

}
