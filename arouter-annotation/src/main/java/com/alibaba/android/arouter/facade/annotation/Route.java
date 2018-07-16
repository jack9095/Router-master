package com.alibaba.android.arouter.facade.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a page can be route by router.
 * @Route 是 ARouter 最重要的注解，也是路由最基本的节点，该注解主要用于描述路由中的路径URL信息，使用该注解标注的类将被自动添加至路由表中。
 *  值得说明的一点是 ARouter 并非仅提供页面（Activity）的路由功能，还可以用来路由模块想要暴露给其他模块调用的接口。
 *  也就是说 @Route 不仅可用于 Activity 类，还可用于模块对外接口的实现类，实现类似于 AIDL 的功能，也就是IOC
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 16/8/15 下午9:29
 * https://blog.csdn.net/sw5131899/article/details/54947192
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Route {

    /**
     * Path of route
     * 路径URL字符串
     */
    String path();

    /**
     * Used to merger routes, the group name MUST BE USE THE COMMON WORDS !!!
     * 组名，默认为一级路径名；一旦被设置，跳转时必须赋值
     */
    String group() default "";

    /**
     * Name of route, used to generate javadoc.
     * 该路径的名称，用于产生JavaDoc
     */
    String name() default "undefined";

    /**
     * Extra data, can be set by user.
     * Ps. U should use the integer num sign the switch, by bits. 10001010101010
     * 额外配置的开关信息；譬如某些页面是否需要网络校验、登录校验等
     */
    int extras() default Integer.MIN_VALUE;

    /**
     * The priority of route.
     * 该路径的优先级
     */
    int priority() default -1;
}
