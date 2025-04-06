package com.wzj.fzdx.services;

import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: fzdx250306
 * @description:
 * @author: WZJ
 * @create: 2025-03-27 08:56
 **/


public interface GoodsService {
    // 添加商品Goods(Goods)
    Integer addGoods(Goods goods);

    // 修改商品Goods(goodsId/Goods)
    Integer alterGoods(Goods goods);
    // 根据id更新goodsName
    Integer updateGoodsNameById(Integer goodsId, String goodsName);
    // 根据id更新goodsCode
    Integer updateGoodsCodeById(Integer goodsId, Integer goodsCode);
    // 根据id更新goodsStockQuantity
    Integer updateGoodsStockQuantityById(Integer goodsId, Integer goodsStockQuantity);
    // 根据id更新goodsPurchasePrice
    Integer updateGoodsPurchasePriceById(Integer goodsId, BigDecimal goodsPurchasePrice);
    // 根据id更新goodsSellingPrice
    Integer updateGoodsSellingPriceById(Integer goodsId, BigDecimal goodsSellingPrice);
    // 根据id更新goodsPictureUrl
    Integer updateGoodsPictureById(Integer goodsId, String goodsPicture);
    //    通过字段修改值
    Integer updateGoodsFieldById(Integer goodsId, String field, String value);


    // 删除商品Goods(goodsId/Goods对象)
    Integer DeleteGoodsById(Integer goodsId);
    Integer DeleteGoodsByGoods(Goods goods);

    // 查询所有Goods()
    List<Goods> findAllGoods();

    // 条件查询Goods(GoodsQo)
    List<Goods> findGoodsByGoodsQo(GoodsQo qo);


}
