package com.gesoft.mapper;

import com.gesoft.domain.Pivs;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.cache.annotation.Cacheable;

@Mapper
@CacheConfig(cacheNames = "pivs")
public interface PivsMapper {
    @Insert("insert into pivs(pivName,pivNo) values(#{pivName},#{pivNo})")
    int addPivs(@Param("pivName")String pivName,@Param("pivNo")String pivNo);

    @Select("select * from pivs where id =#{id}")
    @Cacheable(key ="#p0")
    Pivs findById(@Param("id") String id);

    @CachePut(key = "#p0")
    @Update("update pivs set pivName=#{pivName} where id=#{id}")
    void updataById(@Param("id")String id,@Param("pivName")String pivName);

    //如果指定为 true，则方法调用后将立即清空所有缓存
    @CacheEvict(key ="#p0",allEntries=false)
    @Delete("delete from pivs where id=#{id}")
    void deleteById(@Param("id")String id);
}
