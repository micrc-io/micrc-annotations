package io.micrc.core.annotations.application.derivations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 查询逻辑
 *
 * @author hyosunghan
 * @date 2022/9/16 16:18
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface QueryLogic {

    /**
     * 仓库全类名
     *
     * @return
     */
    String repositoryFullClassName();

    /**
     * 参数映射文件
     *
     * @return
     */
    String[] paramMappingFile() default {};

    /**
     * 参数名称，即集成结果对应的键名称
     *
     * @return
     */
    String name();

    /**
     * 方法名
     *
     * @return
     */
    String methodName();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return
     */
    int order() default Integer.MAX_VALUE;
}
