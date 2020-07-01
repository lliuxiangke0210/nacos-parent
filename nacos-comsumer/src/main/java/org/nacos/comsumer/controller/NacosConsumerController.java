/**
 * 
 */
package org.nacos.comsumer.controller;

import org.nacos.comsumer.feign.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxk
 *
 * @version 2020年7月1日 上午10:40:16
 *
 * @description:
 */

@RestController
public class NacosConsumerController {

	@Autowired
	private RemoteClient remoteClient;

	@GetMapping("/feign")
	public String test() {
		return remoteClient.helloNacos();
	}

}
