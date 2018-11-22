/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestAPIs {
	@GetMapping("/")
	  public String index() {
	    return "Spring in Action";
	  }
		@GetMapping("/students")
	  public String available() {
	    return "Spring in Action";
	  }

	  @RequestMapping(value = "/checked-out")
	  public String checkedOut() {
	    return "Spring Boot in Action";
	  }
}
