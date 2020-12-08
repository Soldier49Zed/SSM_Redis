package com.houx.dao;

import com.houx.pojo.RedPacket;
import org.springframework.stereotype.Repository;

/**
 * @Author: HouX
 * @Date: 2020/12/8
 * @Description:
 */
@Repository
public interface RedPacketDao {

    /**
     * 获取红包信息
     * @param id 红包id
     * @return 红包具体信息
     */
    public RedPacket getRedPacket(Long id);


    /**
     * 扣减抢红包数
     * @param id 红包id
     * @return 更新记录条数
     */
    public int decreaseRedPacket(Long id);


}
