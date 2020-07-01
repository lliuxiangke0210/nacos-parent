/**
 * 
 */
package org.nacos.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liuxk
 *
 * @version 2020年7月1日 上午10:26:57
 *
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProvideApplication.class, args);
	}

}
