package com.dao;

import com.entity.Productinfo;

import java.util.*;

public interface IProductinfoDao {
    List<Productinfo> selectAll();
    List<Productinfo> selectBySeriesId(Integer seriesid);
    List<Productinfo> selectByIf(Map mp);
    Productinfo selectByPrimaryKey(Integer pid);
}
