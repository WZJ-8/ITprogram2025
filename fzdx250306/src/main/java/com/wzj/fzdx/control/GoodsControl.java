package com.wzj.fzdx.control;

import com.wzj.fzdx.dto.JsonDto;
import com.wzj.fzdx.pojo.Admin;
import com.wzj.fzdx.pojo.Goods;
import com.wzj.fzdx.pojo.GoodsQo;
import com.wzj.fzdx.services.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.math.BigDecimal;
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

    @PostMapping("updateGoodsCodeById")
    public JsonDto updateGoodsCodeById(HttpServletRequest request, Integer goodsId, Integer goodsCode){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsCodeById(goodsId, goodsCode);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改成功");
        }
        return jsonDto;
    }

    @PostMapping("updateGoodsStockQuantityById")
    public JsonDto updateGoodsStockQuantityById(HttpServletRequest request, Integer goodsId, Integer goodsStockQuantity){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsStockQuantityById(goodsId, goodsStockQuantity);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改成功");
        }
        return jsonDto;
    }

    @PostMapping("updateGoodsPurchasePriceById")
    public JsonDto updateGoodsPurchasePriceById(HttpServletRequest request, Integer goodsId, BigDecimal goodsPurchasePrice){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsPurchasePriceById(goodsId, goodsPurchasePrice);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改成功");
        }
        return jsonDto;
    }

    @PostMapping("updateGoodsSellingPriceById")
    public JsonDto updateGoodsSellingPriceById(HttpServletRequest request, Integer goodsId, BigDecimal goodsSellingPrice){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsPurchasePriceById(goodsId, goodsSellingPrice);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改成功");
        }
        return jsonDto;
    }

    @PostMapping("updateGoodsPictureById")
    public JsonDto updateGoodsPictureById(HttpServletRequest request, Integer goodsId, String goodsPicture){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsPictureById(goodsId, goodsPicture);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改成功");
        }
        return jsonDto;
    }

//    根据字段修改商品
//    @PathVariable("/{example}")路径变量，设置路径变量动态选择请求url的路径
    @PostMapping("updateGoodsFieldById")
    public JsonDto updateGoodsFieldById(HttpServletRequest request,
                                        Integer goodsId,
                                        String field,
                                        String value){
        JsonDto jsonDto = new JsonDto();
        Integer i = goodsService.updateGoodsFieldById(goodsId, field, value);
        if (i > 0){
            jsonDto.setId(i);
            jsonDto.setMessage("修改字段"+ field +"成功");
        }
        return jsonDto;
    }

}
