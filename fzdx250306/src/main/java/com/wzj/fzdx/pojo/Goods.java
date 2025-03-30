package com.wzj.fzdx.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Integer GoodsCode;
    private Integer goodsStockQuantity;
    private BigDecimal goodsPurchasePrice;
    private BigDecimal goodsSellingPrice;
    private String goodsPicture;
    private Integer goodsState;
}
