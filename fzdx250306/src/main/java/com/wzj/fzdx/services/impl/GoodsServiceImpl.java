package com.wzj.fzdx.services.impl;

import com.wzj.fzdx.mapper.GoodsMapper;
import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;
import com.wzj.fzdx.services.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
