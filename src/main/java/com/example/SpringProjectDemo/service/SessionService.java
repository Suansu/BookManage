package com.example.SpringProjectDemo.service;

import com.example.SpringProjectDemo.entity.Session;
import java.util.List;

/**
 * (Session)表服务接口
 *
 * @author makejava
 * @since 2021-05-18 10:36:24
 */
public interface SessionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Session queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Session> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param session 实例对象
     * @return 实例对象
     */
    Session insert(Session session);

    /**
     * 修改数据
     *
     * @param session 实例对象
     * @return 实例对象
     */
    Session update(Session session);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    Session selectBySessionId(String sessionId);

}