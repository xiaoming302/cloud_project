package com.luying.cloud.common.domain.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午4:03
 * @modified
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Event {
    String value() default "";
}
