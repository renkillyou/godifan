package com.dao;

import com.entity.*;
import java.util.*;

public interface IProductkindDao {
    List<Productkind> selectAll();
    Productkind selectByPrimaryKey(Integer kindid);
}
