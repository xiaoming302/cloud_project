package con.luying.cloud.external.user.service;

import con.luying.cloud.external.user.dto.Person;
import con.luying.cloud.external.user.service.fallback.ExternalPersonServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/27 下午3:24
 * @modified
 */
@FeignClient(value = "server-user", url = "http://localhost:8781", fallback = ExternalPersonServiceFallback.class)
public interface ExternalPersonService {

    /**
     * 查询组织架构用户
     *
     * @param searchColumn 查询的字段
     * @param searchValue  查询的数据
     * @return
     */
    @RequestMapping(value = "/person/findPerson", method = RequestMethod.GET)
    public Person findPerson(@RequestParam("searchColumn") String searchColumn,
                             @RequestParam("searchValue") String searchValue);

}
