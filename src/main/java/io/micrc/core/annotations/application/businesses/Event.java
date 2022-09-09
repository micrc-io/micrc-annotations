package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 所需发送领域事件
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface Event {

    /**
     * 事件名称
     *
     * @return
     */
    String name();

    /**
     * 接收方名称
     *
     * @return
     */
    String reception();

    /**
     * 对端映射
     *
     * @return
     */
    String mapping();

    /**
     * 事件场景
     *
     * @return
     */
    String scene() default "";

    /**
     * 是否顺序发送
     *
     * @return
     */
    boolean ordered() default false;

}
