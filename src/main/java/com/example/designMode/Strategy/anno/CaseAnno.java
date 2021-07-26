package com.example.designMode.Strategy.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CaseAnno {
    String value() default "";
}
