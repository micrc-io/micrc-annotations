package io.micrc.core.annotations.application;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 时间参数
 *
 * @author hyosunghan
 * @date 2022/10/21 10:15
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface TimeParam {

    /**
     * 时间路径, 列表下标用*表示，模糊键值用#表示（eg:Map的键）
     * eg:/a/b/*, /a/b/#
     *
     * @return
     */
    String[] paths() default {};
}
