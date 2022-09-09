package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 衍生集成注解
 *
 * @author tengwang
 * @version 1.0.0
 * @date 2022/8/31 14:28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface DeriveIntegration {

    /**
     * openApi协议
     *
     * @return
     */
    String protocolPath();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return
     */
    int order() default 0;

    /**
     * 对象图路径
     *
     * @return
     */
    String objectTreePath() default "/";
}
