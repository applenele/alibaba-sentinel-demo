package com.smallcode.sample.sentienel.controller;

import com.smallcode.sample.sentienel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenny
 * @Title: HomeController
 * @ProjectName alibaba-sentinel-demo
 * @date 2018-12-28 16:35
 **/
@RestController
public class HomeController {

  @Autowired
  private TestService service;

  @GetMapping("/foo")
  public String foo() throws Exception {
    service.test();
    return service.hello(System.currentTimeMillis());
  }

}
