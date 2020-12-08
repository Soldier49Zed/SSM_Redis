package com.houx.dao;

import com.houx.pojo.UserRedPacket;
import org.springframework.stereotype.Repository;

/**
 * @Author: HouX
 * @Date: 2020/12/8
 * @Description:
 */
@Repository
public interface UserRedPacketDao {

    /**
     * 插入抢红包信息
     * @param userRedPacket 抢红包信息
     * @return 影响记录数
     */
    public int grapRedPacket(UserRedPacket userRedPacket);

}
