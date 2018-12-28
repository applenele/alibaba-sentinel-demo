package com.smallcode.sample.sentienel.service;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author lenny
 * @Title: ExceptionUtil
 * @ProjectName alibaba-sentinel-demo
 * @date 2018-12-28 16:37
 **/
public class ExceptionUtil {


  public static void handleException(BlockException ex) {
    System.out.println("Oops: " + ex.getClass().getCanonicalName());
  }
}
