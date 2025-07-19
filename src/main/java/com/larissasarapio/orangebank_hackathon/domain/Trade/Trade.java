package com.larissasarapio.orangebank_hackathon.domain.Trade;

import com.larissasarapio.orangebank_hackathon.domain.Asset.Asset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trade {
    private Asset asset;
    private int quantity;
    private float totalValue;
    private TradeEnum operationType;
    private float tax;
    private Date datetime;
}
