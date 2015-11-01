package com.github.lyra.endpoint;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

  @RequestMapping("/hello/{name}")
  public String hello(@PathVariable String name) {
    return "Hello, " + name + "!"; //$NON-NLS-1$ //$NON-NLS-2$
  }
}
