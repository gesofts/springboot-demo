package com.gesoft.service;

import com.gesoft.domain.Pivs;
import com.gesoft.mapper.PivsMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WCL on 2017/11/2.
 */
@Service
public class PivsService {

    @Autowired
    private PivsMapper pivsMapper;

    public int addPivs(String pivName, String pivNo)
    {
        return pivsMapper.addPivs(pivName, pivNo);
    }

    public Pivs findById(String id)
    {
        return  pivsMapper.findById(id);
    }

    public void updataById(String id,String pivName)
    {
        pivsMapper.updataById(id, pivName);
    }

    public void deleteById(String id)
    {
        pivsMapper.deleteById(id);
    }
}
