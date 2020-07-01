/**
 * 
 */
package org.nacos.comsumer.feign;

import org.nacos.comsumer.feign.fallback.RemoteClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuxk
 *
 * @version 2020年7月1日 上午10:48:57
 *
 * @description:
 */
@FeignClient(name = "nacos-provide", fallback = RemoteClientFallBack.class)
public interface RemoteClient {
	@GetMapping("/helloNacos")
	String helloNacos();

}
