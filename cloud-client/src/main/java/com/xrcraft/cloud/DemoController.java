package com.xrcraft.cloud;

import com.xrcraft.cloud.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pthahnil on 2019/6/6.
 */
@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return demoService.sayHiFromClientOne(name);
	}

}
