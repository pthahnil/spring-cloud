package com.xrcraft.cloud.service;

import com.xrcraft.cloud.service.fallback.FallbackDemoService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pthahnil on 2019/6/6.
 */
@FeignClient(value = "service-hi", fallback = FallbackDemoService.class)
public interface DemoService {

	@RequestMapping(value = "/demo/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
