package com.ahas.sentinel.core.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * @author licong
 * @date 2019-12-19 3:47 下午
 */
@Service
@Log4j2
public class SentinelService {

    @SentinelResource(value = "access", blockHandler = "blockHandler")
    public void access() {
        log.info("access");
    }

    public void blockHandler(BlockException ex) {
        ex.printStackTrace();
        log.info("fallback");
    }

}
