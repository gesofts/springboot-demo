package com.gesoft.mapper;

import com.gesoft.domain.Todo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by WCL on 2017/10/31.
 */
@Mapper
public interface TodoMapper {
    void insert(Todo todo);
    Todo select(int id);
}
