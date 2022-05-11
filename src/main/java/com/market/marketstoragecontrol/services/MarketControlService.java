package com.market.marketstoragecontrol.services;

import javax.transaction.Transactional;

import com.market.marketstoragecontrol.models.MarketControlModel;
import com.market.marketstoragecontrol.repositories.MarketControlRepository;

import org.springframework.stereotype.Service;

// ponto de intermediação entre o service e o repositoy, antes de salvar os dados no banco.

@Service
public class MarketControlService {
    final MarketControlRepository marketControlRepository;

    public MarketControlService(MarketControlRepository marketControlRepository) {
        this.marketControlRepository = marketControlRepository;
    }
    @Transactional
    public static MarketControlModel save(MarketControlModel marketControlModel) {
        return marketControlModel.save(marketControlModel);
    }
}
