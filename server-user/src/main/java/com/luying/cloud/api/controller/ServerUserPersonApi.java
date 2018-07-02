package com.luying.cloud.api.controller;

import com.luying.cloud.api.dto.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Date;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/25 下午8:00
 * @modified
 */
@Api(tags = "personApi")
@Controller
@RequestMapping("/person")
public class ServerUserPersonApi {
    private static final Logger logger = LoggerFactory.getLogger(ServerUserPersonApi.class);

    @ApiOperation(value = "findPerson", notes = "根据关键字查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "searchColumn", value = "查询字段，目前支持loginName、personNo;",
                    paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "searchValue", value = "要查询的值", paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/findPerson", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Person findPerson(@RequestParam(name = "searchColumn") String searchColumn,
                             @RequestParam(name = "searchValue") String searchValue) {
        Person person = new Person();
        person.setFdName("张三");
        person.setFdLoginName("zhangsan");
        person.setFdAge(23);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -23);
        person.setFdBirthday(calendar.getTime());
        person.setFdJoinedDate(new Date());
        person.setFdNo("test_01");
        person.setFdSex("M");
        person.setFdEmail("123@qq.com");
        person.setEnabled(true);
        person.setNonLocked(true);
        person.setNonExpired(true);
        return person;
    }

}
