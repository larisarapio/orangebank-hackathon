package com.larissasarapio.orangebank_hackathon.domain.Asset;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
    private int id;
    private String name;
    private AssetEnum type;
    private float currentPrice;
}
