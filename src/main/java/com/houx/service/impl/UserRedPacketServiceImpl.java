package com.houx.service.impl;

import com.houx.dao.RedPacketDao;
import com.houx.dao.UserRedPacketDao;
import com.houx.pojo.RedPacket;
import com.houx.pojo.UserRedPacket;
import com.houx.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: HouX
 * @Date: 2020/12/8
 * @Description:
 */
@Service
public class UserRedPacketServiceImpl implements UserRedPacketService {

    @Autowired
    private UserRedPacketDao userRedPacketDao = null;

    @Autowired
    private RedPacketDao redPacketDao = null;

    //失败
    private static final int FAILED = 0;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public int grapRedPacket(Long redPacketId, Long userId) {
        //获取红包信息
        RedPacket redPacket = redPacketDao.getRedPacket(redPacketId);
        //当前小红包库存大于0
        if (redPacket.getStock() > 0){
            redPacketDao.decreaseRedPacket(redPacketId);
            //生成抢红包信息
            UserRedPacket userRedPacket = new UserRedPacket();
            userRedPacket.setRedPacketId(redPacketId);
            userRedPacket.setUserId(userId);
            userRedPacket.setAmount(redPacket.getUnitAmount());
            userRedPacket.setNote("抢红包 " + redPacketId);
            //插入抢红包信息
            int result = userRedPacketDao.grapRedPacket(userRedPacket);
            return result;
        }
        //失败返回
        return FAILED;
    }
}
