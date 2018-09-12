package cn.shenyun.sidecar;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value="sidecar")
public interface Sidecar {
	@RequestMapping("/index")//访问sidecar，调用nodeJS欢迎页面
	public String node();
}
