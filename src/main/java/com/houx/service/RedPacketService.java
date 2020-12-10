package com.houx.service;

import com.houx.pojo.RedPacket;

/**
 * @Author: HouX
 * @Date: 2020/12/8
 * @Description:
 */
public interface RedPacketService {

    /**
     * 获取红包
     *
     * @param id 编号
     * @return 红包信息
     */
    public RedPacket getRedPacket(Long id);

    /**
     * 扣减红包
     *
     * @param id 编号
     * @return 影响条数
     */
    public int decreaseRedPacket(Long id);

    int decreaseRedPacketForVersion(Long redPacketId,Long userId);

}
