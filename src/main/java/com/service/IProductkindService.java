package com.service;

import com.entity.*;

import java.util.*;

public interface IProductkindService {
    List<Productkind> selectAll();
    Productkind selectByPrimaryKey(Integer kindid);
}
