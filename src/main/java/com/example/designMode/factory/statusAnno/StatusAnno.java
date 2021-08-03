package com.example.designMode.factory.statusAnno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StatusAnno {
    String value() default "";
}
