package con.luying.cloud.external.user.service.fallback;

import con.luying.cloud.external.user.dto.Person;
import con.luying.cloud.external.user.service.ExternalPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/27 下午5:16
 * @modified
 */
@Component
public class ExternalPersonServiceFallback implements ExternalPersonService {
    private static final Logger logger = LoggerFactory.getLogger(ExternalPersonServiceFallback.class);

    @Override
    public Person findPerson(String searchColumn, String searchValue) {
        logger.error("用户服务调用失败，请检查相服务关节点是否异常！");
        Person person = new Person();
        person.setFdName("匿名用户");
        person.setFdLoginName("anonymous");
        return person;
    }
}
