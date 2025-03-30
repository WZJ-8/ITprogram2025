package com.wzj.fzdx.mapper;

import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;
import org.apache.ibatis.annotations.Param;

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

}
