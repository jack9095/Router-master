package com.alibaba.android.arouter.facade.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a interceptor to interception the route.
 * BE ATTENTION : This annotation can be mark the implements of #{IInterceptor} ONLY!!!
 *
 * @Interceptor 是拦截器注解，拦截器是全应用全局的，不分module，只要集成进apk就起效
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 16/8/23 14:03
 * https://blog.csdn.net/sw5131899/article/details/54947192
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Interceptor {
    /**
     * The priority of interceptor, ARouter will be excute them follow the priority.
     * 该拦截器的优先级
     */
    int priority();

    /**
     * The name of interceptor, may be used to generate javadoc.
     * 该拦截器的名称，用于产生JavaDoc
     */
    String name() default "Default";
}
