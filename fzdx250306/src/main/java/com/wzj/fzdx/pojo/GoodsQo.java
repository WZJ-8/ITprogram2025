package com.wzj.fzdx.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Range;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: fzdx250306
 * @description:
 * @author: WZJ
 * @create: 2025-03-27 09:00
 **/

@Data
public class GoodsQo {
    Integer goodsId;
    String goodsName;


    Integer goodsCodeMin;
    Integer goodsCodeMax;

    BigDecimal goodsPurchasePriceMin;
    BigDecimal goodsPurchasePriceMax;
    BigDecimal goodsSellingPriceMin;
    BigDecimal goodsSellingPriceMax;

    Integer goodsStockQuantity;
    String goodsPicture;
    Integer goodsState;

    // 分页
    private Integer start;
    private Integer limit;

}


