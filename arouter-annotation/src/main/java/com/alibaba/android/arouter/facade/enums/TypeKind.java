package com.alibaba.android.arouter.facade.enums;

/**
 * Kind of field type.
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 2017-03-16 19:13:38
 *
 * 目标Class的需要注入的参数的参数类型
 */
public enum TypeKind {
    // Base type  基本类型
    BOOLEAN,
    BYTE,
    SHORT,
    INT,
    LONG,
    CHAR,
    FLOAT,
    DOUBLE,

    // Other type  封装类型
    STRING,
    PARCELABLE,
    OBJECT;     //使用Json解析
}
