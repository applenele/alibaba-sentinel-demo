package com.smallcode.sample.sentienel.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lenny
 * @Title: AopConfiguration
 * @ProjectName alibaba-sentinel-demo
 * @date 2018-12-28 16:44
 **/
@Configuration
public class AopConfiguration {

  @Bean
  public SentinelResourceAspect sentinelResourceAspect() {
    return new SentinelResourceAspect();
  }

}
