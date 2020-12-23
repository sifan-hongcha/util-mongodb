package com.hongcha.mongodb.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@MongoDbConditionsAnnotation
public @interface Lte {
    // 字段的名称
    String value() default "";
}
