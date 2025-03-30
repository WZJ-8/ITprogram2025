package com.wzj.fzdx.control;

import com.wzj.fzdx.dto.JsonDto;
import com.wzj.fzdx.pojo.Admin;
import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;
import com.wzj.fzdx.services.GoodsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: fzdx250306
 * @description:
 * @author: WZJ
 * @create: 2025-03-27 09:25
 **/

@RestController
public class GoodsControl {
    @Resource
    GoodsService goodsService;

    @PostMapping("/addGoods")
    public JsonDto addGoodsByGoods(HttpServletRequest request, Goods goods){
        JsonDto jsonDto = new JsonDto();
            Integer i = goodsService.addGoods(goods);
            if (i > 0){
                jsonDto.setId(i);
                jsonDto.setMessage("添加成功");
            }
        return jsonDto;
    }

    @PostMapping("/findAllGoods")
    public JsonDto findAllGoods(HttpServletRequest request){
        JsonDto jsonDto = new JsonDto();
        try{
            List<Goods> goodsList = goodsService.findAllGoods();
            jsonDto.getData().put("goodsList", goodsList);
        } catch(Exception e){
            e.printStackTrace();
        }
        return jsonDto;
    }

    @PostMapping("/deleteGoodsById")
    public JsonDto deleteGoodsById (HttpServletRequest request, Integer id){
        JsonDto jsonDto = new JsonDto();
        try{
            Integer i = goodsService.DeleteGoodsById(id);
            jsonDto.setId(i);
            jsonDto.setMessage("删除成功");
        } catch(Exception e){
            e.printStackTrace();
        }
        return jsonDto;
    }

    @PostMapping("/deleteGoodsByGoods")
    public JsonDto deleteGoodsById (HttpServletRequest request, Goods goods){

        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.DeleteGoodsByGoods(goods);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("删除成功");
        }
        return jsonDto;

    }

    @PostMapping("/findGoods")
    public JsonDto deleteGoodsById (HttpServletRequest request, GoodsQo goodsQo){
        JsonDto jsonDto = new JsonDto();
        try{
            List<Goods> goodsList = goodsService.findGoodsByGoodsQo(goodsQo);
            jsonDto.getData().put("goodsList", goodsList);
        } catch(Exception e){
            e.printStackTrace();
        }
        return jsonDto;
    }

    @PostMapping("updateGoodsNameById")
    public JsonDto updateGoodsNameById(HttpServletRequest request, Integer goodsId, String goodsName){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsNameById(goodsId, goodsName);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改成功");
        }
        return jsonDto;
    }

}
