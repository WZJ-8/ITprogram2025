package com.wzj.fzdx.services;

import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;

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
    Integer updateGoodsNameById(Integer goodsId, String goodsName);
    // 删除商品Goods(goodsId/Goods对象)
    Integer DeleteGoodsById(Integer goodsId);
    Integer DeleteGoodsByGoods(Goods goods);
    // 查询所有Goods()
    List<Goods> findAllGoods();

    // 条件查询Goods(GoodsQo)
    List<Goods> findGoodsByGoodsQo(GoodsQo qo);
}
