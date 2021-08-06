package com.example.designMode.template.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TempAnno {
    String value() default "";
}
