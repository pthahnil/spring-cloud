package com.xrcraft.cloud.service.fallback;

import com.xrcraft.cloud.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by pthahnil on 2019/6/6.
 */
@Component
public class FallbackDemoService implements DemoService {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry,MR/MS:" + name + ", an error occured!!" ;
	}
}
