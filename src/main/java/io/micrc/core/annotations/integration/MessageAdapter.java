package io.micrc.core.annotations.integration;

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
     * @return
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return
     */
    String routeProtocol() default "message";

    /**
     * 应用服务名称 - 类简写名(SimpleName)
     *
     * @return
     */
    String serviceName();

    /**
     * 执行根实体
     *
     * @return
     */
    String rootEntityName();

    /**
     * 事件名称
     *
     * @return
     */
    String event();

    /**
     * 是否顺序消费
     *
     * @return
     */
    boolean ordered() default false;
}
