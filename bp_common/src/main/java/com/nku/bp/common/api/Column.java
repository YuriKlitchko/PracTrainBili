package com.nku.bp.common.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target({FIELD})//表示注解只能用在属性上
@Retention(RetentionPolicy.RUNTIME)//表示策略，什么时候用
// @interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。
// 方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）
// 可以通过default来声明参数的默认值。
public @interface Column {
    String family() default "info";
    String column() default "";
}
