package com.wzj.fzdx.mapper;

import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: fzdx250306
 * @description:
 * @author: WZJ
 * @create: 2025-03-27 09:08
 **/
public interface GoodsMapper {
    Integer insertByGoods(@Param("goods") Goods goods);

    List<Goods> findAllGoods();

    Integer deleteGoodsById(@Param("id") Integer id);
    Integer deleteGoodsByGoods(@Param("goods") Goods goods);
    List<Goods> selectGoodsByCondition(@Param("qo")GoodsQo goodsQo);

    Integer updateGoodsNameById(@Param("goodsId") Integer goodsId, @Param("goodsName") String goodsName);
    // 根据id更新goodsCode
    Integer updateGoodsCodeById(@Param("goodsId") Integer goodsId, @Param("goodsCode") Integer goodsCode);
    // 根据id更新goodsStockQuantity
    Integer updateGoodsStockQuantityById(@Param("goodsId") Integer goodsId, @Param("goodsStockQuantity") Integer goodsStockQuantity);
    // 根据id更新goodsPurchasePrice
    Integer updateGoodsPurchasePriceById(@Param("goodsId") Integer goodsId, @Param("goodsPurchasePrice") BigDecimal goodsPurchasePrice);
    // 根据id更新goodsSellingPrice
    Integer updateGoodsSellingPriceById(@Param("goodsId") Integer goodsId, @Param("goodsSellingPrice") BigDecimal goodsSellingPrice);
    // 根据id更新goodsPictureUrl
    Integer updateGoodsPictureById(@Param("goodsId") Integer goodsId, @Param("goodsPicture") String goodsPicture);

    // 根据字段更新goods值
    Integer updateGoodsFieldById(@Param("goodsId") Integer goodsId,@Param("field") String field,@Param("value") String value);
}
