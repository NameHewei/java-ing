package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * { @link User }
 */
@Repository
public class UserRepository {

    /**
     * 采用内存型存储 -> Map
     */
    private final ConcurrentHashMap<Integer, User> repository = new ConcurrentHashMap<>();

    /**
     * 自增长的id
     */
    private final static AtomicInteger idAtomic = new AtomicInteger();

    /**
     * 保存用户
     * @param user 用户
     * @return 返回成功或失败
     */
    public boolean save(User user) {
        /* id 从1开始 */
        Integer id = idAtomic.incrementAndGet();

        user.setId(id);

        return repository.put(id, user) == null;
    }

    /**
     * @return 返回所有用户的集合
     */
    public Collection<User> findAllUser() {
        return repository.values();
    }
}
