package com.gesoft.mapper;


import com.gesoft.domain.DemoInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * 操作数据库.
 * Created by WCL on 2017/11/2.
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {
}
