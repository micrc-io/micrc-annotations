package io.micrc.core.annotations.integration.command;

import java.lang.annotation.*;

/**
 * 领域概念
 *
 * @author tengwang
 * @date 2022/9/5 11:50
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface Conception {

    /**
     * 概念名称
     *
     * @return
     */
    String name();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return
     */
    int order() default Integer.MAX_VALUE;

    /**
     * 转换至命令对象内部路径-默认为概念名称在根路径
     *
     * @return
     */
    String commandInnerName() default "";

    /**
     * 转换对端概念映射
     *
     * @return
     */
    String targetConceptionMappingPath() default "";
}
