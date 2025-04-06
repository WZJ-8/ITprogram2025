package com.wzj.fzdx.services.impl;

import com.wzj.fzdx.mapper.GoodsMapper;
import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;
import com.wzj.fzdx.services.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @program: fzdx250306
 * @description:
 * @author: WZJ
 * @create: 2025-03-27 09:05
 **/


@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsMapper goodsMapper;

    @Override
    public Integer addGoods(Goods goods) {
        Integer ret = goodsMapper.insertByGoods(goods);
        return ret;
    }

    @Override
    public Integer alterGoods(Goods goods) {
        return null;
    }

    @Override
    public Integer updateGoodsNameById(Integer goodsId, String goodsName) {
        Integer ret = goodsMapper.updateGoodsNameById(goodsId, goodsName);
        return ret;
    }

    @Override
    public Integer updateGoodsCodeById(Integer goodsId, Integer goodsCode) {
        Integer ret = goodsMapper.updateGoodsCodeById(goodsId, goodsCode);
        return ret;
    }

    @Override
    public Integer updateGoodsStockQuantityById(Integer goodsId, Integer goodsStockQuantity) {
        Integer ret = goodsMapper.updateGoodsStockQuantityById(goodsId, goodsStockQuantity);
        return ret;
    }

    @Override
    public Integer updateGoodsPurchasePriceById(Integer goodsId, BigDecimal goodsPurchasePrice) {
        Integer ret = goodsMapper.updateGoodsPurchasePriceById(goodsId, goodsPurchasePrice);
        return ret;
    }

    @Override
    public Integer updateGoodsSellingPriceById(Integer goodsId, BigDecimal goodsSellingPrice) {
        Integer ret = goodsMapper.updateGoodsSellingPriceById(goodsId,goodsSellingPrice);
        return ret;
    }

    @Override
    public Integer updateGoodsPictureById(Integer goodsId, String goodsPicture) {
        Integer ret = goodsMapper.updateGoodsPictureById(goodsId,goodsPicture);
        return ret;
    }

    @Override
    public Integer updateGoodsFieldById(Integer goodsId, String field, String value) {
        return goodsMapper.updateGoodsFieldById(goodsId, field, value);
    }

    @Override
    public Integer DeleteGoodsById(Integer goodsId) {
        Integer ret = goodsMapper.deleteGoodsById(goodsId);
        return ret;
    }

    @Override
    public Integer DeleteGoodsByGoods(Goods goods) {

        return null;
    }

    @Override
    public List<Goods> findAllGoods() {
        List<Goods> allGoods = goodsMapper.findAllGoods();
        return allGoods;
    }

    @Override
    public List<Goods> findGoodsByGoodsQo(GoodsQo qo) {
        List<Goods> goodsList = goodsMapper.selectGoodsByCondition(qo);
        return goodsList;
    }


}
