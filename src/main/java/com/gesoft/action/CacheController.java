package com.gesoft.action;

import com.gesoft.domain.User;
import com.gesoft.utils.DataCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by WCL on 2017/11/1.
 */
@RestController
@RequestMapping("/cache")
public class CacheController {

    private List<User> users = new ArrayList<>();
    @Autowired
    private DataCache dataCache;
    @RequestMapping("/put")
    public String put(Long id, String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return  sdf.format(new Date()) + " : value is " + dataCache.put(id, value) ;
    }

    @RequestMapping("/get")
    public String query(Long id){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date()) + " : value is " +dataCache.query(id) ;
    }

    @RequestMapping("/remove")
    public String remove(Long id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dataCache.remove(id) ;
        return sdf.format(new Date()) + " : success " ;
    }
    @PostConstruct
    void init()
    {
        users.add(new User(1L, "www1", 22));
        users.add(new User(2L, "www2", 23));
        users.add(new User(3L, "www3", 24));
        users.add(new User(4L, "www4", 25));
        System.out.println("PostConstruct======================init===========");
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User index(@PathVariable("id") Long id) {

        User user=  findById(id);

        return user;
    }

    @Cacheable(value = "user", key = "#id")
    public User findById(final Long id) {
        System.out.println("cache miss, invoke find by id, id:" + id);
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}
