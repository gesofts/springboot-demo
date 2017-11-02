package com.gesoft.mapper;

import com.gesoft.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by WCL on 2017/10/31.
 */
@Mapper
public interface UserMapper
{
   User getUserById(long id);
}
