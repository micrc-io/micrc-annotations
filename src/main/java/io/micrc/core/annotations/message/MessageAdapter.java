package io.micrc.core.annotations.message;

import java.lang.annotation.*;

/**
 * 消息适配器注解
 *
 * @author tengwang
 * @date 2022/9/5 10:45
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MessageAdapter {

    /**
     * 是否启用自定义实现
     *
     * @return boolean
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return string
     */
    String routeProtocol() default "message";


    /**
     * 业务服务全路径 和 事件名称组
     *
     * @return adapter []
     */
    Adapter[] value() default {};
}
