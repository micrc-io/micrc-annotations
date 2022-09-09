package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 出逻辑参数转换
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface TargetMapping {

    /**
     * 映射键
     *
     * @return
     */
    String name();

    /**
     * 映射值 - jsonpath
     *
     * @return
     */
    String mapping();
}
