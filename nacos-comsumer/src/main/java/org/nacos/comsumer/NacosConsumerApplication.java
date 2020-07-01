/**
 * 
 */
package org.nacos.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuxk
 *
 * @version 2020年7月1日 上午10:40:16
 *
 * @description:
 */

@SpringBootApplication
@EnableFeignClients
public class NacosConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerApplication.class, args);
	}

}
