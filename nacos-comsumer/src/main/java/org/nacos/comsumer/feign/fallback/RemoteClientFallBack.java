/**
 * 
 */
package org.nacos.comsumer.feign.fallback;

import org.nacos.comsumer.feign.RemoteClient;
import org.springframework.stereotype.Component;

/**
 * @author liuxk
 *
 * @version 2020年7月1日 上午10:48:57
 *
 * @description:
 */
@Component
public class RemoteClientFallBack implements RemoteClient {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.nacos.comsumer.feign.RemoteClient#helloNacos()
	 */
	public String helloNacos() {

		return "请求超时了";
	}

}
