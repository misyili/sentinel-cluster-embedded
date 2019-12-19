package com.ahas.sentinel.core.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;


/**
 * 普通接口埋点
 * @author licong
 * @date 2019/12/19 3:41 下午
 */
// 1. 配置 SentinelResourceAspect（需要先引入 Spring AOP 并开启）
//@Configuration
public class SentinelAspectConfiguration {
  @Bean
  public SentinelResourceAspect sentinelResourceAspect() {
    return new SentinelResourceAspect();
  }
}
