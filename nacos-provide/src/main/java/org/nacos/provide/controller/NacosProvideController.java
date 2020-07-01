/**
 * 
 */
package org.nacos.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxk
 *
 * @version 2020年7月1日 上午10:29:15
 *
 * @description:
 */
@RestController
public class NacosProvideController {

	@GetMapping("/helloNacos")
	public String helloNacos() {

		return "hello ,nacos!";
	}

}
