package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 仓库集成注解
 *
 * @author tengwang
 * @date 2022/12/15 16:02
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface RepositoryIntegration {

    /**
     * ID路径
     *
     * @return string
     */
    String idPath();

    /**
     * 参数不存在则忽略
     *
     * @return boolean
     */
    boolean ignoreIfParamAbsent() default false;

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return int
     */
    int order() default Integer.MAX_VALUE;
}
