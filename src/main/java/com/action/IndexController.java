package com.action;

import java.util.*;

import com.alibaba.fastjson.JSON;
import com.entity.*;
import com.service.*;
import com.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Value("${spring.datasource.url}")
    private String url;

    @Autowired
    private IProductkindService pks;
    @Autowired
    private IProductinfoService pis;
    @Autowired
    private IProductseriesService pss;
    @Autowired
    private IGdvCarService gcs;
    @Autowired
    private RedisClient redisClient;

    @RequestMapping(value="/getProductkindByPrimaryKey",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getProductkindByPrimaryKey(String kindid){
        System.out.println("----进入getProductkindByPrimaryKey");
        int kindId = Integer.parseInt(kindid);
        Productkind pk = pks.selectByPrimaryKey(kindId);
        System.out.println("----Productkind = "+pk);
        String js;
        js = JSON.toJSONString(pk);
        return js;
    }


    @RequestMapping(value="/getAllProduct",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAllProduct(){
        System.out.println("----getAllProduct");
        List<Productkind> list = pks.selectAll();
        System.out.println("----AllProduct = "+list);
        String js;
        js = JSON.toJSONString(list);
        return js;
    }


    @RequestMapping(value="/getAllProductImg",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAllProductImg(){
        System.out.println("----getAllProductImg");
        List<Productinfo> list = pis.selectAll();
        System.out.println("----AllProductImg = "+list);
        redisClient.set("dqdq",123);
        String js;
        js = JSON.toJSONString(list);
        return js;
    }


    @RequestMapping(value="/getProductImgBySeriesId",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getProductImgBySeriesId(String seriesid){
        System.out.println("----getProductImgBySeriesId");
        List<Productinfo> list = pis.selectBySeriesId(Integer.parseInt(seriesid));
        System.out.println("----getProductImgBySeriesId = "+list);
        String js;
        js = JSON.toJSONString(list);
        return js;
    }

    @RequestMapping(value="/getAllSeries",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAllSeries(){
        System.out.println("----getAllSeries");
        List<Productseries> list = pss.selectAll();
        System.out.println("----AllSeries = "+list);
        String js;
        js = JSON.toJSONString(list);
        return js;
    }

    @RequestMapping(value="/getAllTastes",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAllTastes(){
        System.out.println("----getAllTastes");
        List<Productinfo> list = pis.selectAll();
        List<String> allTastes = new ArrayList();
        for(Productinfo p:list){
            if(p.getProducttaste() != null){
                allTastes.add(p.getProducttaste());
            }
        }
        System.out.println("----AllTastes = "+allTastes);
        String js;
        js = JSON.toJSONString(allTastes);
        return js;
    }

    @RequestMapping(value="/getproductsbycondition",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getproductsbycondition(@RequestParam Map<String,String> mp){
        System.out.println("----getproductsbycondition");
        System.out.println("----mp"+mp);
        List<Productinfo> list = pis.selectByIf(mp);
        System.out.println("----productsbycondition = "+list);
        String js;
        js = JSON.toJSONString(list);
        return js;
    }

    @RequestMapping(value="/setinbuycar",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String setinbuycar(String productinputnum,String pid){
        System.out.println("----setinbuycar");
        System.out.println("----productinputnum = "+productinputnum+",  pid = "+pid);
        GdvCar gdvcar = new GdvCar();
        Productinfo productinfo = pis.selectByPrimaryKey(Integer.parseInt(pid));
        String imgsrc = productinfo.getProductimgs().get(0).getImgsrc();
        System.out.println("----productinfo = "+productinfo);
        gdvcar.setUserId(1);
        gdvcar.setProductid(productinfo.getProductid());
        gdvcar.setProductprice(productinfo.getProductprice());
        gdvcar.setProductname(productinfo.getProductname());
        gdvcar.setImgsrc(imgsrc);
        gdvcar.setcNumber(Integer.parseInt(productinputnum));
        gdvcar.setcPrice(Integer.parseInt(productinputnum)*productinfo.getProductprice().longValue());
        int i = gcs.insertSelective(gdvcar);
        String js;
        js = JSON.toJSONString(i);
        return js;
    }
}
