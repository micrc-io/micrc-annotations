package io.micrc.core.annotations.application.derivations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 排序参数
 *
 * @author hyosunghan
 * @date 2022/9/16 16:15
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface SortParam {

    /**
     * 当前参数所属概念
     *
     * @return
     */
    String belongConcept() default "";

    /**
     * 参数名称
     *
     * @return
     */
    String name();

    /**
     * 该参数排序类型
     *
     * @return
     */
    Type type();

    /**
     * 排序类型
     */
    enum Type {
        /**
         * 顺序
         */
        ASC,
        /**
         * 倒序
         */
        DESC,
    }
}
