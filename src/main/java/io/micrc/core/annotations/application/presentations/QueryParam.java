package io.micrc.core.annotations.application.presentations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 查询参数
 *
 * @author hyosunghan
 * @date 2022/9/5 10:15
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface QueryParam {

    /**
     * 当前参数所属概念
     *
     * @return
     */
    String belongConcept();

    /**
     * 参数名称
     *
     * @return
     */
    String name();

    /**
     * 参数取值所在路径
     *
     * @return
     */
    String path();
}
