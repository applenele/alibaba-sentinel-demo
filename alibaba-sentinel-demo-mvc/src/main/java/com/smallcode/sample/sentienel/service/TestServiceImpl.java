package com.smallcode.sample.sentienel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

/**
 * @author lenny
 * @Title: TestServiceImpl
 * @ProjectName alibaba-sentinel-demo
 * @Description: TODO
 * @date 2018-12-28 16:36
 **/
@Service
public class TestServiceImpl implements TestService {

  @SentinelResource(value = "test", blockHandler = "handleException", blockHandlerClass = {
      ExceptionUtil.class})
  @Override
  public void test() {
    System.out.println("Test");
  }

  @Override
  @SentinelResource(value = "hello", blockHandler = "exceptionHandler")
  public String hello(long s) {
    return String.format("Hello at %d", s);
  }

  public String exceptionHandler(long s, BlockException ex) {
    // Do some log here.
    ex.printStackTrace();
    return "Oops, error occurred at " + s;
  }



}
