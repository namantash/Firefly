package com.meituan.firefly.testfirefly;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.meituan.firefly.annotations.*;


public class OrderedStruct implements Serializable {
        
    @Field(id = 1, required = true, name = "id")
    public Integer id;
}