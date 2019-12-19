package com.ahas.sentinel.core.init;

import com.alibaba.csp.sentinel.init.InitExecutor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author licong
 * @date 2019-12-19 5:14 下午
 */
@Component
@Log4j2
public class SentinelCommand implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Sentinel init ... ");
        InitExecutor.doInit();
    }
}
